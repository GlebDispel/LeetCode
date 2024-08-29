import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] value = new int[]{0,1,2,3,4,5,6,7,8,9};

        ArrayShafler arrayShafler = new ArrayShafler();

        arrayShafler.shafler(value);
        System.out.println(Arrays.toString(value));



    }

 }

  class ArrayShafler{

    public int[] shafler(int[] values){
        Random rand = new Random();


        for (int i = 0; i < values.length; i++) {
            int j = rand.nextInt(values.length);
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }

        return values;

    }


 }


