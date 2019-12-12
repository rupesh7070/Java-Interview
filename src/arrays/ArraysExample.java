package arrays;

public class ArraysExample {
    public static void main(String[] args) {
        ArraysExample arraysExample = new ArraysExample();
        arraysExample.removeDuplicates();
    }

    //Given an array of integers we need to move all the zeroes to the end and maintain the order of rest of the elements
    public void moveAllZerosToEnd() {
        int[] numbers = {0, 1, 2, 0, 5, 0, 7, 0, 9};
        int length = numbers.length;
        int[] newArray = new int[length];

        for (int i = 0; i < length; i++) {
            if (numbers[i] == 0) {
                for (int j = i; j < length; j++) {
                    if (j == (length - 1)) {
                        numbers[j] = 0;
                    } else {
                        numbers[j] = numbers[j + 1];
                    }

                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    //Remove duplicates from a sorted array

    public void removeDuplicates() {
        int[] numbers = {1, 2, 2, 3, 4, 5, 5, 6};
        int count = 0;
        int first = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (first == numbers[i]) {
                count = count + 1;
            }
            first = numbers[i];
        }
        int lenthOfNewArray = numbers.length - count;

        int[] newNumber = new int[lenthOfNewArray];
        int ctn = 1;
        first = numbers[0];
        newNumber[0] = first;
        for (int i = 1; i < numbers.length; i++) {
            if (first == numbers[i]) {
                continue;
            } else {
                newNumber[ctn] = numbers[i];
                ctn = ctn + 1;
                first = numbers[i];
            }
        }
        for (int i = 0; i < newNumber.length; i++) {
            System.out.println(newNumber[i]);
        }
    }

    // Merge two sorted arrays

    public void mergeSortedArray() {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {3, 4, 5, 6, 7};
    }

    //remove duplicated from unsorted array
}
