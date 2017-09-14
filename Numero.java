/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author diegomorenoacevedo
 */
public class Numero {
    public static void main (String[] args){
        Scanner lector = new Scanner (System.in);
        int num;
        System.out.println("Dame el número entero a verificar ");
        num=lector.nextInt();
        if(num<0){
            if(Divisible(num)==0){
                System.out.println("Tu número es negativo y es divisible entre 2 ");
            }
            else{
                System.out.println("Tu número es negativo y es no divisible entre 2 ");
            }
            
        }
        else{
            if(num>0){
                if(Divisible(num)==0){
                    System.out.println("Tu número es positivo y es divisible entre 2 ");
                }
                else{
                    System.out.println("Tu número es positivo y es no divisible entre 2 ");
                }
            }
            else{
                System.out.println("Tu número es 0 y no es divisible entre dos ");
            }
        }
    }
    public static int Divisible(int n){
        int mod=0;
        mod=n%2;
        return(mod);
    }
    
}
