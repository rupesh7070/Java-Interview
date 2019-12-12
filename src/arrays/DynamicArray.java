package arrays;

public class DynamicArray {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);

        System.out.println(dynamicArray.toString());

    }

    int initialSize = 2;
    int size = 0;
    int[] numbers = new int[initialSize];

    public void add(int n) {
        if (size <= initialSize - 1) {
            numbers[size] = n;
        } else {
            initialSize = 2 * size;
            int[] newNumbers = new int[initialSize];

            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
            numbers[size] = n;
        }
        size = size + 1;
    }

    private int[] copyArray(int[] numbers) {

        int[] newNumbers = new int[initialSize];
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
        return newNumbers;
    }

    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        for (int i = 0; i < numbers.length; i++) {
            buff.append(numbers[i] + ", ");
        }
        return buff.toString();

    }

}

