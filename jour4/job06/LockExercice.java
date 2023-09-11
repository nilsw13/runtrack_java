package jour4.job06;

public class LockExercice extends Thread{
    public static int soldeInitial;
    int retrait;


    public LockExercice(int retrait){
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

        LockExercice thread1 = new LockExercice(retrait);
        LockExercice thread2 = new LockExercice(retrait);
        thread1.start();
        System.out.println("Thread 1 a retiré" + " " + retrait);


        thread2.start();
        System.out.println("Thread 2 a retiré" + " " + retrait);

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("solde final: " + soldeInitial);




    }
}
