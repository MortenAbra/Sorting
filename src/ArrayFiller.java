import java.util.Random;

public class ArrayFiller {

    public ArrayFiller(){}

    public int[] fillArray(int[] arr) {

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt();
        }
        System.out.println("Array has been filled!");
        return arr;
    }
}
