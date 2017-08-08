import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/8/17.
 */
public class CDTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        CD.clearAllCds();

    }

    @Test
    public void instantiationOfCd_true () {
        CD cd = new CD("Brittany Spears Greatest Hits", "Brittany Spears", 1993);
        assertTrue(cd instanceof CD);
    }

    @Test
    public void CDInstatiatesWithArtist_true() {
        CD cd = new CD("Brittany Spears Greatest Hits", "Brittany Spears", 1993);
        assertEquals(cd.getArtist(), "Brittany Spears");
    }
    @Test
    public void CDInstatiatesWithTitle_true() {
        CD cd = new CD("Brittany Spears Greatest Hits", "Brittany Spears", 1993);
        assertEquals(cd.getTitle(), "Brittany Spears Greatest Hits");
    }
    @Test
    public void CDInstatiatesWithYear_true() {
        CD cd = new CD("Brittany Spears Greatest Hits", "Brittany Spears", 1993);
        assertEquals(cd.getYear(), 1993);
    }
    @Test
    public void CDListContainsACD_true() {
        CD cd = new CD ("Brittany Spears Greatest Hits", "Brittany Spears", 1993);
        assertEquals(CD.getAllCDs().size(), 1);
    }

    @Test
    public void AllCdsContainAllCds_true() {
        CD cdOne = new CD ("Brittany Spears Greatest Hits", "Brittany Spears", 1993);
        CD cdTwo = new CD ("Madonna Greatest Hits", "Madonna", 1990);
        assertTrue(CD.getAllCDs().contains(cdOne));
        assertTrue(CD.getAllCDs().contains(cdTwo));
    }

}