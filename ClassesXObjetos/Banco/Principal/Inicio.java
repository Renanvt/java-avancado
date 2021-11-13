package Banco.Principal;

import Banco.Conta.Conta;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class Inicio {
    
    public static void main(String args[]){
        Conta c_corrente = new Conta();
        //Conta c_poupanca = new Conta();
        
        c_corrente.setSaldo(40);
        Scanner scan = new Scanner(System.in);
        System.out.println("Seu saldo é : "+c_corrente.getSaldo());
        System.out.println("Digite 1 para depositar, 2 para sacar");
        int op = scan.nextInt();
        float dep = 0;
        float sac = 0;
        switch(op){
            case 1:
                System.out.println("Quanto deseja depositar?");
                dep = scan.nextFloat();
                c_corrente.depositar(dep);
                break;
            case 2:
                System.out.println("Quanto deseja sacar?");
                sac = scan.nextFloat();
                c_corrente.sacar(sac);
                break;
            default:
                System.out.println("Você não digitou a opção correta!");
        }
        
        if(dep>0 && dep<=500.0)
            System.out.println("Você depositou: "+dep+" seu saldo é de: "+c_corrente.getSaldo());
        if(c_corrente.getSaldo() >= 0 && sac>0)
             if(sac > c_corrente.getSaldo()){
                sac = 0;
             }
            System.out.println("Você sacou: "+sac+" seu saldo é de: "+c_corrente.getSaldo());
        
    }
}
