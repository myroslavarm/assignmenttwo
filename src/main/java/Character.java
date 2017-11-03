public class Character {
    //int power, int hp, void kick(Character c), boolean isAlive()
    protected int hp = 10; //needs to be protected?
    protected int power = 10;

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    public void kick(Character c){
        kick(c); //?
    }

    public boolean isAlive() {
        return hp > 10;
    }
}