import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //arrays
        //creating an array of integers named dave wit 23 total spots
        //numbered from 0 to 22
        int[] dave = new int[23];
        System.out.println(dave); //prints out memory address
        System.out.println(Arrays.toString(dave)); //uses utility class to display everything with []s and ","s
        System.out.println(dave[4]); //only prints out the value in spot #4
        for (int i = 0;i < dave.length;i++){  //dave.length give the value of how many total spots there are
            dave[i] = i;
            System.out.println(Arrays.toString(dave));
        }
    }
}