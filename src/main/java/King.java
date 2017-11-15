class King extends Swordsman {
    // King: power 5-15, hp 5-15, kick(decrease number of hp of the enemy by random number which will be in range of his power)
    King(){
        hp = randNum(5, 15);
        power = randNum(5, 15);
    }

    @Override
    public void kick(Character c) {
        super.kick(c);
    }
}