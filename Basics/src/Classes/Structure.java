package Classes;


public class Structure {

    public int[] arr = new int[100];

    double returnwert = 0;
    int zahlVonAussen = 0;

    public double addition(double zahl1, double zahl2)
    {
        double ergebnis = zahl1 + zahl2;
        return(ergebnis);
    }

    public double subtraction(double zahl1, double zahl2)
    {
        double ergebnis = zahl1 - zahl2;
        return(ergebnis);
    }

    public double multiplication(double zahl1, double zahl2)
    {
        double ergebnis = zahl1 * zahl2;
        return(ergebnis);
    }

    public double division(double zahl1, double zahl2)
    {
        double ergebnis = zahl1 / zahl2;
        return(ergebnis);
    }

    public double rechnen (double zahl1, double zahl2, String aktion, double ergebnis)
    {

        if (aktion == "addition")
        {
            double ergebnisaddition = addition(zahl1, zahl2);
            if(ergebnis == ergebnisaddition)
            {
                returnwert = ergebnisaddition;
            } else
            {
                returnwert = 0;
            }
        } else if (aktion == "subtraction")
        {
            double ergebnissubtraction = subtraction(zahl1, zahl2);
            if(ergebnis == ergebnissubtraction)
            {
                returnwert = ergebnissubtraction;
            } else
            {
                returnwert = 0;
            }
        } else if (aktion == "multiplication")
        {
            double ergebnismultiplication = multiplication(zahl1, zahl2);
            if(ergebnis == ergebnismultiplication)
            {
                returnwert = ergebnismultiplication;
            } else
            {
                returnwert = 0;
            }
        } else if (aktion == "division")
        {
            double ergebnisdivision = division(zahl1, zahl2);
            if(ergebnis == ergebnisdivision)
            {
                returnwert = ergebnisdivision;
            } else
            {
                returnwert = 0;
            }
        }
        return(returnwert);
    }

    //TODO 3
    //Write a Loop which fills an Array with given Numbers.
    //Use the Array as a global one.

    public void derLoop(int zahlVonAussen)
    {

        for(int i = 0; i<=99; i++)
        {
            arr[i] = zahlVonAussen;
            zahlVonAussen = zahlVonAussen+1;
            System.out.println(arr[i]);
        }
    }


    //TODO 6:
    //Write a Method for reading a Logfile with the given parameter "filter"

    //TODO 7:
    //Write a Method for writing a Logfile with given parameter "typ"(Enum), "message"(String), "append"(Boolean)
    //Also use the current date for the Entry

    //TODO 10:
    //Write a recursive algorithm to calculate the fibonacci series
    //Use this Method in the Main Method

    //TODO 11:
    //Rewrite TODO 6 and 7:
    //Use Exception Handling

    //TODO 11.5:
    //Write the Java-Documentation for TODO 10
    //This will show you the written information about the Method when you want to use it

    //TODO 12:
    //Write a controller for TODO 10
    //Use the console to give the User advice and read the number he gives you
    //This number is the value for your calculations form TODO 10

}
