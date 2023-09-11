package jour4.job02;
import java.lang.Runnable;


public class RunnableInterfaceExercice implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i<5; i++){
            System.out.println("En cours d'execution");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        RunnableInterfaceExercice execution = new RunnableInterfaceExercice();
        Thread mythread = new Thread(execution);
        mythread.start();
    }
}
