package jour3.job05;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationExercice {
    public static void main(String[] args) {
        if (args.length <= 0){
            System.out.println("Utilisation : java StreamOperationExercice 10 2 15 23");
            return;
        }

        try {
            List<Integer> valeurs = Arrays.stream(args).map(Integer::parseInt).collect(Collectors.toList());
            List<Integer> valeursDoubleesFiltrees = valeurs.stream().map(valeur -> valeur * 2).filter(valeur -> valeur > 10 ).collect(Collectors.toList());
            System.out.println("Résultat : " + valeursDoubleesFiltrees);
        } catch (NumberFormatException e){
            System.out.println("Erreur : Argument invalide, veuillez fournir des entiers valides.");
        }





    }
}

