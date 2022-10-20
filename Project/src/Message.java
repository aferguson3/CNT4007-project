package Project.src;

import java.util.ArrayList;

public class Message {
    private int msgLength;
    private byte msgType;
    byte[] msgPayload;

    static final byte CHOKE = 0;
    static final byte UNCHOKE = 1;
    static final byte INTERESTED = 2;
    static final byte NOT_INTERESTED = 3;
    static final byte HAVE = 4;
    static final byte BITFIELD = 5;
    static final byte REQUEST = 6;
    static final byte PIECE = 7;

    public Message(int msgLength, byte msgType, byte[] payload) {
        this.msgLength = msgLength;
        this.msgType = msgType;
        this.msgPayload = payload;
    }
    public byte getMsgType() {
        return msgType;
    }
    public byte[] getMsgPayload() {
        return msgPayload;
    }
    private int validateMsg()  {
        // -1: invalid msg, 0: valid msg
        switch (msgType) {
            case CHOKE:
            case UNCHOKE:
            case INTERESTED:
            case NOT_INTERESTED:
                if (msgPayload.length != 0) {
                    return -1;
                }
            case HAVE:
                if (msgPayload.length != 4) {
                    return  -1;
                }
                break;
            case REQUEST:
                if (msgPayload.length != 4) {
                    return  -1;
                }
            default:
                //bitfield and request aren't validated
                break;
        }
        return 0;
    }

}
