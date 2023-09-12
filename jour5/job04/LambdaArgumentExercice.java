package jour5.job04;

import java.util.function.Predicate;

public class LambdaArgumentExercice {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Liste d'argument vide veuillez deux arguments (la chaine de caractere et le nombre pour la comparer");
            return;
        }

        String chaineChar = args[0];
        int nombreComp = Integer.parseInt(args[1]);


        Predicate<String> compareTaille = a -> a.length() > nombreComp;

        if(!compareTaille.test(chaineChar)){
            System.out.println("la chaine " + "[" + chaineChar + "]" + " est superieure à " + nombreComp);
        } else {
            System.out.println("la chaine " + "[" + chaineChar + "]" + " est inferieur à " + nombreComp);
        }

    }

}
