import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElfTest {private Character c;
    private Elf e;
    private CharacterFactory ch;
    private int characterHP;
    private int elfHP;

    @Before
    public void initializationOfObject() {
        ch = new CharacterFactory();
        c = ch.createCharacter();
        e = new Elf();
        characterHP = c.hp;
        elfHP = e.hp;
    }

    @Test
    public void testKick() throws Exception {
        e.kick(c);
        assertEquals(e.hp, elfHP);
        if (characterHP < elfHP) {
            assertEquals(c.isAlive(), false);
        }
    }
}