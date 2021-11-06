package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void onegHappy() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxggxx");
                Assertions.assertEquals(result, true);
    }

    @Test
    public void gNotHappy() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxgxx");
        Assertions.assertEquals(result, false);
    }

    @Test
    public void AllgNotHappy() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxggyygxx");
        Assertions.assertEquals(result, false);
    }

    @Test
    public void Notg() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxxxxx");
        Assertions.assertEquals(result, false);
    }

    @Test
    public void voidString() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("");
        Assertions.assertEquals(result, false);
    }
}
