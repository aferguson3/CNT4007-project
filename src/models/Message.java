package Project.src.models;

public class Message {

    //This is the 3 parts to the message

    int msgLength;
    char msgType;
    byte[] msgPayload;


    //This is all the different message types in the pdf

    public final char NO_PAYLOAD = 0xFF;
    public final char CHOKE = 0;
    public final char UNCHOKE = 1;
    public final char INTERESTED = 2;
    public final char NOT_INTERESTED = 3;
    public final char HAVE = 4;
    public final char BITFIELD = 5;
    public final char REQUEST = 6;
    public final char PIECE = 7;

    public Message() {
        //This is the public constructor
    }

    //This is an alternative constructor that takes in the message length and char type
    public Message(int msgLength, char msgType) {
        this.msgLength = msgLength;
        this.msgType = msgType;
    }

    //This is to get the message type
    public char getMessageType() {

        return msgType;
    }

    //This is to get the message length
    public int getMessageLength() {

        return msgLength;
    }

    private int validateMsg() {
        // -1: invalid msg, 0: valid msg

        switch (msgType) {
            //these are the different cases of message types
            case CHOKE:
            case UNCHOKE:
            case INTERESTED:
            case NOT_INTERESTED:

                if (msgPayload.length != 0) {

                    //The message payload length will return -1 if it does not work
                    if (msgPayload.length != 0) {
                        return -1;
                    }
                }
            case HAVE:

                //If the length is
                if (msgPayload.length != 4) {
                    return -1;

                }
                break;
            case REQUEST:

                //If the case is request...
                if (msgPayload.length != 4) {
                    return -1;

                }
            default:
                //bitfield and request aren't validated

                break;
        }

        return 0;
    }

}


