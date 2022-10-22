package Project.src.models;

public class CommonProps {
    public int numOfPreferredNeighbors;
    public int unchokingPeriod; //seconds
    public int optimisicUnchokingPeriod; //seconds
    public String fileName;
    public int fileSize;
    public int pieceSize;

    public CommonProps() {

    }
    public CommonProps(int numOfPN, int unchokingPeriod, int optUnchokingPeriod, String fileName, int fileSize, int pieceSize) {
        this.numOfPreferredNeighbors = numOfPN;
        this.unchokingPeriod = unchokingPeriod;
        this.optimisicUnchokingPeriod = optUnchokingPeriod;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.pieceSize = pieceSize;
    }
    public String toString() {
        return String.format("Common.cfg properties: \n" +
                "numOfPreferredNeighbors: %d, unchokingPeriod: %d, optimisicUnchokingPeriod: %d \n" +
                "fileName: %s, fileSize: %d, pieceSize: %d",
                numOfPreferredNeighbors, unchokingPeriod, optimisicUnchokingPeriod, fileName, fileSize, pieceSize);
    }

}
