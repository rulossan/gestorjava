package org.example;

import java.util.Scanner;

public class Users {

        //atributos
        int id;
        String name;
        String email;
        String password;
        String numerocuenta;
        Double saldo;


    Scanner sc=new Scanner(System.in);

        //comportamientos

        public void createUser(){
            String[] tags = {"id", "Name", "email", "Password"};
            String[]  Users= new String[4];

            System.out.println("id");
            id = sc.nextInt();
            sc.nextLine();
            Users[0]=Integer.toString(id);

            System.out.println("nombre");
            name = sc.nextLine();
            Users[1]=name;

            System.out.println("email");
            email = sc.nextLine();
            Users[2]=email;

            System.out.println("password");
            password = sc.nextLine();
            Users[3]=password;

        }

    public void createCuenta(){
        String[] tags = {"número de cuenta", "Saldo"};
        String[] Cuenta= new String[2];

        System.out.println("número de cuenta");
        numerocuenta = sc.nextLine();
        Cuenta[0]=numerocuenta;

        System.out.println("Saldo");
        saldo = sc.nextDouble();
        sc.nextLine();
        Cuenta[1]=Double.toString(saldo);
    }

}


