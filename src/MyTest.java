/**
 * Created by SARMASAGI GYORK on 15. 05. 11..
 * Company: BME
 * Github: faklyasgyuri
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MyTest {
    Scramble sc = new Scramble();

    @Test
    public void testScramble() {

        assertEquals(sc.mySplit("SANYI"),"SYNAI");
        assertEquals(sc.mySplit("Junit is working fine"),"Jinut is wnikrog fnie");
        assertEquals(sc.mySplit("Rossz teszt"),"Mondtam, hogy rossz");
        assertEquals(sc.mySplit("Marton Alajos es a gyerekek"), "Motran Aojals es a gekereyk");
    }
}
