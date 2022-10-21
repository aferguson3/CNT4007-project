package Project.src;

public class Message {
    int msgLength;
    char msgType;
    int msgPayload;

    public final char NO_PAYLOAD = 0xFF;
    public final char CHOKE = 0;
    public final char UNCHOKE = 1;
    public final char INTERESTED = 2;
    public final char NOT_INTERESTED = 3;
    public final char HAVE = 4;
    public final char BITFIELD = 5;
    public final char REQUEST = 6;
    public final char PIECE = 7;
    public Message()
    {

    }
    public Message(int msgLength, char msgType) {
        this.msgLength = msgLength;
        this.msgType = msgType;
    }

    public char getMessageType() {
        return msgType;
    }

    public int getMessageLength() {
        return msgLength;
    }

    public int getMessagePayload() {
        return msgPayload;
    }
    class Choke extends Message {
        public Choke() {
            this.msgType = CHOKE;

            this.msgLength = 0;

            this.msgPayload = 0;

        }

        public void sendmsg()
        {
            HandShake.getMessage();
        }

    }

}
