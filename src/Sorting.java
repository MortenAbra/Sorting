import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        SortInterface is = new InsertionSort();
        SortInterface bs = new BubbleSort();
        SortInterface qs = new QuickSort();
        ArrayFiller af = new ArrayFiller();
        Scanner input = new Scanner(System.in);

        int[] age = new int[50000];
        int n = age.length;
        boolean sorting = false;

        af.fillArray(age);

        System.out.println("Which sorting method do you want to use?");
        System.out.println("Quicksort - 1, Insertionsort - 2 or Bubblesort - 3");
        var num = input.nextInt();


            switch (num) {
                case 1:
                    input.close();
                    qs.sorting(age, 0, n - 1);
                    break;
                case 2:
                    input.close();
                    is.sorting(age);
                    break;
                case 3:
                    input.close();
                    bs.sorting(age);
                    break;
                default:
                    System.out.println("You have to pick a valid number!");
                    break;
            }

    }
}
