package jour5.job03;

import java.util.HashMap;
import java.util.Map;

public class HashMapArgumentExercice {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Liste d'argument vide veuillez entrer au moins deux arguments");
        }

        HashMap<String, String> hashMapArgument = new HashMap<>();

        for (int i = 0; i < args.length; i += 2){
            String key = args[i];
            String value = args[i + 1];
            hashMapArgument.put(key, value);

        }

        for (Map.Entry<String, String> entry : hashMapArgument.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
