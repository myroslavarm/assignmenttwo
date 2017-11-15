import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {
    private Knight knight;
    private CharacterFactory ch;
    private Character c;
    private int characterHP;

    @Before
    public void initializationOfObject() {
        knight = new Knight();
        ch = new CharacterFactory();
        c = ch.createCharacter();
        characterHP = c.hp;
    }

    @Test
    public void testParameters() throws Exception {
        System.out.println(knight.hp);
        System.out.println(knight.power);
        assertEquals((knight.hp<=21 && knight.hp>=2), true);
        assertEquals((knight.power<=12 && knight.hp>=2), true);
    }

    @Test
    public void testKick() throws Exception{
        knight.kick(c);
        assertEquals((characterHP-c.hp)<=knight.power, true);
    }

}