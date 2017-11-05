public abstract class Character {
    //int power, int hp, void kick(Character c), boolean isAlive()
    protected int hp; //needs to be protected?
    protected int power;

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }
    public Character(){

    }

    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }
}