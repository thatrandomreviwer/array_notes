public class Monster {
    private int age, size;

    public Monster()
    {
        age = size = 0;
    }

    public Monster(int a)
    {
        age = age;
        size = 0;
    }

    public Monster(int a, int s)
    {
        age = a;
        size = s;
    }

    public void setAge( int a)
    {
        age = a;
    }

    public int getAge()
    {
        return age;
    }

    public boolean equals( Object obj )
    {
        Monster other = (Monster) obj;
        if( obj == null )
            return false;
        return age == other.age && size == other.size;
    }

    public String toString()
    {
        return age + " " + size;
    }
}
