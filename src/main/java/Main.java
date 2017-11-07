public class Main {
    public static void main(String args[]){
        GameManager g = new GameManager();
        CharacterFactory ch = new CharacterFactory();
        g.fight(ch.createCharacter(), ch.createCharacter());
    }
}