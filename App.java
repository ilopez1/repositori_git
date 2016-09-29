package net.ivanlopez;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

        System.out.println("Escribe 5 numeros");
        int num_p = 0;
       for(int i = 0; i < 5;i++){
    	   int num = lector.nextInt();
    	   int num_petit = num;
    	   if(num < num_petit){
    		   num_p = num;
    	   }
            System.out.println("El numero mas pequeño es: " + num_p);
        }

	}

}
