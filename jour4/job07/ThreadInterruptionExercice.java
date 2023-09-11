package jour4.job07;

public class ThreadInterruptionExercice extends Thread {
    private static int sleepytime;
    public ThreadInterruptionExercice(int sleepyTime){
        this.sleepytime = sleepyTime * 1000 ;
    }


    public static void main(String[] args) {

        if (args.length <= 0){
            System.out.println("Veuillez fournir un argument pour definir le temps d'attente");
            return;
        }

        sleepytime = Integer.parseInt(args[0]);

        Runnable sleepyman = new Runnable() {
            @Override
            public void run() {
                System.out.println("debut du thread");
                try {
                    for (int i = 0; i <= sleepytime; i++){
                        Thread.sleep(1000);
                        System.out.println(i + "seconde");
                        if (i == sleepytime/2){
                            Thread.currentThread().interrupt();
                            System.out.println("interrepution apres : " +sleepytime / 2 + "secondes");
                            break;
                        }
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }};
        Thread thread = new Thread(sleepyman);
        thread.start();

    }




    }






