package jour5.job02;

import java.util.*;

public class HashSetArgumentExercice {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Veuillez entrer au moins deux arguments pour définir une liste");
            return;
        }

        HashSet<String> monHashSet = new HashSet<>();
        for (String arg : args){
            if (!monHashSet.contains(arg)){
                monHashSet.add(arg);
                System.out.println(arg);
            }

        }

    }

}
