package Classes;


public class Structure {

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

    //TODO 2:
    //Add a Method to control the right answer from TODO 1
    //Use "prediction", "right answer" and "variant" as given parameter
    //Use If Else for this task

    public double rechnen (double zahl1, double zahl2, String aktion, double ergebnis)
    {
        double re = 0;

        if (aktion == "plus")
        {
            double ergebnisplus = addition(zahl1, zahl2);
            if(ergebnis == ergebnisplus)
            {
                re = ergebnisplus;
            } else
            {
                re = 0;
            }
        } else if (aktion == "minus")
        {
            double ergebnisminus = subtraction(zahl1, zahl2);
            if(ergebnis == ergebnisminus)
            {
                re = ergebnisminus;
            } else
            {
                re = 0;
            }
        } else if (aktion == "multiplikation")
        {
            double ergebnismal = multiplication(zahl1, zahl2);
            if(ergebnis == ergebnismal)
            {
                re = ergebnismal;
            } else
            {
                re = 0;
            }
        } else if (aktion == "division")
        {
            double ergebnisdiv = division(zahl1, zahl2);
            if(ergebnis == ergebnisdiv)
            {
                re = ergebnisdiv;
            } else
            {
                re = 0;
            }
        }
        return(re);
    }

    //TODO 3
    //Write a Loop which fills a Array with given Numbers.
    //Use the Array as a global one.

    

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
