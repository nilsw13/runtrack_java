package jour3.job02;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MotsUniquesExercice {
    public static void main(String[] args) {
        if (args.length <= 0){
            System.out.println("Utilisation : java MotsUniquesExercice <mot1> <mot2> ..");
            return;
        }
            Stream<String> listeMots = Stream.of(args).filter(arg -> arg.matches("[a-zA-Z]+"));
            List<String> motsliste = listeMots.collect(Collectors.toList());
            List<String> motUniques = motsliste.stream().filter(mot -> motsliste.stream().filter(m -> m.equals(mot)).count() == 1).collect(Collectors.toList());
            motUniques.forEach(System.out::println);


    }
}
