package org.example;

import java.util.Date;
import java.util.Scanner;

    public class Gastos {
        //Atributos

        String fecha;
        Double monto;
        String descripcion;
        int id;
        String nombre;


        Scanner sc = new Scanner(System.in);

        //comportamientos

        public void createGastos() {
            String[] tags = {"Fecha", "monto", "descripcion"};
            String[] Gastos = new String[3];

            System.out.println("Fecha");
            fecha = sc.nextLine();
            sc.nextLine();
            Gastos[0] = fecha;

            System.out.println("Monto incial");
            monto = sc.nextDouble();
            sc.nextLine();
            Gastos[1] = Double.toString(monto);

            System.out.println("Descripcion");
            descripcion = sc.nextLine();
            Gastos[2] = descripcion;
        }

    }
