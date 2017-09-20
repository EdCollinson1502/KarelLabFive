
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    int beepers =0;
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        while(nextToABeeper()){
            pickBeeper();
            beepers ++;
        }
        if(beepers % 2 == 0){
            faceEast();
            move();
            while(nextToABeeper()){
                pickBeeper();
            }
        }
        else{
            faceWest();
            move();
            while(nextToABeeper()){
                pickBeeper();
            }
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

