package Project.src;

public class Message {
    private int msgLength;
    private char msgType;
    private int msgPayload;

    public final char NO_PAYLOAD = 0xFF;
    public final char CHOKE = 0;
    public final char UNCHOKE = 1;
    public final char INTERESTED = 2;
    public final char NOT_INTERESTED = 3;
    public final char HAVE = 4;
    public final char BITFIELD = 5;
    public final char REQUEST = 6;
    public final char PIECE = 7;

    public Message(int msgLength, char msgType) {
        this.msgLength = msgLength;
        this.msgType = msgType;
    }

}
