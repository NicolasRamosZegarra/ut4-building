package com.iesfm.BuildingException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    static int askInt() {
        System.out.println("Introduce un numero");
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }

    static Owner askOwner() {
        System.out.println("Introduce el nombre");
        String name = scanner.nextLine();
        System.out.println("Introduce el apellido");
        String surname = scanner.nextLine();
        return new Owner(name, surname);
    }

    static Owner[] OwnerArray() {
        int size = askInt();
        Owner[] owners = new Owner[size];
        for (int i = 0; i < owners.length; i++) {
            owners[i] = askOwner();
        }
        return owners;
    }

    static Apartment askApartments() {
        System.out.println("Introduce el numero de planta: ");
        Integer numFloor = null;
        while (numFloor == null) {
            try {
                numFloor = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Debe ser un numero");
            }
        }

        System.out.println("Introduce el numero de la puerta: ");
        Integer door = null;
        while (door == null) {
            try {
                door = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Debe ser un numero");
            }
        }

        System.out.println("Introduce todos los propietarios: ");
        Owner[] owners = OwnerArray();

        return new Apartment(numFloor, door, owners);
    }
}



