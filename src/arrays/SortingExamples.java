package arrays;

public class SortingExamples {

    public static void main(String[] args) {
        int[] numbers = {7, 8, 2, 1, 10, -1};
        System.out.println("Trying selection sort now ");
        printArrays(numbers);
        int[] sortedArraySelection = selectionSort(numbers);
        System.out.println("After selection sorting");
        printArrays(sortedArraySelection);

        System.out.println("Trying Bubble sort now ");

        int[] numbersAgain = {7, 8, 2, 1, 11, -1};
        printArrays(numbersAgain);
        int[] sortedArrayBubble = bubbleSort(numbersAgain);
        System.out.println("After bubble sorting");
        printArrays(sortedArrayBubble);

    }

    static void printArrays(int[] numvbers) {
        for (int i = 0; i < numvbers.length; i++) {
            System.out.println(numvbers[i]);
        }
    }

    //Selection sort
    public static int[] selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int smallestNumber = numbers[i];
            int smallestPosition = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (smallestNumber > numbers[j]) {
                    smallestNumber = numbers[j];
                    smallestPosition = j;
                }
            }
            //time for swap
            int temp = numbers[i];
            numbers[i] = smallestNumber;
            numbers[smallestPosition] = temp;
        }
        return numbers;
    }

    //Bubble sort
    public static int[] bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

//insertion sort

    public static int[] insertionSort(int[] numbers) {
        int[] sortedArray = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {

        }
        return sortedArray;

    }
}
