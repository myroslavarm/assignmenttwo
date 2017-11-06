public class Hobbit extends Character {
    //power = 0, hp = 3, kick(toCry()l)
    Hobbit(){
        super(3, 0);
    }
    @Override
    public void kick(Character c) {
        toCry();
    }
    private void toCry(){
        System.out.println("Cry cry cry");
    }
}
