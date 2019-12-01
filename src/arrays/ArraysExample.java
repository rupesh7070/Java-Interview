package arrays;
public class ArraysExample {
    public static void main(String[] args) {
        ArraysExample arraysExample = new ArraysExample();
        arraysExample.moveAllZerosToEnd();
    }

    //Given an array of integers we need to move all the zeroes to the end and maintain the order of rest of the elements
    public void moveAllZerosToEnd() {
        int[] numbers = {1, 2, 0, 5, 0, 7, 0, 9};
        int length = numbers.length;
        int[] newArray = new int[length];

        for (int i = 0; i < length; i++) {
            if (numbers[i] == 0) {
                for (int j = i; j < length - 2; j++) {
                    numbers[j] = numbers[j + 1];
                }
                numbers[length - 1] = 0;
            }
        }
    }
}
