class Knight extends Swordsman {
    //power 2-12, hp 2-21, kick(like King)
    Knight(){
        hp = randNum(2, 21);
        power = randNum(2, 12);
    }

    @Override
    public void kick(Character c) {
        super.kick(c);
    }
}
