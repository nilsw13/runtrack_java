package jour4.job03;

public class SynchronizationExercice extends Thread{
    public static int soldeInitial;
    int retrait;


    public SynchronizationExercice(int retrait){
        this.retrait = retrait;
    }



    @Override
    public void run(){
        retrait();
    }



    public synchronized void retrait() {
        soldeInitial -= retrait;


    }




    public static void main(String[] args) throws InterruptedException {
        if (args.length <= 0){
            System.out.println("Veuillez fournir un argument pour definir le solde du compte en banque ainsi que le montant a retiré");
            return;
        }

        soldeInitial = Integer.parseInt(args[0]);
        int retrait = Integer.parseInt(args[1]);

        SynchronizationExercice thread1 = new SynchronizationExercice(retrait);
        SynchronizationExercice thread2 = new SynchronizationExercice(retrait);
        thread1.start();
        System.out.println(thread1.getName() + "a retiré" + retrait);


        thread2.start();
        System.out.println(thread2.getName() + "a retiré" + retrait);

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.join();

        System.out.println("solde final: " + soldeInitial);




    }
}

