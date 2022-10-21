package Project.src;

import java.util.ArrayList;

public class Peer {
    CommonProperties commonProps;
    ArrayList<Integer> preferredNeighbors;
    private int optimisticNeighbor;
    // setup socket info

    public Peer(CommonProperties commonProperties, ArrayList<Integer> preferredNeighbors, int optimisticNeighbor) {
        this.commonProps = commonProperties;
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
