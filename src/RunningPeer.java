package Project.src;


import Project.src.models.CommonProps;

import java.util.ArrayList;

public class RunningPeer {

    CommonProps commonProps;
    ArrayList<Integer> preferredNeighbors;
    private int optimisticNeighbor;
    // setup socket info
    private int peerID;

    public RunningPeer(CommonProps commonProps, int peerID) {
        this.commonProps = commonProps;
        this.peerID = peerID;
    }

    public void setPreferredNeighbors(ArrayList<Integer> preferredNeighbors) {
        this.preferredNeighbors = preferredNeighbors;
    }
    public void setOptimisticNeighbor(int optNeighborPeerID) {
        this.optimisticNeighbor = optNeighborPeerID;
    }


}
