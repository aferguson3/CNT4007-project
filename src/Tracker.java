package Project.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Tracker {
    public TreeMap<Integer, ArrayList<String>> tracker;
    private final String trackerFileName = "PeerInfo.cfg";

    public Tracker() {
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


                tempValues.addAll(0, List.of(strValues));
                int peerID = Integer.parseInt(tempValues.get(0));
                tempValues.remove(0);
                tracker.put(peerID, tempValues);
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
        str.append("PeerInfo.cfg: \n");
        for(Map.Entry<Integer, ArrayList<String>> entry : tracker.entrySet() ){
            str.append(String.format("%s: %s, \n", entry.getKey(), entry.getValue().toString()));
        }
        return str.toString();
    }
}
