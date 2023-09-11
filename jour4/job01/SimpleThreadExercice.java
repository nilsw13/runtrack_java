package jour4.job01;

public class SimpleThreadExercice extends Thread {
    public static void main(String[] args) {
        Runnable simplethread = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<5; i++){
                    System.out.println("salut thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }}};

        simplethread.run();
    }
}
