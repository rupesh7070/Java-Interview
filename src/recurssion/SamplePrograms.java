package recurssion;

public class SamplePrograms {
    public static void main(String[] args) {
        System.out.println(countFive(12515));
    }

    public void printNumbers(int num) {
        if (num == 0)
            return;
        else {
            System.out.println(num);
            printNumbers(num - 1);
        }

    }

    public static int printEyes(int cats) {
        if (cats == 0) {
            return 0;
        } else {
            return 2 + printEyes(cats - 1);
        }
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }

    }

    public static int power(int base, int num) {
        if (num == 1) {
            return base;
        } else {
            return base * power(base, num - 1);
        }
    }

    public static int fiboncaiiSeries(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fiboncaiiSeries(n - 1) + fiboncaiiSeries(n - 2);
        }
    }

    public static int countSpeaker(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 2 == 0) {
            return 2 + countSpeaker(num - 1);
        } else {
            return 1 + countSpeaker(num - 1);
        }
    }

    public static int sumOfDigit(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + sumOfDigit(num / 10);
        }
    }

    public static int countFive(int num) {
        if (num == 0) {
            return 0;
        } else {
            if (num % 10 == 5) {
                return 1 + countFive(num / 10);
            } else {
                return countFive(num / 10);
            }
        }
    }

}
