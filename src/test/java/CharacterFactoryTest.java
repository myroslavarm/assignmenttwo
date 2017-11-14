import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterFactoryTest {
    private CharacterFactory ch;
    private Character c;

    @Before
    public void initializationOfObject() {
        ch = new CharacterFactory();
        c = ch.createCharacter();
    }

    @Test
    public void testCreateCharacter() throws Exception {
        assertTrue(c instanceof Character);
    }

}