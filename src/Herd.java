import java.util.Arrays;

public class Herd {
    private Creature[] things;

    public Herd()
    {
        //must size the array
        things = new Creature[10];
    }

    public Herd(int size)
    {
        //must size the array
        things = new Creature[size];
    }

    public void set(int spot, int creatureSize )
    {
        //set spot to new Creature
        things[spot] = new Creature((creatureSize));
    }

    public String toString()
    {
        return "" + Arrays.toString( things );
    }
}
