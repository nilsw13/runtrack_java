package jour5.job01;

import java.util.ArrayList;

public class ArrayListArgumentExercice {



    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Veuillez entrer au moins deux arguments pour définir une liste");
            return;
        }

        ArrayList<String> arguments = new ArrayList<>();
        for (int i = 0; i< args.length; i++){
            String arg = args[i];
            try {
                String argument = arg;
                arguments.add(arg);
            }catch (IllegalArgumentException e){
                e.printStackTrace();
            }
            System.out.println(arg);
        }




    }
}
