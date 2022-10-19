package Project.src;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public class HandShake {
    private final String header = "P2PFILESHARINGPROJ";
    private final int paddingLength = 10;
    private int peerID;
    private int messageSize_bytes = 32;

    public HandShake(int peerID) {
        this.peerID = peerID;
    }

    public void setPeerID(int peerID) {
        this.peerID = peerID;
    }

    public int getPeerID() {
        return peerID;
    }

    public byte[] getMessage() {
        byte[] msg = new byte[32];
        byte[] header =  this.header.getBytes();
        byte[] peerIdBytes = ByteBuffer.allocate(4).putInt(this.peerID).array();

        int paddingStartIndex = this.header.length();
        int peerIDStartIndex = this.header.length() + this.paddingLength;

        for (int i=0; i< this.header.length(); i++) {
            msg[i] = header[i];
        }
        for (int i=paddingStartIndex; i< paddingStartIndex + this.paddingLength; i++) {
            msg[i] = 0x0;
        }
        for (int i = peerIDStartIndex; i < peerIDStartIndex + 4; i++) {
            msg[i] = peerIdBytes[i - peerIDStartIndex];
        }
        return msg;
    }

    public static void main(String[] args) {
        HandShake temp = new HandShake(1234);
        System.out.println(Arrays.toString(temp.getMessage()));
    }
}
