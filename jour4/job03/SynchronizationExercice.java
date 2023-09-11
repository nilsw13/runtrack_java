package jour4.job03;

public class SynchronizationExercice extends Thread{
    private static int soldeInitial;
    int retrait;


    public SynchronizationExercice(int soldeInitial, int retrait){
        this.soldeInitial = soldeInitial;
        this.retrait = retrait;
    }



    @Override
    public void run(){
        retrait(soldeInitial, retrait);
    }



    public void retrait(int soldeInitial, int retrait) {
        int solde = soldeInitial - retrait;
        System.out.println("Solde final: " + solde);
    }




    public static void main(String[] args) {
        if (args.length <= 0){
            System.out.println("Veuillez fournir un argument pour definir le solde du compte en banque ainsi que le montant a retiré");
            return;
        }

        int soldeInitial = Integer.parseInt(args[0]);
        int retrait = Integer.parseInt(args[1]);

        SynchronizationExercice thread1 = new SynchronizationExercice(soldeInitial, retrait);
        SynchronizationExercice thread2 = new SynchronizationExercice(soldeInitial, retrait);
        thread1.start();
        thread2.start();




    }
}

