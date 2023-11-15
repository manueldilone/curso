import javax.swing.*;
import java.security.Signature;
import java.util.Scanner;

public class OperadoresLogicoLogin {

    public static void main(String[] args) {





        String [][] usernames;
        usernames = new String[4][4];
        usernames[0][0]="Arly";
        usernames[0][1]="123";
        usernames[0][2]="Azul";
        usernames[0][3]="20 de Enero";
        usernames[1][0]="Fernando";
        usernames[1][1]="1234";
        usernames[1][2]="Rojo";
        usernames[2][0]="Tulio";
        usernames[2][1]="12345";
        usernames[2][2]="Blanco";
        usernames[3][0]="Admin";
        usernames[3][1]="321";
        usernames[3][2]="Rojo Vijo";



        int fila = usernames.length;
        int columna = usernames[0].length;


        for(int i=0;i< fila;i++ ){

            for(int j=0; j< columna; j++)
            {

                System.out.println(usernames[i][j]);

            }

        }









    }
}
