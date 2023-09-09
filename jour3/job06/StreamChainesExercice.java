package jour3.job06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChainesExercice {
    public static boolean isString(String s){
        try {
            Integer.parseInt(s);
            return false;
        } catch (NumberFormatException e){
            return true;
        }

    }


    public static void main(String[] args) {

        if (args.length <= 0) {
            System.out.println("Utilisation : java StreamChainesExercice  cat ape ant axe");
            return;
        }

        ArrayList<String> arguments = new ArrayList<>();

        for (String arg : args) {
            if (isString(arg)){
                arguments.add(arg);
            }else {
                System.out.println("Erreur : Argument invalide, veuillez fournir une chaîne de caractères. --> exemple : java StreamChainesExercice cat ape ant axe ");
                return;
            }



        }
        List<String> result = arguments.stream().filter(argument -> argument.length() == 3).filter(argument -> argument.startsWith("a")).collect(Collectors.toList());
        System.out.println("Mots filtrés: " + result);
    }
}


