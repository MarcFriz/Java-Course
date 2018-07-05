package Tests;
import Start.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void test_fourCalculations() {

        int counter = Main.fourCalculations(15);
        assert (counter == 16);
    }


}
