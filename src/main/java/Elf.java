public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.hp < hp) {
            c.hp = 0;
        }
        else{
            c.power--;
        }
    }
    //Elf: power = 10, hp= 10, kick(kill everobody which weaker than him, otherwise decrease power of the other character by 1)
}
