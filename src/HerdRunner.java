import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;


public class HerdRunner {
    public static void main ( String[] args )
    {
        Herd bunch = new Herd(5);
        bunch.set(0,3);
        bunch.set(1,5);
        bunch.set(2,6);
        out.println(bunch);
    }
}
