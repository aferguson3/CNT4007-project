package Project.src;


import java.io.File;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;



public class Peer {


    private String peerID;
    //This is the peer ID which is the first column

    private String HostName;
    //This is the second column which holds the hostname


    private int portNumber;
    //This is the third column the port number where the peer listens


    private boolean File;
    //This boolean specifies if we have a file or not

    public Peer(String ID) {
        this.peerID = ID;
    }

    void StartPeer()
    {
        //The entire point of this function is to start the peer up



    }

    void StopPeer()
    {
        //This will close the peer when it is necessary


        System.exit(0);
    }

    public String getPeerID()
    {
        //This function returns the peer id
        return peerID;

    }


    public String HostName()
    {
        //This function returns the HostName
        return HostName;

    }


    public int getPortNum()
    {
        //This function returns the port number
        return portNumber;

    }

    public boolean getFile()
    {
        //This gets the forth column
        return File;
    }


}
