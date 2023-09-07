package jour2.job07;

public class ErreursExercice {
    int a;

    int i;

    int b;
    int[] array;

    public  ErreursExercice (int a,int b) throws Exception {
        this.a = a;
        this.b = b;
    }


    public void AfficherIndex(int i) throws Exception {
        this.i = i;
        try {
            array = new int[]{a, b};

            if (i >= 0 && i < array.length) {
                System.out.println(array[i]);

            } else {
                throw new IndexOutOfBoundsException("Erreur:  IndexOutOfBoundsException");
            }
        }catch (IndexOutOfBoundsException f) {
            System.out.println(f.getMessage());
        }



    }

        public void ErreursExercice() throws Exception{
            try {

                if (a == 0 || b == 0){
                    throw new ArithmeticException("Resultat de la division: Erreur:  ArithmeticException.");
                }
                int result = a / b;
                System.out.println("Resultat de la division: " + result);

            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }





            try {
                String s = null;
                int longueur = s.length();
                throw new NullPointerException("Erreur: NullPointerException.");
            }catch (NullPointerException n ){
                System.out.println(n.getMessage());
            }


        }











    public static void main(String[] args) throws Exception {

        ErreursExercice e = new ErreursExercice(10, 0);
        e.ErreursExercice();
        e.AfficherIndex(2);



    }
}
