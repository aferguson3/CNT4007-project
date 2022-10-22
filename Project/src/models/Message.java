package Project.src.models;

import java.io.DataOutputStream;
import java.io.IOException;

public class Message {

    //This is the 3 parts to the message

    int msgLength;
    char msgType;
    //byte[] msgPayload;
    int msgPayload;


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

    public Message()
    {
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

    //This is to get the message payload
    public int getMessagePayload()
    {

        return msgPayload;
    }

    //validate the message
    private int validateMsg()
    {


    /*
    private int validateMsg()  {
        // -1: invalid msg, 0: valid msg

        switch (msgType)
        {
            //these are the different cases of message types
            case CHOKE:
            case UNCHOKE:
            case INTERESTED:
            case NOT_INTERESTED:

                if (msgPayload.length != 0) {

                //The message payload length will return -1 if it does not work
                if (msgPayload.length != 0)
                {
                    return -1;

                }
            case HAVE:

                //If the length is
                if (msgPayload.length != 4)
                {
                    return  -1;

                }
                break;
            case REQUEST:

                //If the case is request...
                if (msgPayload.length != 4)
                {
                    return  -1;

                }
            default:
                //bitfield and request aren't validated

                break;
        }

        return 0;
    }
    */
    public class Choke extends Message {
        public Choke() {

     }

    public class Choke extends Message
    {
        public Choke()
        {
            //These are the three variables that are declared upo
            this.msgType = CHOKE;

            this.msgLength = 0;

            this.msgPayload = NO_PAYLOAD;

        }
    }

    public class Unchoke extends Message
    {
        public Unchoke()
        {
            //This is the same idea as choke but the opposite

            //Choke but reversed

            this.msgLength = 0;

            this.msgType = UNCHOKE;

            this.msgPayload = NO_PAYLOAD;

        }

    }

   public class Interested extends Message
   {
        public Interested()
        {

            //This is the interested part of the bittorrent
            this.msgLength = 0;

            this.msgType = INTERESTED;

            this.msgPayload = NO_PAYLOAD;

        }


   }

   public class NotInterested extends Message
   {
        public NotInterested()
        {
            //Similar idea to choke and unchoke
            this.msgLength = 0;

            this.msgType = NOT_INTERESTED;

            this.msgPayload = NO_PAYLOAD;

        }

   }

   public class Have extends Message{

        public Have()
        {
            this.msgType = HAVE;

        }
   }

   public class Bitfield extends Message
   {

        public Bitfield()
        {

            this.msgType = BITFIELD;
        }
   }

   public class Request extends Message
   {

        public Request(){
            this.msgType = REQUEST;
        }
   }

   public class Piece extends Message
   {
        public Piece()
        {
            this.msgType = PIECE;
        }
   }


}
