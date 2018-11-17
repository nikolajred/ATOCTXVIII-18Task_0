public class Task {


    //Task1_1

    public static int calcArea(int a) {
        int result = a * a;
        System.out.println("Area of squer:" + result);
        return result;
    }

    //Task1_2

    public static int calcDist(int t, int v1, int v2, int s ) {
        int s1 = t * v1;
        int s2 = t * v2;
        int sResDist = Math.abs(s - (s1 + s2));
        System.out.println("Distance between cars:" + sResDist);
        return sResDist;
    }

    //Task 1_3
    public static double calcRoots(int A, int B, int C) {
        int D = B * B - 4 * A * C;
        double x1 = (-B + Math.sqrt(D)) / (2 * A);
        double x2 = (-B - Math.sqrt(D)) / (2 * A);
        System.out.println("Roots of equation:" + A + "*x*x+" + B + "*x+" + C + "=0");
        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);
        return x1;
    }

    //Task 1_4
    public static void eqNumber(int a) {
        if (a > 0) {
            a = a + 1;
            System.out.println(a);
        }
        if (a < 0) {
            a = a - 2;
            System.out.println(a);
        }
        if (a == 0) {
            a = 10;
            System.out.println(a);
        }
    }

    //Task 1_5
    public static int sumMax(int A, int B, int C) {
        int sum = A + B + C;
        int numberMin1 = (Math.min(A, B));
        int numberMin2 = (Math.min(A, C));
        int numberMin3 = (Math.min(numberMin1, numberMin2));
        int sumMaxX = sum - numberMin3;
        System.out.println(sumMaxX);
        return sumMaxX;
    }

    //Task 1_6
    public static void eqNumb1(int x) {
        if (x == 0) {
            System.out.println(x + " нулевое число");
        } else if (x > 0 && x % 2 == 0) {
            System.out.println(x + " положительное четное число");
        } else if (x > 0 && x % 2 != 0) {
            System.out.println(x + " положительное нечетное число");
        } else if (x < 0 && x % 2 == 0) {
            System.out.println(x + " отрицательное четное число");
        } else if (x < 0 && x % 2 != 0) {
            System.out.println(x + " отрицательное нечетное число");
        } else {
            System.out.println("введите число");
        }
    }

    //Task 1_7
    public static void eqNumber2(int A, int B) {
        if (A > 2 && B <= 3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //Task 1_8
    public static void eqNumber3(int A, int B, int C) {
        if (A < B && B < C) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //Task 1_9
    public static void eqNumber4(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {

        if (firstNumber != secondNumber && firstNumber != thirdNumber && firstNumber != fourthNumber) {
            System.out.println(firstNumber + " число под №1 отлично от друих");
        } else if (secondNumber != firstNumber && secondNumber != thirdNumber && secondNumber != fourthNumber) {
            System.out.println(secondNumber + " число под №2 отлично от друих");
        } else if (thirdNumber != firstNumber && thirdNumber != secondNumber && thirdNumber != fourthNumber) {
            System.out.println(thirdNumber + " число под №3 отлично от друих");
        } else if (fourthNumber != firstNumber && fourthNumber != secondNumber && fourthNumber != thirdNumber) {
            System.out.println(fourthNumber + " число под №4 отлично от друих");
        } else {
            System.out.println("вы не выполнели условия ввода");
        }
    }

    //Task 1_10
    public static void eqNumber5(int K) {
        String message;
        switch (K) {
            case 1:
                message = "1 - плохо";
                System.out.println(message);
                break;
            case 2:
                message = "2 - неудовлетворительно";
                System.out.println(message);
                break;
            case 3:
                message = "3 - удовлетворительно";
                System.out.println(message);
                break;
            case 4:
                message = "4 - хорошо";
                System.out.println(message);
                break;
            case 5:
                message = "5 - отлично";
                System.out.println(message);
                break;
        }
    }

    //Task 1_11
    public static void eqMonth(int month) {
        switch (month) {
            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("зима");
                break;
            case 3:
                System.out.println("весна");
                break;
            case 4:
                System.out.println("весна");
                break;
            case 5:
                System.out.println("весна");
                break;
            case 6:
                System.out.println("лето");
                break;
            case 7:
                System.out.println("лето");
                break;
            case 8:
                System.out.println("лето");
                break;
            case 9:
                System.out.println("осень");
                break;
            case 10:
                System.out.println("осень");
                break;
            case 11:
                System.out.println("осень");
                break;
            case 12:
                System.out.println("зима");
                break;
            default:
                System.out.println("неверно ввели месяц");
                break;
        }
    }

    //Task 1_12

    public static void operOfNumbers(int A, int B, int numberOper) {
        switch (numberOper) {
            case 1:
                int sum = A + B;
                System.out.println("сумма равнв:" + sum);
                break;
            case 2:
                int sub = A - B;
                System.out.println("разница равна:" + sub);
                break;
            case 3:
                int mult = A * B;
                System.out.println("произвидение равно:" + mult);
                break;
            case 4:
                int div = A / B;
                System.out.println("деление равно:" + div);
                break;

        }
    }

    //Task 1_13
    public static int rows(int A, int B) {
        for (int i = A; i <= B; i++) {
            System.out.println(i);
        }
        return A;
    }

    //Task 1_14
    public static int rows1(int A, int B) {
        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

    //Task 1_15
    public static int rows2(int N) {
        int faktor = 1;
        for (int i = 1; i <= N; i++) {
            faktor *= i;
        }
        System.out.println(faktor);
        return faktor;
    }

    //Task 1_16
    public static void way(int A, int B) {
        while (A > B) {
            A = A - B;
        }
        System.out.println("длина незанятой части отрезка A:" + A);
    }

    //Task 1_17
    public static void searchMin(int N, int K) {
        while ((3 * K) < N) {
            K += 1;

        }
        System.out.println("наименьшее целое число K:" + --K);
    }

    //Task 1_18
    public static void cicle(int N, int P) {
        while (N > 0) {
            System.out.print(N % P);
            N /= 10;
        }
    }

    //Task 1_19
    public static void cicle1(int A, int B) {

        for (int i = A; i <= B; i++) {
            System.out.println(i);
            for (int j = ++A; j <= B; j++) {
                System.out.println(j);

            }
        }

    }
}
