package Maraphon;

import Maraphon.Competitors.Cat;
import Maraphon.Competitors.Competitor;
import Maraphon.Competitors.Human;
import Maraphon.Competitors.Robot;
import Maraphon.Obstacles.Cross;
import Maraphon.Obstacles.Obstacle;
import Maraphon.Obstacles.Wall;


public class Main {
    public static void main(String[] args) {
        Competitor[] competitors ={
                new Human("Volodya"),
                new Cat("Kusya"),
                new Robot("KozaniyMeshok")
        };
        Obstacle[] obstacles ={
                new Wall(4),
                new Cross(800)
        };
        for ( Competitor c:competitors ) {
            for (Obstacle o:obstacles ) {
                o.doIt(c);
                if(!c.isDistance()){
                    break;
                }
            }
        }

        for (Competitor c:competitors) {
            c.info();
        }
    }
}