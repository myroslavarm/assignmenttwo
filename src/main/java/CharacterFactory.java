import java.util.Random;

public class CharacterFactory {
    private Random rand = new Random();

    public Character createCharacter(){
        Character[] characters = {new Hobbit(), new King(), new Knight(), new Elf()};
        return characters[new Random().nextInt(characters.length)];
    //returns random instance of any existing character.
    }
}
