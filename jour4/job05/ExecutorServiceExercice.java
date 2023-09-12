package jour4.job05;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExercice implements Callable<Integer> {
    private  int chiffrePourCalcul;
    private  int coefficient;

    public ExecutorServiceExercice(int chiffrePourCalcul, int coefficient){
        this.chiffrePourCalcul = chiffrePourCalcul;
        this.coefficient = coefficient;

    }

    @Override
    public  Integer call(){
        return chiffrePourCalcul * coefficient;
    }

    public static void main(String[] args) {

        if (args.length <= 0){
            System.out.println("Veuillez fournir un argument pour definir le nombre qui sera mutliplié par les différents coéefficient");
            return;
        }

        int chiffrePourCalcul = Integer.parseInt(args[0]);



        ExecutorService executor = Executors.newFixedThreadPool(3);
        ExecutorServiceExercice tache1 = new ExecutorServiceExercice(1,chiffrePourCalcul);
        ExecutorServiceExercice tache2 = new ExecutorServiceExercice(2, chiffrePourCalcul);
        ExecutorServiceExercice tache3 = new ExecutorServiceExercice(3, chiffrePourCalcul);


        try{

            Future<Integer> result1 = executor.submit((Callable<Integer>) tache1);
            Future<Integer> result2 = executor.submit((Callable<Integer>) tache2);
            Future<Integer> result3 = executor.submit((Callable<Integer>) tache3);

            int produit1 = result1.get();
            int produit2 = result2.get();
            int produit3 = result3.get();

            System.out.println("Résultat de la tâche 1 : " + produit1);
            System.out.println("Résultat de la tâche 2 : " + produit2);
            System.out.println("Résultat de la tâche 3 : " + produit3);
        }catch (Exception e){

            e.printStackTrace();
        }finally {
            executor.shutdown();
        }
    }


}
