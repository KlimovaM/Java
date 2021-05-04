package less2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("#1");
        test();

        System.out.println("\n#1/1 " + verni (5, 10));

//        System.out.println("\n#1/1 (тест для себя) " + verni2 (5, 10)); // практика
//       System.out.println("\n#1/1 (еще тест для себя) " +  qw1 (8,4));  // практика



        System.out.println("\n#2");
        znach(9);


        System.out.println("\n#3 " +  checkNumber(-8));


        System.out.println("\n#4");
        povtor();
//        povtor2();



        System.out.println("\n#5 " + year(800));

        System.out.println("\n#5/1 " + year2(400));

    }


//1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static void test() {           // ну почти, почти
        int a = 5, b = 0, c = a + b;
        if (c > 10 && c < 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }



   public static boolean verni(int a, int b) {
            return (a + b >= 10 && a + b <= 20);
   }

//   public static boolean verni2(int a, int b) {
//        int c = a + b;
//        if (c > 10 && c < 20) {
//            return true; } else { return false;}
//   }


//    public static boolean qw1(int a, int b) {
//        return (a + b <= 20) && (a + b >= 10);
//    }



//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void znach(int a) {     // работает, но конечно не то что нужно? пересмотреть бы
        if (a >= 0) {
            System.out.println("Значение положительное");
        } else {
            System.out.println("Значение отрицательное");
        }
    }
//3. Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean checkNumber(int c) {
          return c <= 0;
    }



//4. Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void povtor() {
        for (int q = 0; q < 10; q++) {
            System.out.print("Hello ");
        }
    }



// practice
//    public static void povtor2() {
//        for (int z = 0; z < 5; z++ ) {
//            for (int x = 0; x < 5; x++) {
//                System.out.print("*");
//            }
//            System.out.println();}
//        }


//5. * Написать метод, который определяет,
// является ли год високосным, и возвращает boolean (високосный - true,
// не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
// при этом каждый 400-й – високосный.

    public static boolean year(int y) {
        if (y % 4 == 0) {
            return true;
        } else { return false; }
    }

//    public static boolean year2(int y) {
//        if (y % 4 == 0 && y == y + 400 || y % 100 != 0) {
//            return true;
//        } else { return false; }
//    }

    public static boolean year2(int y) {
        if (y % 4 == 0 || y % 100 != 0 && y == y + 400 ) {
            return true;
        } else { return false; }
    }

}