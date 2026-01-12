package entities;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exe1 {
    static void main(String[] args) {

        Random random = new Random();
        int[] numeri = new int[5]; //abbiamo il nostro array di 10 elementi non definiti

        Scanner scanner = new Scanner(System.in);


        //inserisco randomicamente con un for
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = random.nextInt(11);
            System.out.println(Arrays.toString(numeri));
        }


//    System.out.println("inserisci un numero valido da 0 a 10");
//    int numScelto = Integer.parseInt(scanner.nextLine());
//    System.out.println("adesso scegli in che posizione metterlo");
//    int posizioneNum = Integer.parseInt(scanner.nextLine());
//    System.out.println(numScelto + "|" + posizioneNum);
//
//    for (int i = posizioneNum; i < numeri.length; i++) {
//        numeri[posizioneNum] = numScelto;
//        System.out.println(Arrays.toString(numeri));
//    }

        int numScelto;
        do {
            System.out.println("inserisci un numero da 1 a 10(0 per uscire)");
            numScelto = Integer.parseInt(scanner.nextLine());

            if (numScelto != 0) {
                System.out.println("in che posizione vuoi mettere il numero scelto ? (0-4)");
                int posizioneNum = Integer.parseInt(scanner.nextLine());

                try {
                    numeri[posizioneNum] = numScelto;
                    System.out.println(Arrays.toString(numeri));
                } catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println("posizione non valida, scegli un numero tra 0 e 4");
                }
            }
        } while (numScelto != 0);
    }
}