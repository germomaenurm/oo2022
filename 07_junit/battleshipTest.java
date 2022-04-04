package kodutoo;
import org.junit.*;
import static org.junit.Assert.*;

public class battleshipTest{
    battleshipTuum tuum = new battleshipTuum1();

    @Test public void laevaXolemas(){
        tuum.asetaLaev();
        assertNotNull("laeval peab olema X", tuum.laevaX());
    }

    @Test public void laevaKohtOlemas(){
        tuum.laevaKoht();
        assertNotNull("laeval peab olema koht", tuum.laevaKoht());
    }
}
