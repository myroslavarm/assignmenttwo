import java.util.Random;

public class Swordsman extends Character {
    private Random rand = new Random();
    //private static final int min = 0;
    //private static final int max = 0;
    public Swordsman(){
        //hp = randNum(min, max);
        //power = randNum(min, max);
    }

    public int randNum(int min, int max){
        return rand.nextInt((max - min) + 1);
    }

    public void kick(Character c) {
        c.hp -= randNum(0, power);
    }
}