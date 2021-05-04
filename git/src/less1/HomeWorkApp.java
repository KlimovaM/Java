package less1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
//      String printThreeWords1 = "Orange";     // тут получилось, но выводится не так как надо
//      String printThreeWords2 = "Banana";     // тут получилось, но выводится не так как надо
//      String printThreeWords3 = "Apple";      // тут получилось, но выводится не так как надо
//    System.out.println (printThreeWords1);    // тут получилось, но выводится не так как надо
//    System.out.println (printThreeWords2);    // тут получилось, но выводится не так как надо
//    System.out.println (printThreeWords3);    // тут получилось, но выводится не так как надо

        // String a = "Orange";                        // тут что-то не получается
        // String b = "Banana";                        // тут что-то не получается
        // String c = "Apple";                         // тут что-то не получается
        // System.out.println(a + b'' + c);            // тут что-то не получается
        //    public static int printThreeWords (int value1, int value2,) //???


        //   String text = "Orange \nBanana \nApple";         //почти №2, но не то что нужно
        //   System.out.println(text);                        //почти №2, но не то что нужно

        public static void printThreeWords() {
            System.out.println("Orange\n" + "Banana\n" + "Apple"); // ура ура)) получилось
        }

    public static void checkSumSign() {
        int a;
        a = 100;
        System.out.println ("a = " + a);
        int b;
        b = 200;
        System.out.println ("b = " + b);
        int c = a + b;
        System.out.print ("c = a + b = " + c);

        if (c > 0) {
            System.out.println ("\nСумма положительная");
        }
        if (c < 0) {
            System.out.println ("\nСумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;
      System.out.println (value);
        if (value <= 0) {
            System.out.println ("Красный");
        }
        if (value >= 0 && value <= 100)  {
            System.out.println ("Желтый");
        }
        if (value > 100) {
            System.out.println ("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 3;
         System.out.println ("a=" + a);
         System.out.println ("b=" + b);

        if (a >= b) {
            System.out.println ("a >= b");
        } else { System.out.println ("a < b"); }


    }

    }



