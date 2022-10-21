package Project.src;

import Project.src.models.CommonProps;

import java.util.ArrayList;

public class Peer {
    CommonProps commonProps;
    ArrayList<Integer> preferredNeighbors;
    private int optimisticNeighbor;
    // setup socket info

    public Peer(CommonProps commonProps, ArrayList<Integer> preferredNeighbors, int optimisticNeighbor) {
        this.commonProps = commonProps;
        this.preferredNeighbors = preferredNeighbors;
        this.optimisticNeighbor = optimisticNeighbor;
    }

    public void setPreferredNeighbors(ArrayList<Integer> preferredNeighbors) {
        this.preferredNeighbors = preferredNeighbors;
    }
    public void setOptimisticNeighbor(int optimisticNeighbor) {
        this.optimisticNeighbor = optimisticNeighbor;
    }

}
