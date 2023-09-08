package jour3.job03;

import java.util.HashMap;
import java.util.Map;

public class EtudiantMapExercice {
    public static void main(String[] args) {
        HashMap<Integer, String> matricule = new HashMap<Integer, String>();
        matricule.put(250, "Tony");
        matricule.put(102, "Pierre");
        matricule.put(101, "Marie");
        matricule.put(100, "Sophie");



        for(Map.Entry<Integer, String> entry : matricule.entrySet()){
            System.out.println("clé : " + entry.getKey() + ", nom: " + entry.getValue() );
        }

    }


}
