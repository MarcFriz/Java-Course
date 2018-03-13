package Start;


import Classes.ThreadClass;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("We start here:");
    }

    //TODO 4:
    //Write 4 calculations for each Method form TODO 1
    //Use a Loop like from TODO 3

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
    public static void thread()
    {
        ThreadClass t = new ThreadClass();
        t.start();
    }
}
