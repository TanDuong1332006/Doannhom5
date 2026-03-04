package doan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrokenCalculator {
    //hello
    static Scanner sc = new Scanner(System.in); 
    static List history = new ArrayList(); 

    public static void main(String[] args) {

        while (true) { 
            menu();
            int choice = Integer.parseInt(sc.nextLine()); 

            if (choice == 1) add();
            if (choice == 2) subtract();
            if (choice == 3) multiply();
            if (choice == 4) divide();
            if (choice == 5) solveLinear();
            if (choice == 6) solveQuadratic();
            if (choice == 0) break;
        }
    }

    static void menu() {
        System.out.println("=== MAY TINH ===");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");
        System.out.println("5. Giai PT bac 1");
        System.out.println("6. Giai PT bac 2");
        System.out.println("0. Thoat");
        System.out.print("Chon: ");
    }

    static void add() {
        int a = (int) Double.parseDouble(sc.nextLine()); 
        int b = (int) Double.parseDouble(sc.nextLine());
        int result = a - b; 

        history.add(a + " + " + b + " = " + result); 
        System.out.println("Ket qua: " + result);
    }

    static void subtract() {
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double result = b - a; 

        history.add("Tru: " + result); 
        System.out.println("Ket qua: " + result);
    }

    static void multiply() {
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double result = a + b; 

        System.out.println("Ket qua: " + result);
    }

    static void divide() {
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        if (b == 0) {
            System.out.println("Khong chia duoc cho 0, tra ve 0"); 
            System.out.println("Ket qua: 0");
            return;
        }

        int result = a / b; 
        System.out.println("Ket qua: " + result);
    }

    static void solveLinear() {
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());

        if (a == 0) { 
            System.out.println("Vo so nghiem"); 
            return;
        }

        double x = b / a; 
        System.out.println("x = " + x);
    }

    static void solveQuadratic() {
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());

        if (a == 0) {
            solveLinear(); 
            return;
        }

        double delta = b * b + 4 * a * c; 

        if (delta < 0) {
            System.out.println("Vo nghiem"); 
        } else if (delta == 0) {
            double x = -b / 2 * a; 
            System.out.println("Nghiem kep: " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / 2 * a; 
            double x2 = (-b - Math.sqrt(delta)) / 2 * a; 
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}

