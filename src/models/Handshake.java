package Project.src.models;

public class Handshake {
    private final String header = "P2PFILESHARINGPROJ";
    private final int paddingLength = 10;
    private int peerID;
    private final int messageSize_bytes = 32;

    public Handshake(int peerID) {
        this.peerID = peerID;
    }

    public void setPeerID(int peerID) {
        this.peerID = peerID;
    }

    public int getPeerID() {
        return peerID;
    }

    public byte[] getHandshake() {
        byte[] msg = new byte[32];
        byte[] header =  this.header.getBytes();

        int paddingStartIndex = this.header.length();
        int peerIDStartIndex = this.header.length() + this.paddingLength;

        System.arraycopy(header, 0, msg, 0, this.header.length());
        for (int i=paddingStartIndex; i< paddingStartIndex + this.paddingLength; i++) {
            msg[i] = 0x0;
        }
        // convert to unsigned Int from msg
        msg[peerIDStartIndex] = (byte) ((byte) (this.peerID >> 24) & 0xFF);
        msg[peerIDStartIndex + 1] = (byte) ((byte) (this.peerID >> 16) & 0xFF);
        msg[peerIDStartIndex + 2] = (byte) ((byte) (this.peerID >> 8) & 0xFF);
        msg[peerIDStartIndex + 3] = (byte) ((byte) (this.peerID) & 0xFF);

        return msg;
    }

    // translates message and returns peerID if header matches
    public int translateMessage(byte[] message) {
        StringBuilder header = new StringBuilder();
        int peerIDIndex = this.header.length() + this.paddingLength;
        int peerID = 0;

        for (int i=0; i<this.header.length(); i++) {
            header.append((char) message[i]);
        }

        peerID = ((message[peerIDIndex] << 24) & 0xFF000000) + ((message[peerIDIndex + 1] << 16) & 0x00FF0000)
                + ((message[peerIDIndex + 2] << 8) & 0x0000FF00) + ((message[peerIDIndex + 3]) & 0x000000FF);

        if (header.toString().equals(this.header)) {
            return peerID;
        }
        else {
            return -1;
        }
    }

}
