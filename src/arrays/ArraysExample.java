package arrays;

public class ArraysExample {
    public static void main(String[] args) {
        ArraysExample arraysExample = new ArraysExample();
        arraysExample.moveAllZerosToEnd();
    }

    //Given an array of integers we need to move all the zeroes to the end and maintain the order of rest of the elements
    public void moveAllZerosToEnd() {
        int[] numbers = {0,1, 2, 0, 5, 0, 7, 0, 9};
        int length = numbers.length;
        int[] newArray = new int[length];

        for (int i = 0; i < length; i++) {
            if (numbers[i] == 0) {
                for (int j = i; j < length; j++) {
                    if (j == (length - 1)) {
                        numbers[j] = 0;
                    }else{
                        numbers[j] = numbers[j + 1];
                    }

                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
