package Start;
import Classes.Structure;


public class Main {

    public static void main(String[] args)
    {
        System.out.println("We start here:");
        fourCalculations(15);


    }
    //TODO 0:
    //Write UnitTest for all Methods in this Course.

    //TODO 4:
    //Write 4 calculations for each Method form TODO 1
    //Use a Loop like from TODO 3

    public static int fourCalculations(int secondNumber)
    {
        Structure calculations = new Structure();
        int counter = 0;

        for(int i= 0; i <= 6 ;i+=2)
        {
            double ergebnis = calculations.addition(i, i);
            System.out.println("Ergebnis der Addition: " + ergebnis);
            counter++;
        }

        for(int i= 0; i < 4 ;i++)
        {
            double ergebnis = calculations.subtraction(secondNumber, i);
            System.out.println("Ergebnis der Subtraktion: " + ergebnis);
            counter++;
        }

        for(int i= 0; i <= 6 ;i+=2)
        {
            double ergebnis = calculations.multiplication(i, i);
            System.out.println("Ergebnis der Multiplikation: " + ergebnis);
            counter++;
        }

        for(int i= 1; i <= 7 ;i+=2)
        {
            double ergebnis = calculations.division(secondNumber, i);
            System.out.println("Ergebnis der Division: " + ergebnis);
            counter++;
        }
        return(counter);

    }

    //TODO 5:
    //Write a Method in the Structure package which counts the character in a given String and give it back.
    //Show the count on the screen.
    //Do the same in the main Method without writing a own Method.

    //TODO 8:
    //Write a use of TODO 7

    //TODO 9:
    //Count and Show the number and message from the given source-file filtered by Error
    //You will find the File in the "File"-Directory
    //Use your TODO 8
    //There are 1678 Error

    //TODO 13
    //Nothing to do here unless you want to understand Threads.
//    public static void thread()
//    {
//        ThreadClass t = new ThreadClass();
//        t.start();
//    }
}
