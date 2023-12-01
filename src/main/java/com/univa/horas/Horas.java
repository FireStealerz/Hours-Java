package com.univa.horas;

import java.time.LocalTime;
import java.util.Scanner;

public class Horas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa Horas!\nIngrese una opcion del menu:\n" +
                "1.-Inicializado con hora 00:00:00\n" +
                "2.-Inicializacion customisada");
        int eleccion = scanner.nextInt();
        switch (eleccion) {
            case 1 -> {
                HorasInterface hr = new HorasInterface(); //Construftor vacio
                while (true) {
                    System.out.println("Eliga un programa a ejecutar:\n" +
                            "0.-Salir del programa\n" +
                            "1.-Imprimir\n" +
                            "2.-Segundos desde la medianoche\n" +
                            "3.-x segundos despues de medianoche\n" +
                            "4.-Segundos desde la hora proporcionada hasta la actual\n" +
                            "5.-Segundo siguiente\n" +
                            "6.-Seguno anterior\n" +
                            "7.-Igual que a la hora proporcionada\n" +
                            "8.-Menor que a la hora proporcionada\n" +
                            "9.-Mayor que a la hora proporcionada\n" +
                            "10,-Leer nueva hora");
                    int seleccion = scanner.nextInt();
                    switch (seleccion) {
                        case 1 -> {
                            hr.imprimir();
                        }
                        case 0 -> {
                            System.out.println("Gracias por todo! Saliendo del programa");
                            System.exit(0);
                        }
                        case 2 -> {
                            hr.aSegundos();
                        }
                        case 3 -> {
                            System.out.println("Ingresa segundos:");
                            long seg = scanner.nextLong();
                            hr.deSegundos(seg);
                        }
                        case 4 -> {
                            System.out.println("Ingresa un hora en formato HH:MM:SS");
                            scanner.nextLine();
                            String hora = scanner.nextLine();
                            LocalTime horas = LocalTime.parse(hora);
                            hr.segundosDesde(horas);
                        }
                        case 5 -> {
                            hr.siguiente();
                        }
                        case 6 -> {
                            hr.anterior();
                        }
                        case 7 -> {
                            System.out.println("Ingresa un hora en formato HH:MM:SS");
                            scanner.nextLine();
                            String hora = scanner.nextLine();
                            LocalTime horas = LocalTime.parse(hora);
                            hr.igualQue(horas);
                        }
                        case 8 -> {
                            System.out.println("Ingresa un hora en formato HH:MM:SS");
                            scanner.nextLine();
                            String hora = scanner.nextLine();
                            LocalTime horas = LocalTime.parse(hora);
                            hr.menorQue(horas);
                        }
                        case 9 -> {
                            System.out.println("Ingresa un hora en formato HH:MM:SS");
                            scanner.nextLine();
                            String hora = scanner.nextLine();
                            LocalTime horas = LocalTime.parse(hora);
                            hr.mayorQue(horas);
                        }
                        case 10 -> {
                            System.out.println("Ingrese un hora en foramto (0-24)");
                            int horas = scanner.nextInt();
                            System.out.println("Ingrese un minuto en formato (0-59)");
                            int minutos = scanner.nextInt();
                            System.out.println("Ingrese un segundo en formato (0-59)");
                            int segundo = scanner.nextInt();
                            hr.leer(String.valueOf(horas),String.valueOf(minutos),String.valueOf(segundo));
                        }
                    }
                }
            }
            case 2 -> {
                System.out.println("Ingrese un hora en foramto (0-24)");
                int horas2 = scanner.nextInt();
                System.out.println("Ingrese un minuto en formato (0-59)");
                int minutos2 = scanner.nextInt();
                System.out.println("Ingrese un segundo en formato (0-59)");
                int segundo2 = scanner.nextInt();
                HorasInterface hr = new HorasInterface(String.valueOf(horas2),  //Constructor customisado
                        String.valueOf(minutos2), String.valueOf(segundo2));
                while (true) {
                    System.out.println("Eliga un programa a ejecutar:\n" +
                            "0.-Salir del programa\n" +
                            "1.-Imprimir\n" +
                            "2.-Segundos desde la medianoche\n" +
                            "3.-x segundos despues de medianoche\n" +
                            "4.-Segundos desde la hora proporcionada hasta la actual\n" +
                            "5.-Segundo siguiente\n" +
                            "6.-Seguno anterior\n" +
                            "7.-Igual que a la hora proporcionada\n" +
                            "8.-Menor que a la hora proporcionada\n" +
                            "9.-Mayor que a la hora proporcionada\n" +
                            "10,-Leer nueva hora");
                    int seleccion = scanner.nextInt();
                    switch (seleccion) {
                        case 1 -> {
                            hr.imprimir();
                        }
                        case 0 -> {
                            System.out.println("Gracias por todo! Saliendo del programa");
                            System.exit(0);
                        }
                        case 2 -> {
                            hr.aSegundos();
                        }
                        case 3 -> {
                            System.out.println("Ingresa segundos:");
                            long seg = scanner.nextLong();
                            hr.deSegundos(seg);
                        }
                        case 4 -> {
                            System.out.println("Ingresa un hora en formato HH:MM:SS");
                            scanner.nextLine();
                            String hora = scanner.nextLine();
                            LocalTime horas = LocalTime.parse(hora);
                            hr.segundosDesde(horas);
                        }
                        case 5 -> {
                            hr.siguiente();
                        }
                        case 6 -> {
                            hr.anterior();
                        }
                        case 7 -> {
                            System.out.println("Ingresa un hora en formato HH:MM:SS");
                            scanner.nextLine(); //SE come el espacio extra
                            String hora = scanner.nextLine();
                            LocalTime horas = LocalTime.parse(hora); //
                            hr.igualQue(horas);
                        }
                        case 8 -> {
                            System.out.println("Ingresa un hora en formato HH:MM:SS");
                            scanner.nextLine();
                            String hora = scanner.nextLine();
                            LocalTime horas = LocalTime.parse(hora);
                            hr.menorQue(horas);
                        }
                        case 9 -> {
                            System.out.println("Ingresa un hora en formato HH:MM:SS");
                            scanner.nextLine();
                            String hora = scanner.nextLine();
                            LocalTime horas = LocalTime.parse(hora);
                            hr.mayorQue(horas);
                        }
                        case 10 -> {
                            System.out.println("Ingrese un hora en foramto (0-24)");
                            int horas = scanner.nextInt();
                            System.out.println("Ingrese un minuto en formato (0-59)");
                            int minutos = scanner.nextInt();
                            System.out.println("Ingrese un segundo en formato (0-59)");
                            int segundo = scanner.nextInt();
                            hr.leer(String.valueOf(horas),String.valueOf(minutos),String.valueOf(segundo));
                        }
                    }
                }
            }
        }
    }
}

