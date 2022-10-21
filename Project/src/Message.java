package Project.src;

import java.io.DataOutputStream;
import java.io.IOException;

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

    public class ChokeMsg extends Message {
        public void Choke() {
            this.msgType = CHOKE;

            this.msgLength = 0;

            this.msgPayload = NO_PAYLOAD;

        }
    }

    public class Unchoke extends Message{
        public void Unchoke(){
            this.msgLength = 0;
            this.msgType = UNCHOKE;
            this.msgPayload = NO_PAYLOAD;
        }

    }

   public class Interested extends Message{
        public void Interested(){
            this.msgLength = 0;
            this.msgType = INTERESTED;
            this.msgPayload = NO_PAYLOAD;
        }


   }

   public class NotInterested extends Message{
        public void NotInterested(){
            this.msgLength = 0;
            this.msgType = NOT_INTERESTED;
            this.msgPayload = NO_PAYLOAD;
        }

   }

   public class Have extends Message{

        public void Have(){
            this.msgType = HAVE;

        }
   }

   public class Bitfield extends Message{
        public void Bitfield(){
            this.msgType = BITFIELD;
        }
   }

   public class Request extends Message{
        public void Request(){
            this.msgType = REQUEST;
        }
   }

   public class Piece extends Message{
        public void Piece(){
            this.msgType = PIECE;
        }
   }

}
