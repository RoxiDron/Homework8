import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1.1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        int oneWeight = weight[0];
        int twoWeight = weight[1];
        int threeWeight = weight[2];
        System.out.println(oneWeight);
        System.out.println(twoWeight);
        System.out.println(threeWeight);

        System.out.println("Task 1.2");
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractionalNumbers.length; i++) {
            System.out.println(fractionalNumbers[i]);
        }
        System.out.println("Task 1.3");
        int[] beautifulnumbers = {8, 23, 20, 17};
        for (int i = 0; i < beautifulnumbers.length; i++) {
            System.out.println(beautifulnumbers[i]);
        }
        System.out.println("Task 2");
        {
            int[] numbers = {1, 2, 3,};
            System.out.println(Arrays.toString(numbers));
        }
        {
        double[] numbersFractional = {1.57, 7.654, 9.986,};
        System.out.println(Arrays.toString(numbersFractional));
        }
        {
        int[] numbersBeautiful = {8, 23, 20, 17,};
        System.out.println(Arrays.toString(numbersBeautiful));
        }



        System.out.println("Task 3");
        {
            int[] numbers = {3, 2, 1,};
            System.out.println(Arrays.toString(numbers));
        }
        {
            double[] numbersFractional = {9.986,7.654, 1.57,};
            System.out.println(Arrays.toString(numbersFractional));
        }
        {
            int[] numbersBeautiful = {17, 20, 23, 8,};
            System.out.println(Arrays.toString(numbersBeautiful));
        }

        System.out.println("Task 4");
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;

            }
        }
            System.out.println(Arrays.toString(arr) + " ");


        int[] arrTwo = new int[]{8, 23, 20, 17};
        for (int i = 0; i < arrTwo.length; i ++) {
            if (arrTwo[i] % 2 != 0) {
                arrTwo[i] = arrTwo[i] + 1;

            }
        }
        System.out.println(Arrays.toString(arrTwo) + " ");
        double[] arrThree = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < arrThree.length; i ++) {
            if (arrThree[i] % 2 != 0) {
                arrThree[i] = arrThree[i] + 1;

            }
        }
            System.out.println(Arrays.toString(arrThree) + " ");



    }
}