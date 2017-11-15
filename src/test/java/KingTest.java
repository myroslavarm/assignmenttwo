import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KingTest {
    private King king;
    private CharacterFactory ch;
    private Character c;
    private int characterHP;

    @Before
    public void initializationOfObject() {
        king = new King();
        ch = new CharacterFactory();
        c = ch.createCharacter();
        characterHP = c.hp;
    }

    @Test
    public void testParameters() throws Exception {
        assertEquals((king.hp<=15 && king.hp>=5), true);
        assertEquals((king.power<=15 && king.hp>=5), true);
    }

    @Test
    public void testKick() throws Exception{
        king.kick(c);
        assertEquals((characterHP-c.hp)<=king.power, true);
    }
}