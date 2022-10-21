package Project.src;

public class CommonProperties {
    public int numOfPreferredNeighbors;
    public int unchokingPeriod;
    public int optimisicUnchokingPeriod;
    public String fileName;
    public int fileSize;
    public int pieceSize;

    public CommonProperties (int numOfPN, int unchokingPeriod, int optUnchokingPeriod, String fileName, int fileSize, int pieceSize) {
        this.numOfPreferredNeighbors = numOfPN;
        this.unchokingPeriod = unchokingPeriod;
        this.optimisicUnchokingPeriod = optUnchokingPeriod;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.pieceSize = pieceSize;
    }

}
