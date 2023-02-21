public class MonsterReferences {
    public static void main ( String[] args )
    {
        Monster x = new Monster( 10, 10 );
        Monster y = x;

        System.out.println( x == y );
        System.out.println( x.equals( y )  );

        y = new Monster( 10, 10);

        System.out.println( x == y );
        System.out.println( x.equals( y )  );

        x = y;
        y = null;

        System.out.println( x == y );
        System.out.println( x.equals( y ) );

    }
}
