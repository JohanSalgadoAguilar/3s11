/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz1;
import java.util.Scanner;
/**
 *
 * @author salgado's
 */
public class Matriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);  
         
           System.out.print("ingresa un numero: ");
        int mat = scanner.nextInt();
        
        char[][] matriz = new char[mat][mat];
        
        for (int i = 0; i < mat; i++) {
            for (int j = 0; j < mat; j++) {
               if (i == 0 || i == mat - 1 || j == 0 || j == mat - 1) {
                    matriz[i][j] = '*';
                    } else {
                    matriz[i][j] = ' ';
                      }
            }
        }
             for (int i = 0; i < mat; i++) {
            for (int j = 0; j < mat; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // TODO code application logic here
    }
    
}
