package net.ivanlopez;

import java.util.Scanner;

public class App {
//Prova de conflicte repositori local
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

        System.out.println("Escribe 10 numeros");
        int num_p = 0;
       for(int i = 0; i < 10;i++){
    	   int num = lector.nextInt();
    	   int num_petit = num;
    	   if(num < num_petit){
    		   num_p = num;
    	   }

            System.out.println("El numero mas pequeño es: " + num_p);
        }

	}

}
