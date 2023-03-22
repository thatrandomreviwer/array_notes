import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
            //system.out.println(dave[23])   //causes an array out of bonds exception for reaching outside the range
        }
        //define an array of monster objects

        Monster[] list = new Monster[50];

        list[0] = new Monster();
        list[1] = new Monster(33);
        list[2] = new Monster(3,4);
        list[3] = new Monster(10,10);

        System.out.println(Arrays.toString(list));
        list[1].setAge(45);
        System.out.println(Arrays.toString(list));

        //arrayList notes

        ArrayList<Integer> ListOfNums= new ArrayList<>();
        System.out.println(ListOfNums);
        ListOfNums.add(27);
        ListOfNums.add(32);
        ListOfNums.add(-12);
        ListOfNums.add(1,521);
        ListOfNums.add(27);
        ListOfNums.remove(3);
        ListOfNums.remove(new Integer(27));
        System.out.println(ListOfNums.contains(27));
        System.out.println(ListOfNums);
        System.out.println(ListOfNums.set(1,973));
        System.out.println(ListOfNums.size());
        Collections.sort(ListOfNums);
        System.out.println(ListOfNums);
        System.out.println(ListOfNums.get(2));
        for (int i = 0; i < ListOfNums.size();i++){
            ListOfNums.set(i, ListOfNums.get(i)+52);
        }
        for (int item:ListOfNums){
            item += 52;
        }
        System.out.println(ListOfNums);
    }
}