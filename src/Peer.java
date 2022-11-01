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
    private int peerID;

    public Peer(CommonProps commonProps, int peerID) {
        this.commonProps = commonProps;
        this.peerID = peerID;
    }

    public void setPreferredNeighbors(ArrayList<Integer> preferredNeighbors) {
        this.preferredNeighbors = preferredNeighbors;
    }
    public void setOptimisticNeighbor(int optimisticNeighbor) {
        this.optimisticNeighbor = optimisticNeighbor;
    }


}
