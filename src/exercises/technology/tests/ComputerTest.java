package exercises.technology.tests;

import exercises.technology.main.Computer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    @Test
    public void constructorSetsValueTest() {
        Computer myComputer = new Computer("2020", 1600, 1600);
    assertEquals(1600, myComputer.getScreenWidth());
    assertEquals(1600, myComputer.getScreenHeight());
    assertEquals("2020", myComputer.getManufacturedYear());
    }
}
