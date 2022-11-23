package src;


import Project.src.models.CommonProps;

import java.util.ArrayList;

public class RunningPeer {

    CommonProps commonProps;
    ArrayList<Integer> preferredNeighbors;
    private int optimisticNeighbor;
    private Project.src.PeerInfo peerInfo = new Project.src.PeerInfo();

    // setup socket info
    private int peerID;

    public RunningPeer(CommonProps commonProps, int peerID) {
        this.commonProps = commonProps;
        this.peerID = peerID;
        peerInfo.initializeTracker();
    }

    public void setPreferredNeighbors(ArrayList<Integer> preferredNeighbors) {
        this.preferredNeighbors = preferredNeighbors;
    }
    public void setOptimisticNeighbor(int optNeighborPeerID) {
        this.optimisticNeighbor = optNeighborPeerID;
    }


}
