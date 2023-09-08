package jour3.job04;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> t;


    public Box() {
        this.t = new ArrayList<>();
    }

    public void add(T t) {
        this.t.add(t);
    }

    public List<T> get() {
        return this.t;
    }

    public static boolean isString(String s){
        try {
            Integer.parseInt(s);
            return false;
        } catch (NumberFormatException e){
            return true;
        }

    }

    public static void main(String[] args) {
        Box<String> BoiteString = new Box<>();

        if (args.length <= 0) {
            System.out.println("Utilisation : java MotsUniquesExercice <mot1> <mot2> ..");
            return;
        }



        for (String arg : args) {
            if (isString(arg)) {
                BoiteString.add(arg);
            }else {
                System.out.println("Erreur : Argument invalide, veuillez fournir une chaîne de caractères. --> exemple : java Box hello ");
                return;
            }
        }


        System.out.print("contenu de la boite: ");
        for (String mots : BoiteString.get()){
            System.out.print(mots + " ");
        }


    }
}

