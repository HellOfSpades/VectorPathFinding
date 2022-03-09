package PathFinding;

import Graphics.Canvas;
import Graphics.Repainter;

import java.util.ArrayList;

public class Map {

    private ArrayList<Agent> agents = new ArrayList<>();
    private ArrayList<Obstacle> obstacles = new ArrayList<>();

    public Map() {
        Canvas window = new Canvas("PathFinding", this);

        Repainter repainter = new Repainter(window);
    }

    public ArrayList<Agent> getAgents() {
        return agents;
    }
    public ArrayList<Obstacle> getObstacles() {
        return obstacles;
    }
}
