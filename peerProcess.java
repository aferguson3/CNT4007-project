package Project;

import Project.src.Peer;
import Project.src.Tracker;
import Project.src.models.CommonProps;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.TreeMap;

public class peerProcess {
    final String configFileName = "Common.cfg";
    Peer peer;
    Tracker tracker = new Tracker();
    private int peerID;

    public peerProcess(int peerID) {
        this.peerID = peerID;
    }

    public CommonProps initializeConfig(CommonProps configProps) throws FileNotFoundException {

        String cwd = System.getProperty("user.dir");
        File configFile = new File(cwd, configFileName);

        if (configFile.exists()) {
            Scanner myReader = new Scanner(configFile);
            while (myReader.hasNextLine()) {
                String currLine = myReader.nextLine();
                String[] stringValues = currLine.split(" ");

                switch (stringValues[0]) {
                    case "NumberOfPreferredNeighbors":
                        configProps.numOfPreferredNeighbors = Integer.parseInt(stringValues[1]);
                        break;
                    case "UnchokingInterval":
                        configProps.unchokingPeriod = Integer.parseInt(stringValues[1]);
                        break;
                    case "OptimisticUnchokingInterval":
                        configProps.optimisicUnchokingPeriod = Integer.parseInt(stringValues[1]);
                        break;
                    case "FileName":
                        configProps.fileName = stringValues[1].toString();
                        break;
                    case "FileSize":
                        configProps.fileSize = Integer.parseInt(stringValues[1]);
                        break;
                    case "PieceSize":
                        configProps.pieceSize = Integer.parseInt(stringValues[1]);
                        break;
                    default:
                        System.out.println("Invalid common.cfg property");
                        System.exit(-2);
                }
            }
        }
        else {
            System.out.printf("Couldn't find %s", configFile);
            System.exit(-1);
        }

        return configProps;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // arg1: peerID
        int peerID = 0;
        switch (args.length) {
            case (0):
                System.out.println("No arguments provided.");
                System.exit(-1);
            case (1):
                try {
                    peerID = Integer.parseInt(args[0]);
                }
                catch (NumberFormatException e) {
                    System.out.println("Invalid peerID.");
                    System.exit(-1);
                }
                break;
            default:
                System.out.println("peerProcess requires only one argument.");
                System.exit(-1);
        }

        peerProcess peerProcess = new peerProcess(peerID);
        CommonProps configProps = peerProcess.initializeConfig(new CommonProps());
        peerProcess.peer = new Peer(configProps, peerID);
        peerProcess.tracker.initializeTracker();


        System.out.println(peerProcess.tracker.toString());
    }
}

