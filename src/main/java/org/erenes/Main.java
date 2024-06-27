package org.erenes;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.util.Scanner;

@QuarkusMain
public class Main {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your message: ");
        String message = scanner.nextLine();

        System.out.println("Hello world");

        Quarkus.run(args);

    }
}
