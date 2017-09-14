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
public class IMC {
    public static void main (String [] args){
        Scanner lector= new Scanner (System.in);
        double peso, estatura,imc;
        System.out.println("¿Cual es tu peso? (kilogramos)");
        peso=lector.nextDouble();
        System.out.println("¿Cual es tu estatura? (metros)");
        estatura=lector.nextDouble();
        imc=Calculo(peso,estatura);
        if(imc>18.5 && imc<24.99){
            System.out.println("Tu IMC es "+imc+" estas en el rango normal");
        }
        else{
            if(imc<18.5){
                if(imc<16){
                    System.out.println("Tu IMC es "+imc+" tienes delgadez severa");
                }
                if(imc>16 && imc<16.99){
                    System.out.println("Tu IMC es "+imc+" tienes delgadez moderada");
                }
                if(imc>17 && imc<18.49){
                    System.out.println("Tu IMC es "+imc+"tienes delgadez leve");
                }
            }
            else{
                if(imc>=25){
                    if(imc>25 && imc<29.99){
                        System.out.println("Tu IMC es "+imc+" eres preobeso");
                    }
                    if(imc==25){
                        System.out.println("Tu IMC es "+imc+" eres sobrepeso");
                    }
                }
                if(imc>=30){
                    if(imc>30 && imc<34.99){
                        System.out.println("Tu IMC es "+imc+"tienes obesidad leve");
                    }
                    if(imc>35.00 && imc<39.99){
                        System.out.println("Tu IMC es "+imc+"tienes obesidad media");
                    }
                    if(imc>=40.00){
                        System.out.println("Tu IMC es "+imc+"tienes obesidad morbida");
                    }
                }
            }
        }
    }
    public static double Calculo(double p, double e){
        double res=0.0;
        res=p/(e*e);
        return (res);
    }
}
