package phuctnh.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch (choose)
        {
            case 1:
                System.out.println("Phép + ");
                break;
            case 2:
                System.out.println("Phép - ");
                break;
            case 3:
                System.out.println("Phép * ");
                break;
            case 4:
                System.out.println("Phép / ");
                break;
            case 5:
                System.out.println("Bang cuu chuong ");
                break;
        }


    }
}