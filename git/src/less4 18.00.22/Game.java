//package less4;

import java.util.Random;
import java.util.Scanner;

public class Game {
    //    public static int sizeX = 3; // размер
//    public static int sizeY = 3; // размер
    public static int sizeX;
    public static int sizeY;
    public static char cell = '_'; // пустая ячейка для рисования поля
    public static char user = 'X'; // пользователь
    public static char ai = 'O'; // пк
    public static char[][] map; // двумерный массив для рисования карты

    public static Scanner pen = new Scanner(System.in); // для ввода Х в консуль от игрока
    public static Random rn = new Random(); // для генерации рандомных значений от пк


    public static void main(String[] args) {
        writeMap();
        printMap();



        while(true) {

            moveUser();
            printMap();

            if(win(user)) {
                System.out.println("User win!");
                break;
            }

            if(fullMap()) {
                System.out.println("Lose");
                break;
            }

            moveAi();
            printMap();


            if(win(ai)) {
                System.out.println("AI win!");
                break;
            }

            if(fullMap()) {
                System.out.println("Lose");
                break;
            }

        }
        System.out.println("Game over");



    }

    public static void writeMap() {  // создание игрового поля
        sizeX = 3;
        sizeY = 3;
        map = new char[sizeY][sizeX];

        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                map[y][x] = cell;
            }
        }
    }

    public static void printMap() {  // печать поля
        for (int y = 0; y < sizeY; y++) {
            System.out.print(y + 1 + "|");
            for (int x = 0; x < sizeX; x++) {
//                System.out.print(x + 1 /*+ "|"*/); // ne to
                System.out.print(map[y][x] + "|");

            }
            System.out.println();
        }
        System.out.println("-----------------");
    }

    public static void moveUser() { // ход человека
        int y;
        int x;
        System.out.println("Please, print your coordinate y↓ and x→: ");
        do {
            //           System.out.println("Enter your number from 1 to " + sizeX + " = ");
            //           System.out.print("Enter your number from 1 to " + sizeY + " = ");
            y = pen.nextInt() - 1; // от введенной цифры - 1, чтобы массив корректно воспринимал координату
            x = pen.nextInt() - 1; // от введенной цифры - 1, чтобы массив корректно воспринимал координату

        } while (!correct(y, x) || !empty(y, x));
        map[y][x] = user; //печатает карту
        System.out.println("Your move y:" + (y + 1) + " x:" + (x + 1)); //печатает введенные координаты

        //       y = pen.nextInt();
        //       x = pen.nextInt();

        //      map[y][x] = user;


    }

    public static void moveAi() {  // ход пк
        int y;
        int x;
        System.out.println("Please, print your coordinate y↓ and x→: ");
        do {
            y = rn.nextInt(sizeY);
            x = rn.nextInt(sizeX);
        } while (!empty(y, x));
        map[y][x] = ai;  // печатает карту для пк
        System.out.println("Ai move y:" + (y + 1) + " x:" + (x + 1)); //печатает координаты пк
    }
    /*
    //для проверки хода человека и его блокировки
    public static void aiWin{
        for(int y = 0; y < sizeY; y++) {
            for(int x = 0; x < sizeX; x++) {
                if(map[y][x] == cell) {
                    map[y][x] = user;
                    if(win(user));
                    map[y][x] = ai;
                }
            }
        }
    } */

 //    public static void moveAi2() {
 //       int y;
 //      int x;
 //       System.out.println("Please, print your coordinate y↓ and x→: ");
 //       boolean aiWin = false;
 //       boolean userWin = false;





    public static boolean win(char player) {
        if (map[0][0] == player && map[0][1] == player && map[0][2] == player) return true;
        if (map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
        if (map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;

        if (map[0][0] == player && map[0][1] == player && map[0][2] == player) return true;
        if (map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
        if (map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;

        if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true;
        if (map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;

        return false;
    }

    public static boolean correct(int y, int x) { // описывает что в игре нельзя ставить значения за пределы поля
        return y >= 0 && y < sizeY && x >= 0 && x < sizeX;
    }

    public static boolean empty(int y, int x) { //описывает пустые ячейки
        return map[y][x] == cell;
    }


    public static boolean fullMap() {
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                if (map[y][x] == cell) {
                    return false;
                }
            }
        }
        return true;
    }
}






