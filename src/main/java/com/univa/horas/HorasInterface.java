package com.univa.horas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class HorasInterface {

    private String horas;
    private String minutos;
    private String segundos;


    private LocalTime sieteTreinta = LocalTime.parse("07:03:21"); //Acepta un string y lo convierte en Objeto HOra

    private LocalTime mediaNoche = LocalTime.MIDNIGHT;  //Crea un objeto hora de medianoche

    public HorasInterface(String horas, String minutos, String segundos) { //Crea un objeto horas con fehca customisadass
       leer(horas, minutos, segundos); 
    }

    public HorasInterface() { //Crea un objeto hora con hora predeterminada
        setHoras("00");
        setMinutos("00");
        setSegundos("00");
    }

     //Getters y Setters
    private String getHoras() {
        return horas;
    }

    private void setHoras(String horas) {
        this.horas = horas;
    }

    private String getMinutos() {
        return minutos;
    }

    private void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    private String getSegundos() {
        return segundos;
    }

    private void setSegundos(String segundos) {
        this.segundos = segundos;
    }

    public void leer(String horas,String minutos,String segundos) { //Asigna el la hora customisada y la valida
        switch (valida(horas,minutos, segundos)) {
            case 0 -> {
                setHoras(horas);
                setMinutos(minutos);
                setSegundos(segundos);
            }case 1 -> {
                setMinutos(minutos);
                setSegundos(segundos);
            }case 2 -> {
                setHoras(horas);
                setSegundos(segundos);
            }case 3 -> {
                setHoras(horas);
                setMinutos(minutos);
            }case 4 -> {
                setSegundos(segundos);
            }case 5 -> {
                setMinutos(minutos);
            }case 6 -> {
                setHoras(horas);
            }
        }
    }

    private int valida(String horas2,String minutos2,String segundos2) { //Valido la hora ingresada
        int horas = Integer.parseInt(horas2);
        int minutos = Integer.parseInt(minutos2); //Convierte el string en int
        int segundos = Integer.parseInt(segundos2);
        if (horas < 0 || horas > 24 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            setHoras("00");
            System.out.println("horas no valido!, poniendo 1 de remplazo!");
            return 1;
        } else if (horas >= 0 && horas <= 24 && minutos < 0 || minutos > 59 && segundos >= 0 && segundos <= 59) {
            setMinutos("00");
            System.out.println("minutos no valido, poniendo 1 de remplazo!");
            return 2;
        } else if ( horas >= 0 && horas <= 24 && segundos < 0 || segundos > 59 && minutos >= 0 && minutos <= 59 ) {
            setMinutos("00");
            System.out.println("segundos no valido, poniendo 1990 de remplazo!");
            return 3;
        } else if (horas < 0 || horas > 24 && minutos < 0 || minutos > 59 && segundos >= 0 && segundos <= 59) {
            setMinutos("00");
            setHoras("00");
            System.out.println("horas y minutos no valido, poniendo 1 de remplazo!");
            return 4;
        } else if ( horas < 0 || horas > 24 && minutos >= 0 && minutos <= 59 && segundos < 0 || segundos > 59) {
            setHoras("00");
            setSegundos("00");
            System.out.println("horas y segundos no valido poniendo 1 y 1990 de rempalzo!");
            return 5;
        } else if ( horas >= 0 && horas <= 24 && minutos < 0 || minutos > 59 && segundos < 0 || segundos > 59) {
            setMinutos("00");
            setSegundos("00");
            System.out.println("minutos y segundos no valido, poniendo 1 y 1990 de remplazo!");
            return 6;
        }
        return 0;
    }
    public void imprimir() {  //Imprime la hora
        System.out.println(sieteTreinta);
    }

    public void aSegundos() {
        LocalTime ahora = LocalTime.now(); //Checa la hora actual actual
        long distancia = mediaNoche.until(ahora ,ChronoUnit.SECONDS); //Calculaa la distancia en segundos de la hora actual a la media noche
        System.out.println(distancia);
    }

    public void deSegundos(long segundos) {
        LocalTime despues = mediaNoche.plusSeconds(segundos); //Calucla la hora despues de segundos despues de la medianoche
        System.out.println(despues);
    }

    public void segundosDesde (LocalTime hora) {
        long distancia = LocalTime.now().until(hora,ChronoUnit.SECONDS); //calucla la horad desde la hora que nosostros pongamos
        System.out.println(distancia);
    }

    public void siguiente() {
        String horaPred = getHoras() + ":" + getMinutos() +
                ":" + getSegundos(); //Convierte los elementos indiviudales en string para manipularlos
        LocalTime horaPreder = LocalTime.parse(horaPred); //Lo conveirte en objeto hora
        LocalTime horaSiguiente = horaPreder.plusSeconds(1); //le suma un segundo
        System.out.println(horaSiguiente);
    }

    public void anterior() {
        String horaPred = getHoras() + ":" + getMinutos() +
                ":" + getSegundos(); //  //Convierte los elementos indiviudales en string para manipularlos
        LocalTime horaPreder = LocalTime.parse(horaPred);  //Lo conveirte en objeto hora
        LocalTime horaSiguiente = horaPreder.minusSeconds(1); //le resta un segundo
        System.out.println(horaSiguiente);
    }

    public void copia() {
        String horaPred = getHoras() + ":" + getMinutos() +
                ":" + getSegundos();
        LocalTime horaPreder = LocalTime.parse(horaPred);
        LocalTime copia = horaPreder;   //Crea una copia de la hora
        System.out.println(copia);
    }

    public void igualQue(LocalTime hora) {
        String horaPred = getHoras() + ":" + getMinutos() +
                ":" + getSegundos();
        LocalTime horaPreder = LocalTime.parse(horaPred);
        System.out.println(horaPreder.equals(hora));  //checa si la hora es igual
    }

    public void menorQue(LocalTime hora) {
        String horaPred = getHoras() + ":" + getMinutos() +
                ":" + getSegundos();
        LocalTime horaPreder = LocalTime.parse(horaPred); //checa si la hora es meenor quue
        System.out.println(horaPreder.isBefore(hora));
    }

    public void mayorQue(LocalTime hora) {
        String horaPred = getHoras() + ":" + getMinutos() +
                ":" + getSegundos();
        LocalTime horaPreder = LocalTime.parse(horaPred);
        System.out.println(horaPreder.isAfter(hora)); //checa si la hora es mayor que
    }
}
