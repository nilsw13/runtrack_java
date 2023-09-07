package jour2.job04;

public class Division {
    int a;

    int b;

    public Division(int a, int b) throws DivisionParZeroException{
        this.a = a;
        this.b = b;
        try {
            if ( a == 0 | b == 0){
                throw new DivisionParZeroException();
            }
            int result = a / b;
            System.out.println("Résultat: " + result);
        } catch (DivisionParZeroException e) {
            System.out.println(e.getMessage());
        }








    }


}
