
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public int beepers;
    
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        countBeepers();
        collectClues();
    }
    public void countBeepers(){
        while(nextToABeeper()){
            pickBeeper();
            beepers ++;
        }
        if(beepers == 1){
            faceNorth();
        }
        else if(beepers == 2){
            faceEast();
        }
        else if(beepers == 3){
            faceSouth();
        }
        else if(beepers == 4){
            faceWest();
        }
    }
    public void beeperMethod(){
        beepers =0;
        while(nextToABeeper()){
            pickBeeper();
            beepers ++;
        }
        if(beepers == 1){
            faceNorth();
        }
        else if(beepers == 2){
            faceEast();
        }
        else if(beepers == 3){
            faceSouth();
        }
        else if(beepers == 4){
            faceWest();
        }
    }
    public void collectClues(){
        while(!nextToABeeper()){
            if(beepers < 5){
                move();
                beeperMethod();
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

