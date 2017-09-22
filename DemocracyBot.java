
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void fixBallots() {
        move();
        for (int i = 0; i < 5;  i++){
            if(!nextToABeeper()){
               faceNorth();
               move();
               if(nextToABeeper()){
                   pickBeeper();
               }
               faceSouth();
               move();
               move();
               if(nextToABeeper()){
                   pickBeeper();
               }
               faceNorth();
               move();
               faceEast();
            }
            else{
               faceNorth();
               move();
               if(!nextToABeeper()){
                   putBeeper();
               }
               faceSouth();
               move();
               move();
               if(!nextToABeeper()){
                   putBeeper();
               }
               faceNorth();
               move();
               faceEast();
            }
            move();
            move();
        }
        
    }
    public void faceEast(){
        while(!facingEast()){
                turnLeft();
        }
    }
    public void faceSouth(){
        while(!facingSouth()){
                turnLeft();
        }
    }
    public void faceNorth(){
        while(!facingNorth()){
                turnLeft();
        }
    }
    public void faceWest(){
        while(!facingWest()){
                turnLeft();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

