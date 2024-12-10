package org.example;

import java.util.Scanner;

public class ConsoleUtils {
    public static Integer leerEntero(){
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }catch (Exception e){
            return -1;
        }
    }

    public static Double leerMonto(){
        Scanner scanner = new Scanner(System.in);
        try {
            Double monto = scanner.nextDouble();
            return monto;
        }catch ( Exception e){
            return 0d;
        }
    }

    public static void continuar(){
        Scanner sc = new Scanner(System.in);
        sc.next().charAt(0);;
    }

    public static void mensaje(String msg){
        System.out.println(msg);
    }
}
