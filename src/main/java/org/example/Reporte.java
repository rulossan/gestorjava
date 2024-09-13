package org.example;

import java.util.Scanner;

public class Reporte {

    //Atributos
    String numerocuenta;
    String fechainicio;
    String fechafinal;

    Scanner sc=new Scanner(System.in);

    //comportamientos
    public void createReporte(){
        String[] tags = {"Fecha inicial", "Fecha Final"};
        String[] Reporte= new String[2];

        System.out.println("Fecha inicial");
        fechainicio = sc.nextLine();
        Reporte[0]=fechainicio;

        System.out.println("Fecha Final");
        fechafinal = sc.nextLine();
        Reporte[0]=fechafinal;
    }
}







