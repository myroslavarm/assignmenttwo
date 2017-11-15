public class GameManager {
    public GameManager(){

    }

    public static void fight(Character c1, Character c2){
        // to provide a fight between two characters
        // and explain via command line what happens during the fight
        // while both of the characters are alive.
        System.out.println("Begin the fight!\n");
        int turn = 0;
        if(c1.getClass().getSimpleName()==c2.getClass().getSimpleName()) {
            c1.hp = 0;
            System.out.println("The characters are equal in strength. It's a tie.");
        }
        while(c1.isAlive() && c2.isAlive()){
            if(turn == 0) {
                c1.kick(c2);
                System.out.println(c1.getClass().getSimpleName() + " kicks " + c2.getClass().getSimpleName() + '\n');
                turn = 1;
            }
            else {
                c2.kick(c1);
                System.out.println(c2.getClass().getSimpleName() + " kicks " + c1.getClass().getSimpleName() + '\n');
                turn = 0;
            }
            System.out.println(c1.getClass().getSimpleName() + " has got:"
                    + '\n' + "hp = " + c1.hp + '\n' + "power = " + c1.power + '\n');
            System.out.println(c2.getClass().getSimpleName() + " has got:"
                    + '\n' + "hp = " + c2.hp + '\n' + "power = " + c2.power + '\n');
            if(!(c1.isAlive())){
                System.out.println(c1.getClass().getSimpleName() + " is killed!" + '\n');
            }
            if(!(c2.isAlive())){
                System.out.println(c2.getClass().getSimpleName() + " is killed!");
            }
        }
    }

    public static void main(String args[]){
        //GameManager g = new GameManager();
        CharacterFactory ch = new CharacterFactory();
        fight(ch.createCharacter(), ch.createCharacter());
    }
}
