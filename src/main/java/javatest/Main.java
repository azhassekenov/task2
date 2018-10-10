package javatest;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Task2 task = new Task2();
        System.out.println("Enter number: ");
        Scanner scanner1 = new Scanner(System.in);
        String firstNumber = scanner1.nextLine();
        Integer a = Integer.parseInt(firstNumber);
        Integer b = task.summaVsehChisel(a);
        System.out.println(b);

    }
}