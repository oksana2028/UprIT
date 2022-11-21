package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Напиши букву");
        Scanner scanner = new Scanner(System.in);
        String latter = scanner.nextLine();
        System.out.println(IsA(latter));

    }



    public static String IsA (String a) {
        String s = new String();
        if(a.equals("a") | a.equals("а")){
            s = "Wow! That's a!";
        }
        else{
            s = "Nah... That's not a...";
        }
        return s;
    }
}
