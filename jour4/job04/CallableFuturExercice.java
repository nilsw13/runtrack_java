package jour4.job04;


import java.util.concurrent.*;

public class CallableFuturExercice implements Callable<Integer> {

    private static int a;
    private static int b;


    @Override
    public Integer call() throws Exception {
        return a * b;
    }

    public static void main(String[] args) {
        if (args.length <= 0){
            System.out.println("Utilisation: java CallableFuturExercice Argument1 = nombre 1       Argument2 = nombre2");
            return;
        }



        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        CallableFuturExercice callable = new CallableFuturExercice();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(callable);


        try {
            int result = future.get();
            System.out.println("Resultat de la multiplication: " + result);
        } catch (InterruptedException| ExecutionException e) {
            e.printStackTrace();
        }

    executor.shutdown();
    }
}
