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
public class Hotel {
    public static void main (String [] args){
        int adultos, ninos, noches,nadulto;
        String res="";
        Scanner lector=new Scanner (System.in);
        System.out.println("Bienvenido al Hotel California ");
        System.out.println("Favor de indicar el numero de adultos que se hospedaran ");
        adultos=lector.nextInt();
        System.out.println("Favor de indicar el número de niños que se hospedaran ");
        ninos=lector.nextInt();
        System.out.println("Favor de indicar el número de noches que se hospedaran ");
        noches=lector.nextInt();
        if(ninos<3 && ninos>0){
            System.out.println("¿Todos los adultos pagaran plan alimenticio? (Si/No)");
            res=lector.next();
            if(res.equalsIgnoreCase("no")){
                System.out.println("¿Cuantos adultos pagaran el plan alimenticio?");
                nadulto=lector.nextInt();
            }
            else{
                nadulto=adultos;
            }
            System.out.println("El costo total seria "+Costo(adultos,ninos,nadulto,noches));
        }
        else{
            System.out.println("No aceptamos más de tres niños en este hotel, vaya a buscar una guarderia =D ");
        }
    }
    public static int Costo(int ad,int nin,int com, int noches){
        int cost=0;
        ad*=850;
        nin*=400;
        ad*=noches;
        nin*=noches;
        com*=150;
        com*=noches;
        cost=ad+nin+com;
        return(cost);
    }
}
