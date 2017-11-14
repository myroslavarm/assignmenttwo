import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KingTest {
    private King king;

    @Before
    public void initializationOfObject() {
        king = new King();
    }

    @Test
    public void testParameters() throws Exception {
        assertEquals((king.hp<=15 && king.hp>=5), true);
        assertEquals((king.power<=15 && king.hp>=5), true);
    }
}