import java.util.Random;

public class CharacterFactory {
    private Random rand = new Random();

    public Character createCharacter(){
        switch(rand.nextInt(4)){
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new King();
            case 3:
                return new Knight();
        }
        return null;
    //returns random instance of any existing character.
    }
}
