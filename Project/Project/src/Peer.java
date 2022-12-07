package Project.src;

import java.io.File;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;

import Project.src.models.CommonProps;

import java.util.ArrayList;

public class Peer {


    CommonProps commonProps;
    ArrayList<Integer> preferredNeighbors;
    private int optimisticNeighbor;
    // setup socket info
    private String peerID;
    //This is the peer ID which is the first column

    private String HostName;
    //This is the second column which holds the hostname


    private int portNumber;
    //This is the third column the port number where the peer listens


    private boolean File;
    //This boolean specifies if we have a file or not

    public Peer(CommonProps commonProps, ArrayList<Integer> preferredNeighbors, int optimisticNeighbor) {
        this.commonProps = commonProps;
        this.preferredNeighbors = preferredNeighbors;
        this.optimisticNeighbor = optimisticNeighbor;

    }
    public Peer(String Values[])
    {
        peerID = Values[0];
        HostName = Values[1];
        portNumber =  Integer.parseInt(Values[2]);
        File = Boolean.valueOf(Values[3]);
    }
    public void setPreferredNeighbors(ArrayList<Integer> preferredNeighbors) {
        this.preferredNeighbors = preferredNeighbors;
    }
    public void setOptimisticNeighbor(int optimisticNeighbor) {
        this.optimisticNeighbor = optimisticNeighbor;
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
