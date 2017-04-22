/* Сергей Гусельников
Консольное приложение:
- ввод размера массива int
- ввод элементов массива

- меню с возможными операциями над ним:
- поиск чила по значению
- сортировка
 */

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        int n, m, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        n = sc.nextInt();
        int mass[] = new int[n];
        for(int i=0; i<mass.length ; i++) {
            System.out.println("Введите элемент " + (i + 1) + ":");
            mass[i] = sc.nextInt();
        }

        System.out.println("Операции с массивом:");
        System.out.println("    1. Поиск числа по значению");
        System.out.println("    2. Сортировка");
        m = sc.nextInt();
        switch(m) {
            case 1:
                System.out.println("Введите значение:");
                s = sc.nextInt();
                for (int i=0; i<mass.length; i++) {
                    if(mass[i] == s)
                        System.out.println("Такое значение есть в массиве с индексом " + i);
                }
                break;
            case 2:
                System.out.print("Initial array: ");
                for(int i=0; i<mass.length; i++)
                    System.out.print(mass[i] + " ");
                System.out.println();

                for(int i=(mass.length - 1); i>0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (mass[j] > mass[j + 1]) {
                            int tmp = mass[j];
                            mass[j] = mass[j + 1];
                            mass[j + 1] = tmp;
                        }
                    }
                }
                System.out.print("Sorted array: ");
                for(int i=0; i<mass.length; i++)
                    System.out.print(mass[i] + " ");
        }
    }
}
