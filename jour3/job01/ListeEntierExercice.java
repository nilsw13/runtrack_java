package jour3.job01;

import java.util.ArrayList;

public class ListeEntierExercice {
    public static void main(String[] args) {

        if (args.length <= 0){
            System.out.println("Utilisation : java ListeEntierExercice <entier1> <entier2> ..");
            return;
        }

        ArrayList<Integer> entiers = new ArrayList<>();

        for (int i = 0; i < args.length; i++){
            String arg = args[i];
            try{
                int entier = Integer.parseInt(arg);
                entiers.add(entier);
            } catch (NumberFormatException n ){
                System.out.println("L'argument \"" + arg + "\" n'est pas un entier valide.");
            }

        }


        System.out.println("Liste des entiers : " + entiers);
        int sommeEntierPair = 0;

        for (int entierPair :entiers) {

            if (entierPair % 2 == 0) {
                sommeEntierPair += entierPair;
            }
        }
        System.out.println("Somme entiers pair: " + sommeEntierPair);
    }
}



