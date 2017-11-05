import java.util.Random;

public class CharacterFactory {
    private Random rand = new Random();
    private static final int min = 1;
    private static final int max = 4;

    public Character createCharacter(){
        switch(rand.nextInt((max - min) + 1)){
            case 1:
                return new Hobbit();
            case 2:
                return new Elf();
            case 3:
                return new King();
            case 4:
                return new Knight();
        }
        return null;
    //returns random instance of any existing character.
    }
}
