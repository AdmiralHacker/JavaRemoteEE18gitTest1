package advanced.threads.deadlock;

public class DeadLockExample {
    public static void main(String[] args) throws Exception{ //throws Expection zakrivaet glaza na owibki v kode

        String r1 = "r1"; //resource 1
        String r2 = "r2"; //resource 2

        //Block sinhronizacija v {}  etih skobkam / metod v () takih
        //Thread #1
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (r1) {
                    System.out.println("Thread #1 Locked String r1");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {

                    }
                    synchronized (r2) {
                        System.out.println("Thread #1 Locked String r2");
                    }
                }

            }
        };

        //Thread #2

        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (r2) {
                    System.out.println("Thread #2 locked String r2");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    synchronized (r1) {
                        System.out.println("Thread #2 Locked String 1");
                    }

                }
            }
        };
        t1.start();
        t2.start();


        t1.join();
        t2.join();
        System.out.println("End");

    }


}
