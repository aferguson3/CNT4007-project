package Project.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Retains information (hostname, port#, and if it has the file) about all peers in the network

public class PeerInfo {
    private final String trackerFileName = "PeerInfo.cfg";
    private class HostInfo{
        String hostname;
        int port;
        int hasFile;

        HostInfo(String hostname, int port, int hasFile) {
            this.hostname = hostname;
            this.port = port;
            this.hasFile = hasFile;
        }
        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append( String.format("Hostname: %s ", hostname));
            stringBuilder.append( String.format("Port: %s ", port));
            stringBuilder.append( String.format("hasFile: %s ", hasFile));
            return stringBuilder.toString();
        }
    }
    public TreeMap<Integer, HostInfo> tracker;

    public PeerInfo() {
        tracker = new TreeMap<>();
    }

    public void initializeTracker() throws FileNotFoundException {
        String cwd = System.getProperty("user.dir");
        File trackerFile = new File(cwd, trackerFileName);

        if (trackerFile.exists()) {
            Scanner myReader = new Scanner(trackerFile);
            while (myReader.hasNextLine()) {
                ArrayList<String> tempValues = new ArrayList<>();
                String currLine = myReader.nextLine();
                String[] strValues = currLine.split(" ");

                if (strValues.length < 4) {
                    System.out.println("Invalid PeerInfo.cfg");
                    System.exit(-1);
                }

                tempValues.addAll(0, List.of(strValues));
                int peerID = Integer.parseInt(tempValues.get(0));
                HostInfo tempHost = new HostInfo(
                        tempValues.get(1), Integer.parseInt(tempValues.get(2)), Integer.parseInt(tempValues.get(3))
                );
                tracker.put(peerID, tempHost);
            }

        }
        else {
            System.out.printf("Couldn't find %s.", trackerFile);
            System.exit(-1);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Tracker: PeerInfo.cfg: \n");
        for(Map.Entry<Integer, HostInfo> entry : tracker.entrySet() ){
            str.append(String.format("%s: %s \n", entry.getKey(), entry.getValue().toString()));
        }
        return str.toString();
    }
}
