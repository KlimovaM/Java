package less3;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] nul = {0, 1, 1, 0, 0, 0, 1};
        System.out.println("Задание №1");
        zamena(nul);
        System.out.println("\n \nЗадание №2");
        int[] arr = new int[100];
        massiv(arr);

        System.out.println("\n \nЗадание №3");
        int[] min = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        min6(min);

        System.out.println("\n \nЗадание №4");
        //     int m = 3;
        //     int[][] mass = new int[3][3];
        //     printMass(mass);
        //      ptintOne(mass);
        //    int[][] mas = new int[3][3];
        int[][] nullOne = new int[5][5];
        ptintOne(nullOne);


        System.out.println("\n \nЗадание №5");
        int[] verni = massive(4, 3);
        arr1("print numb ", verni);


        System.out.println("\n \nЗадание №6");
        int[] arr6 = {1, 2, 3, 6, 9, 0}; //массив для поиска мин и макс значения
        arr1("mass = ", arr6); // вспомогательный метод для печати массива
        System.out.println("min = " + minPrint(arr6)); // сравнивает значения, если знач меньше или равно мин, напечатать его
        System.out.println("max = " + maxPrint(arr6)); //сравнивает, если значение больше или равно макс, то печатает его

        System.out.println("\n \nЗадание №7");

        int[] arr7 = {1, 1, 1, 1, 1, 5};
        arr1("mass = ", arr7);
        System.out.print(checkBalance(arr7));


        System.out.println("\n \nЗадание №8");


        String[] testArr = new String[2];
        System.out.println();
        //    min6();
        System.out.println("\n");
        //       massive();
    }

// 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void zamena(int[] nul) {
        // int[] nul = {0, 1, 1, 0, 0, 0, 1};
        //     System.out.println("nul.length " + nul.length);
        for (int a = 0; a < nul.length; a++) {
            if (nul[a] == 0) {
                nul[a] = 1;
                System.out.print(nul[a]);
            } else {
                nul[a] = 0;
                System.out.print(nul[a]);
            }
        }
    }

    /* 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100; */

    public static void massiv(int[] arr) {
        //     int[] arr = new int[100];
        for (int a = 0; a < 100; a++) {
            System.out.print(" " + a);
        }
    }



    /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2; */

    public static void min6(int[] min) {  /* работает конечно, но что-то слишком объемно */
        //         int[] min = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a = 0; a < min.length; a++)
            if (min[a] < 6) {
                min[a] *= 2;
                System.out.print(min[a] + " ");
            } else {
                System.out.print(min[a] + " ");
            }
    }

//       public static void min6(int[] min) {
//           //         int[] min = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//           for (int a = 0; a < min.length; a++) {
//               if (a < 6) {
//                   a *= 2;
//                   System.out.print(a);
//               } else {
//                   System.out.print(a);
//               }
//           }
//       }


/* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
то есть [0][0], [1][1], [2][2], ..., [n][n]; */

//    public static void twoMass (int[][] two) {
//        for (int i = 0; i < two.length; i++) {
//            for (int j = 0; j < two.length; j++) {
//                System.out.print(two[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

 /*   public static void printMass (int[][] mass) {
  //      for(int i = 0; i < mass[0].length; i++) {
  //          System.out.print(i + " ");
  //      }
  //      System.out.println();
        for(int i = 0; i < mass.length; i++) {
      //      System.out.print(i + 1 + " ");
            for(int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    } */

  /*  public static void ptintOne (int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[i][i] = 1;
            mass[i][mass.length - i - 1] = 1;
        }
    } */


    public static void ptintOne(int[][] nullOne) {   //это конечно сложно далось, я гуглила
        for (int i = 0; i < nullOne.length; i++) {
            for (int j = 0; j < nullOne[i].length; j++) {
                if (i == j || i == -1) nullOne[i][j] = 1;
                System.out.print(nullOne[i][j] + " ");
            }
            System.out.print("\n");
        }
    }


/* 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
 длиной len, каждая ячейка которого равна initialValue; */

    public static void arr1(String msg, int[] inArr) { //не забывать про вспомогательные методы
        System.out.print(msg);
        for (int i = 0; i < inArr.length; i++) {
            System.out.print(inArr[i] + " ");
        }
        System.out.println();
    }

    public static int[] massive(int len, int initialValue) {
        int[] len2 = new int[len];

        for (int i = 0; i < len2.length; i++) {
            len2[i] = initialValue;
        }
        return len2;
    }



    /* 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ; */

    public static int minPrint(int[] minArr) {
//        int[] minimum = {1, 2, 3, 6, 9, 0};
        int min = minArr[0];
        for (int i = 0; i < minArr.length; i++) {
            if (minArr[i] <= min) {
                min = minArr[i];
            }
        }
        return min;
    }

    public static int maxPrint(int[] maxArr) {
        int max = maxArr[0];
        for (int i = 0; i < maxArr.length; i++) {
            if (maxArr[i] >= max) {
                max = maxArr[i];
            }
        }
        return max;
    }



/* 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
если в массиве есть место, в котором сумма левой и правой части массива равны.
Примеры:
checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1 checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ. */

    public static boolean checkBalance(int[] arr7) {
        int r = 0, l = 0;
        for (int i = 0; i < arr7.length - 1; i++) {
            l += arr7[i];
            for (int j = i + 1; j < arr7.length; j++)
                r += arr7[j];
                if (l == r) return true;
                r = 0;
        }
        return false;
    }


/* 8. *** Написать метод, которому на вход подается одномерный массив и число n
(может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) ->
[ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами. */
}