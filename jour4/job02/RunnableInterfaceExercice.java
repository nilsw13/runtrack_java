package jour4.job02;
import java.lang.Runnable;


public class RunnableInterfaceExercice extends Thread{
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
        execution.run();
    }
}
