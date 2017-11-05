public class GameManager {
    public GameManager(){

    }
    public void fight(Character c1, Character c2){
        // to provide a fight between two characters
        // and explain via command line what happens during the fight
        // while both of the characters are alive.
        while(c1.isAlive() && c2.isAlive()){
            c1.kick(c2);
            c2.kick(c1);
            if(!(c1.isAlive())){
                System.out.println("Character one is killed");
            }
            if(!(c2.isAlive())){
                System.out.println("Character two is killed");
            }
            else System.out.println("It's a tie");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
