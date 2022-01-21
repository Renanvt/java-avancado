<!-- O objetivo desse exemplo é somar a nota1 com a nota2 que será inserida pelo
usuário no navegador. O resultado da nota será apresentado na mesma tela do
navegador após pressionar o botão gerar. -->
package escola;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = “notaBean”)
@RequestScoped
public class Nota {
 private int nota1;
 private int nota2;
 private double resultado;

 public void somar() {
 resultado = nota1 + nota2;
 }

 public int getNota1() {
 return nota1;
 }

 public void setNota1(int nota1) {
 this.nota1 = nota1;
 }

 public int getNota2() {
 return nota2;
 }

 public void setNota2(int nota2) {
 this.nota2 = nota2;
 }

 public double getResultado() {
 return resultado;
 }

 public void setResultado(double resultado) {
 this.resultado = resultado;
 }
}