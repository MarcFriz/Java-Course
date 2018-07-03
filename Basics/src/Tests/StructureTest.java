package Tests;
import Classes.Structure;

import static org.junit.jupiter.api.Assertions.*;

class StructureTest {

    @org.junit.jupiter.api.Test
    void addition()
    {
        Structure Rechnung1 = new Structure();
        double ergebnisAusDerRechnung = Rechnung1.addition(5,5);
        assert(ergebnisAusDerRechnung == 10);
    }

    @org.junit.jupiter.api.Test
    void subtraction()
    {
        Structure Rechnung1 = new Structure();
        double ergebnisAusDerRechnung = Rechnung1.subtraction(5,5);
        assert(ergebnisAusDerRechnung == 0);
    }

    @org.junit.jupiter.api.Test
    void multiplication()
    {
        Structure Rechnung1 = new Structure();
        double ergebnisAusDerRechnung = Rechnung1.multiplication(5,5);
        assert(ergebnisAusDerRechnung == 25);
    }

    @org.junit.jupiter.api.Test
    void division()
    {
        Structure Rechnung1 = new Structure();
        double ergebnisAusDerRechnung = Rechnung1.division(5,5);
        assert(ergebnisAusDerRechnung == 1);
    }
    @org.junit.jupiter.api.Test
    void taschenrechner()
    {
        Structure rechnungGes = new Structure();
        double ergebnisAusDerRechnung = rechnungGes.rechnen(5,5, "minus", 0);
        assert(ergebnisAusDerRechnung == 0);
    }
}