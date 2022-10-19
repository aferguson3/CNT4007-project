package Project.src;

enum MessageType {
    NO_PAYLOAD,
    CHOKE,
    UNCHOKE,
    INTERESTED,
    NOT_INTERESTED,
    HAVE,
    BITFIELD,
    REQUEST,
    PIECE;
}

public class Message {
    private int msgLength;
    private int msgPayload;
    MessageType msgType;

    public Message(int msgLength, MessageType msgType) {
        this.msgLength = msgLength;
        this.msgType = msgType;
    }

}
