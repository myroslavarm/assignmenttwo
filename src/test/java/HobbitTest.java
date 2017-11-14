import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HobbitTest {
    private Character c;
    private Hobbit h;
    private CharacterFactory ch;
    private int characterHP;
    private int hobbitHP;

    @Before
    public void initializationOfObject() {
        ch = new CharacterFactory();
        c = ch.createCharacter();
        h = new Hobbit();
        characterHP = c.hp;
        hobbitHP = h.hp;
    }

    @Test
    public void testKick() throws Exception {
        h.kick(c);
        assertEquals(h.hp, hobbitHP);
        assertEquals(c.hp, characterHP);
    }

}