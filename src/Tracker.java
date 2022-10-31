package Project.src;

import java.util.Map;
import java.util.TreeMap;

public class Tracker {
    private TreeMap<Integer, Integer> tracker;

    public Tracker() {
        tracker = new TreeMap<>();
    }

    public void setTracker(TreeMap<Integer, Integer> tracker) {
        this.tracker = tracker;
    }

    @Override
    public String toString() {
        String str = "";

        for(Map.Entry<Integer, Integer> entry : tracker.entrySet() ){
            str += String.format("%s: %s,", entry.getKey(), entry.getValue());
        }
        return str;
    }
}
