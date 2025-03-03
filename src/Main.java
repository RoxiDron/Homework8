import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1.1");
        int [] weight = new int [3];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;
        int oneWeight = weight [0];
        int twoWeight = weight [1];
        int threeWeight = weight [2];
        System.out.println(oneWeight);
        System.out.println(twoWeight);
        System.out.println(threeWeight);

        System.out.println("Task 1.2");
        double [] fractionalNumbers = {1.57, 7.654,9.986};
        for (int i = 0; i < fractionalNumbers.length; i++){
            System.out.println(fractionalNumbers[i]);
        }
        System.out.println("Task 1.3");
        int [] beautifulnumbers = {8, 23, 20, 17};
        for (int i = 0; i < beautifulnumbers.length; i++) {
            System.out.println(beautifulnumbers[i]);
        }
        System.out.println("Task 2");
        int [] numbers = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        double [] numbersFractional = {1.57, 7.654,9.986};
        for (int i = 0; i < numbersFractional.length; i++) {
            System.out.print(numbersFractional[i] + ",");
        }
        int [] numbersBeautiful = {8, 23, 20,};
        for (int i = 0; i < numbersBeautiful.length; i++) {
            System.out.print(numbersBeautiful[i] + ",");
        }
        int [] numbersBea = {17};
        for (int i = 0; i < numbersBea.length; i++) {
            System.out.print(numbersBea[i] + "\n");
        }
        System.out.println("Task 3");
        int [] numbersBeat = {8, 23, 20, 17};
        for (int i = numbersBeat.length - 1; i >=0;  i--) {
            System.out.print(numbersBeat[i] + ",");
        }
        double [] numbersFr = {1.57, 7.654,9.986};
        for (int i = numbersFr.length - 1; i>=0;  i--) {
            System.out.print(numbersFr[i] + ",");
        }
        int [] numbersTwoThree = {2, 3};
        for (int i = numbersTwoThree.length - 1; i>=0; i--) {
            System.out.print(numbersTwoThree[i] + ",");
        }
        int [] numbersOne = {1};
        for (int i = numbersOne.length - 1; i>=0;  i--) {
            System.out.print(numbersOne[i]+ "\n");
        }
        System.out.println("Task 4");
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length; i ++) {
                arr[i] = arr[i] + 1;

        }
                System.out.println(Arrays.toString(arr) + " ");

        int[] arrTwo = new int[]{8, 23, 20, 17};
        for (int i = 0; i < arrTwo.length; i ++) {
            arrTwo[i] = arrTwo[i] + 1;

        }
        System.out.println(Arrays.toString(arrTwo) + " ");
        double[] arrThree = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < arrThree.length; i ++) {
            arrThree[i] = arrThree[i] + 1;

        }
        System.out.println(Arrays.toString(arrThree) + " ");


    }
}