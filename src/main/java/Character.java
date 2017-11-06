public abstract class Character {
    //int power, int hp, void kick(Character c), boolean isAlive()
    int hp; //needs to be protected?
    int power;

    Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }
    Character(){

    }

    public abstract void kick(Character c);

    boolean isAlive() {
        return hp > 0;
    }
}