package org.example;

import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("1=Piedra");
        System.out.println("2=Papel");
        System.out.println("3=tijera");
        int numeroJugador;
        int nueroComputador;
        String nombre="";

        System.out.println("Querido usuario Ingrese un numero para poder jugar: ");
        numeroJugador=teclado.nextInt();
        if (numeroJugador>3 ||numeroJugador<1){
            System.out.println("Porfavor ingrese un numero valido");
        }else {

            nueroComputador = (int) Math.random() * 3 + 1;

            switch (nueroComputador) {
                case 1:
                    nombre = "Piedra";
                    break;
                case 2:
                    nombre = "papel";
                    break;
                case 3:
                    nombre = "tijera";
                    break;

            }
            System.out.println("el computador eligio " + nombre);

            if (numeroJugador == nueroComputador) {
                System.out.println("hay un empate");
            } else if (numeroJugador == 1 && nueroComputador == 2) {
                System.out.println("El computador gano");

            } else if (numeroJugador == 2 && nueroComputador == 3) {
                System.out.println("El computador gano");
            } else if (numeroJugador == 3 && nueroComputador == 1) {
                System.out.println("El computador gano");

            } else if (numeroJugador == 2 && nueroComputador == 1) {
                System.out.println("El jugador gano");

            } else if (numeroJugador == 3 && nueroComputador == 2) {
                System.out.println("El jugador gano");
            } else if (numeroJugador == 1 && nueroComputador == 3) {
                System.out.println("El Jugador gano");
            } else {
                System.out.println("ingrese un numero valido");
            }
        }
    }
}
