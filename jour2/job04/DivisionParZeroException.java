package jour2.job04;

import java.io.Serial;

public class DivisionParZeroException extends Throwable {
    @Serial
    private static final long serialVersionUID = -7276036302217338037L;
    public DivisionParZeroException(){
       super("Erreur: DivisionParZeroException");
    }
}
