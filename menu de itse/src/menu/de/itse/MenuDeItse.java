/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.de.itse;

import java.util.Scanner;



/**
 *
 * @author tania
 */
public class MenuDeItse
{

    /**
     * @param args the command line arguments
     *///
    public static void main(String[] args)
    {
         System.out.print("\nInstituto Tecnologico Superior de Escarcega \n Gemma Jael Romero Gonzalez ");
                System.out.print("\nAyuda");
                System.out.print("\nLa opcion 1: Invierte una palabra  ");
                System.out.print("\nLa opcion 2: Imprime el largo de la cadena ");
                System.out.print("\nLa opcion 3: Lee una cadena y 2 numeros");
                System.out.print("\nLa opcion 4: Lee una cadena y el rango entre 2 numeros");
     
                Scanner manual = new Scanner (System.in);
   
        int opcion = manual.nextInt();
                
               
         
        switch (opcion)
        {    
            case 1: 
          String thania = manual.next();
                for (int i = thania.length() - 1; i >= 0; i--)
                {
                    char c = thania.charAt(i);
                    System.out.print(c);

                }
                break;
            
    }

    }
}
