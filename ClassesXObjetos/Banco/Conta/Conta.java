package Banco.Conta;

/**
 *
 * @author jonat
 */
public class Conta {
    
    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
   
   
    public void sacar(float dinheiro){
        if(this.getSaldo() >= dinheiro)
            this.setSaldo(this.getSaldo()-dinheiro);
        else
            System.out.println("Você não pode sacar esse valor!");
    }
    
    public void depositar(float dinheiro){
        if(dinheiro > 500.0 || dinheiro <= 0 ){
            System.out.println("Digite um valor válido!");
            System.out.println("Você só pode depositar no máximo R$ 500.0");
        }
        else{
            this.setSaldo(this.getSaldo()+dinheiro);
        }
    }
    
    
}
