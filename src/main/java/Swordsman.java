import java.util.Random;

public abstract class Swordsman extends Character {
    private Random rand = new Random();
    //private static final int min = 0;
    //private static final int max = 0;
    //Swordsman(){
        //hp = randNum(min, max);
        //power = randNum(min, max);
    //}

    int randNum(int min, int max){
        //return (int) (Math.random() * ( (max - min) + 1 ));
        return rand.nextInt(max-min+1) + min;
    }

    public void kick(Character c) {
        c.hp -= randNum(0, power);
    }
}