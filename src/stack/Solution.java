package stack;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    /*
     * Complete the equalStacks function below.
     */

    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        Stack firstStack = new Stack();
        Stack secondStack = new Stack();
        Stack thirdStack = new Stack();
        int firstHeight = 0;
        int secondHeight = 0;
        int thirdHeight = 0;

        for (int i = 0; i < h1.length; i++) {
            firstStack.push(h1[i]);
            firstHeight = firstHeight + h1[i];
        }

        for (int i = 0; i < h2.length; i++) {
            secondStack.push(h2[i]);
            secondHeight = secondHeight + h2[i];
        }

        for (int i = 0; i < h3.length; i++) {
            thirdStack.push(h3[i]);
            thirdHeight = thirdHeight + h3[i];
        }
        if(firstHeight > secondHeight && firstHeight > thirdHeight){
            firstStack.pop();

        }
        return 0;

    }

    private static boolean checkAgain(Stack<Integer> firstStack, Stack<Integer> secondStack, Stack<Integer> thirdStack) {
        int firstHeight = 0 ;
        while (!firstStack.isEmpty()){
            firstHeight = firstHeight +firstStack.pop();
        }
        while (!firstStack.isEmpty()){
            firstHeight = firstHeight +firstStack.pop();
        }
        while (!firstStack.isEmpty()){
            firstHeight = firstHeight +firstStack.pop();
        }
        return  false;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);
        System.out.println("Final output is " + result);

    }
}
