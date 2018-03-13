package Classes;

public class ThreadClass {
    public void start()
    {
        Thread t2 = new Thread( new CounterCommand(5) );
        t2.start();

        Thread t1 = new Thread( new CounterCommand(100) );
        t1.start();
    }


    class CounterCommand implements Runnable
    {

        private int x;

        public CounterCommand(int x)
        {
            this.x = x;
        }

        @Override public void run()
        {

            for ( int i = 0; i < 200; i++ )
            {
                System.out.println(x);
            }
        }
    }
}
