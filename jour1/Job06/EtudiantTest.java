package jour1.Job06;

public class EtudiantTest {
    String nom;
    int[] notes = {15, 12, 18, 10};
    int nombreDeNotes;

    double moyenne;





    public EtudiantTest(String nom, int[] notes) {
        this.nom = nom;
        this.notes = notes;
    }

    public void AfficherInfos(){
        System.out.println("nom: " +nom);
        System.out.print("Notes : [");
        for (int i = 0; i < notes.length; i++) {
            System.out.print(notes[i]);
            if (i < notes.length - 1){
                System.out.print(",");

            }
        }
        System.out.print("] \n");
        NbMax();
        Nbmin();
        CalculMoyenne();


    }

    public void CalculMoyenne(){
        int total = 0;
        nombreDeNotes = notes.length;
        for (int i = 0; i < nombreDeNotes; i++){
            total += notes[i];
        }
        moyenne = (double) total / nombreDeNotes;
        System.out.println("Moyenne: " + moyenne);

    }

    public void NbMax(){
        int maxVal = notes[0];
        for (int i = 0; i < notes.length; i++){
            if (notes[i] > maxVal) {
                maxVal = notes[i];
            }
        }
        System.out.println("Note la plus haute : " + maxVal);
    }

    public void Nbmin(){
        int minVal = notes[0];
        for (int i = 0; i < notes.length; i++){
            if (notes[i] < minVal){
                minVal = notes[i];
            }
        }
        System.out.println("Note la plus basse : " + minVal);
    }

    public void AddNote(int NoteAjoute){
        int[] nouvellesNotes = new int[notes.length + 1];
        for (int i = 0; i < notes.length; i++){
            nouvellesNotes[i] = notes[i];
        }
        nouvellesNotes[notes.length] = NoteAjoute;
        notes = nouvellesNotes;


    }




    public static void main(String[] args) {

        EtudiantTest etudiant = new EtudiantTest("Bob", new int[]{15, 12, 18, 10});
        etudiant.AfficherInfos();
        etudiant.NbMax();
        etudiant.Nbmin();
        etudiant.CalculMoyenne();
        etudiant.AddNote(8);
        etudiant.AfficherInfos();

    }


}



