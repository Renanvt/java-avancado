# Tópicos

[Pacotes](#pacotes)
[Atributos](#atributos)
[Construtores](#construtores)
[Métodos](#métodos)
[Método Main](#o-método-main)
[Objetos Java](#objetos-java)
[Javabeans ou Pojo](#javabeans-ou-pojos)
[Estado e Comportamento](#estado-e-comportamento)

# PACOTES

Os pacotes são agrupamentos de classes, que nos auxiliam a separá-las de
acordo com uma determinada característica das classes. Esta organização se
faz necessária, pois por meio dela fica mais fácil para que outras pessoas que
olhem o seu código entendam o seu programa, além de auxiliar no trabalho
em equipe e manutenção do seu software. Dificilmente um programador que
faça um software mais complexo que uma calculadora não utilize pacotes.

```java
package dados;

public class Pessoa{

}
```

# ATRIBUTOS

Os atributos de uma classe são, basicamente, variáveis que se encontram dentro da classe, e que a ela pertencem. Como no exemplo a seguir, podemos ver
3 variáveis criadas dentro da classe Pessoa. O tipo de variável de cada atributo
deverá ser analisado e estipulado antes de se começar a programar. Para nosso
problema, precisamos de uma variável para guardar o nome, uma para a idade
e outra para o telefone. Ficou definido que, para o nome e para o telefone, será
utilizado o tipo String, enquanto que para a idade, será usado o tipo int.

```java
public class Pessoa{
    String nome;
    String telefone;
    int idade;
}
```

# CONSTRUTORES

```java
public Pessoa(){
    idade = 0;
    nome = "";
    telefone = ";
}
```
```java
public Pessoa(String nom, String tel, int id){
    nome = nom;
    telefone = tel;
    idade = id;
}
```

# MÉTODOS

Este possui 4 partes. Primeiro, é identificado se ele é acessível para outras classes.
Em seguida, temos que indicar se ao fim do método, este terá que retornar algum
valor ou não. Em seguida, temos o nome e, por fim, se ele irá receber algum tipo de
parâmetro ou não

```java
public boolean testeIdade(int idade) { }
```
```java
public boolean testeIdade(int idade) {
    if (idade >= 0)
        return true;
    else
        return false;
 }
```
## Método mostrarDados (getString)

```java
public String mostrarDados()
{
    String retorno = "Nome: " +nome+ " Idade: "+idade+ " Telefone: "+telefone;
    return retorno;
}
```

Um método não é identificado pelo seu nome, e sim pela sua assinatura. A
principal diferença é que na assinatura, além do nome, os parâmetros também
ajudam a identificar. Vamos criar um método chamado teste:

```java
public void teste(){}
```
A assinatura deste método é teste(). Se quisermos criar outro método com
o mesmo nome, devemos mudar a forma como os parâmetros estão chegando,
por exemplo:

```java
public void teste(String var1){...}

```

Porém, a assinatura de um método não leva em consideração o nome das
variáveis, ou seja, não é possível criar outro método chamado teste, que receba
uma variável do tipo String, mesmo que esta variável tenha outro nome. O que
é levado em conta é o número de parâmetros e a ordem deles. Logo, podemos
criar outro método:

```java
public void teste(String var1, String var2, int var3){...}

public void teste(String var1, int var2, String var3){...}

```

# O MÉTODO MAIN

Para que ele seja o início de seu programa, ele deve conter todos estes detalhes. Primeiro, o public indica que ele será aberto para outras classes. O static,
uma novidade para nós até o momento, indica que não precisaremos criar um
objeto desta classe para usar o main. Desta forma, o próprio java chama este
método por você. Void indica que o método não retorna nada e main é o seu
nome. Como parâmetro, ele recebe um vetor de Strings, que pode ser passado
ou não, quando se chama o main.

```java
public static void main (String args[]){ }

```

# OBJETOS JAVA

Depois, vamos adicionar uma linha de comando antes da classe Início, porém
depois do comando que indica o pacote daquela classe.

```java
import Dados.Pessoa;
```

A partir de agora, podemos criar e usar a classe Pessoa. Vamos usá-la para
criar um objeto. Dentro do método main, vamos inserir o seguinte comando:

```java
Pessoa pes = new Pessoa();
```

O comando acima cria um objeto do tipo Pessoa, chamado pes. Este comando
possui 2 etapas bem distintas. O “Pessoa pes” cria uma variável do tipo Pessoa.
Seria o equivalente a colocarmos “int pes”, que seria uma variável do tipo inteiro.
Porém, o objeto ainda não existe só nesta declaração. Neste momento, apenas a
referência ao objeto foi criada, ficando a cargo do “new Pessoa()” a função de instanciar o objeto, ou seja, criar o objeto na memória. O comando “new” reserva o
espaço na memória, que tem seu valor calculado quando informamos qual tipo
de objeto será criado, indicado no “Pessoa()”

Estas duas ações são tão distintas que podemos reescrever o código acima
em 2 linhas separadas.

```java
Pessoa pes;
pes = new Pessoa();
```

Porém, existe uma regra de que você não pode utilizar o objeto enquanto ele não
for criado na memória, ou seja, enquanto não for dado o comando “new” nele. 

Como temos 2 construtores disponíveis para
uso, para utilizar o construtor que recebe valores por parâmetros, basta mandar
os valores no comando new. Exemplo:

```java
Pessoa pes2 = new Pessoa(“João”,”(11)0980-0980”,13);
```

Vamos atribuir
alguns valores para seus atributos.

```java
pes.nome = “Fulano”;
pes.idade = 22;
pes.telefone = “(00) 7654-3210”;
```

Obs: Inserir o modificador public para cada atributo na classe

A partir de agora, o nosso objeto “pes” possui seus atributos com os valores
determinados naquele código. Para confirmar, vamos utilizar o método mostrarDados() para mostrar os valores dos atributos

```java
System.out.println(pes.mostrarDados());
```

O código e o resultado devem ficar desta maneira:

```java
package principal;
import Dados.pessoa;

public class Inicio {
    public static void main(String args[]){
        Pessoa pes;
        pes = new Pessoa();
        Pessoa pes2 = new Pessoa("João", "(11)0980-0980", 13);
        pes.nome = "Fulano";
        pes.idade = 22;
        pes.telefone = " (00) 7654-3210";
        System.out.println(pes.mostrarDados());
        System.out.println(pes2.mostrarDados();)
    }
}
```

Vamos ver um erro muito comum que ocorre no momento que trabalhamos com mais de um objeto dentro de um método. Vamos analisar a seguinte
operação:

```java
pes = pes2;
```

Em um primeiro momento, parece que os atributos foram replicados e
agora existem dois objetos contendo os mesmos valores. Porém, você irá perceber algo estranho quando você mudar o atributo de algum dos objetos. Se esta
linha acima for executada, caso você altere o atributo nome de um objeto, o outro
também será alterado. Isto porque os objetos não foram replicados, e sim apenas a variável que aponta para o objeto. Na verdade, existe um único objeto e 2
caminhos diferentes para se chegar nele. É extremamente importante fazer com
que cada variável criada para servir de objeto tenha o seu próprio comando new.
Atribuições desta forma podem levar a erros que não são facilmente identificados.

Existe um objeto especial, que podemos usar como quisermos e que nos
ajuda ao criar os métodos de algumas classes. Este objeto especial é o this. Não
há necessidade de criá-lo para utilizá-lo, porém ele tem um uso muito restrito.
Ele representa o próprio objeto. Complicado? Bom, como podemos pegar o atributo nome do objeto criado pes? Basta colocar:

```java
pes.nome;
```

orém, se estamos dentro da classe “Pessoa”, como podemos acessar o próprio atributo, sendo que cada objeto tem o seu? Fácil, coloque:

```java
this.nome;
```
```java
if (this.idade > 0)
```

O atributo que será utilizado inves da variável que está chegando pelo parâmetro

Mas agora uma questão importante, podemos criar um construtor que recebe
um objeto como parâmetro? A resposta é claro que sim, mas tem que ter certo
cuidado na hora que for trabalhar com ele

Este tipo de construtor é muito útil quando você possui objetos que você
quer replicar e evitar o erro de 2 variáveis apontarem para o mesmo objeto.
Basicamente, a gente recebe o objeto como parâmetro, mas dentro do construtor, cada atributo é tratado separadamente. O código desta função possui as
seguintes características:

```java
public Pessoa(Pessoa nova)
{
    this.nome = nova.nome;
    this.idade = nova.idade;
    this.telefone = nova.telefone;
}
```

# JAVABEANS OU POJOS

O que fizemos até agora foi criar duas classes, sendo que uma é a classe principal
e contém o método main, enquanto que a outra foi criada para ser utilizada. Esta
classe que foi criada com o intuito de se criar objetos dela foi feita da maneira
mais fácil possível, porém fica fora das convenções adotadas para se criar classes deste tipo.

Estas convenções foram escolhidas pela sociedade de desenvolvedores para
estabelecer um padrão entre as diferentes classes que são criadas ao redor do
mundo, e assim, desta forma, facilitar o uso de objetos criados a partir desta
classe. Apesar deste programa funcionar sem adotar estas convenções, o ideal
é segui-las para que sua classe possa ser facilmente reutilizável e para que você,
acostumado com as convenções, possa facilmente utilizar outras classes.

A primeira convenção é que um construtor que não receba parâmetros seja
feito para que valores vazios sejam atribuídos. Esta convenção já foi atendida
pela nossa classe.

Um próximo item seria tratar todos os atributos como private, ao invés de
public. Isso implica que não podemos acessar o atributo diretamente de outra
classe, como fizemos no exemplo anterior. Só que se colocarmos as variáveis
como privadas, nosso código ficará com problemas.

Ao colocar um atributo como private, faz-se necessário criar 2 métodos específicos para aquele atributo, voltados para desempenhar as 2 funções principais
de um atributo, receber valor e recuperar o valor que possui

Para isto, vamos criar os métodos para o atributo nome. O código, a seguir,
cria um método para inserir um valor em nome.

```java
public void setNome(String nome){
 this.nome = nome;
}
```

Veja que foi adotada a nomenclatura setNome para seguir um padrão. O nome do
método que irá inserir valores nos atributos sempre será set + Nome do Atributo.
Este método normalmente não possui retorno, pois é uma operação de inserção de conteúdo. Por isso, temos um parâmetro do mesmo tipo do atributo, e
este parâmetro está sendo atribuído para o atributo. Neste momento, podemos
notar como o this consegue diferenciar o atributo da variável.

Já o método que retorna o conteúdo do atributo fica um pouco diferente:

```java
public String getNome(){
 return this.nome;
}
```

É possível notar a diferença no nome, já que este faz a união do nome do atributo
com a palavra get. Além disso, ele possui o retorno do mesmo tipo do atributo
e não recebe nenhum parâmetro. Vamos ver como ficará nossa classe depois de
criados todos os gets e sets

```java
    private String nome;
    private String telefone;
    private int idade;

    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        return telefone;
    }

    public int getNome(){
        return Nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
```

```java
    pes.setNome("Fulano");
    pes.setIdade(22);
    pes.setTelefone("(00) 7654-3210");
```

```java
public void setIdade(int idade){
    if (testeIdade(idade))
        this.idade = idade;
    else
        this.idade = 0;
}
```
Com os métodos get e set criados, o ideal é que mesmo dentro da classe,
eles sejam utilizados. Assim, não há qualquer meio de um atributo não passar
pelo teste imposto no método. No nosso exemplo, vamos alterar tanto os construtores, quanto o método mostrarDados(). Verificamos na alteração também
que os métodos get e set estão sendo chamados como o uso do this, porém não
há necessidade deles. Como veremos mais adiante, os métodos fazem parte do
comportamento dos objetos, o que é algo compartilhado com todos. Foi utilizado o this apenas para enfatizar como utilizá-lo na classe.

```java

    public Pessoa(){
        this.setIdade(0);
        this.setNome("");
        this.setTelefone("");
    }

    public Pessoa(String nom, String tel, int id){
        this.setIdade(id);
        this.setNome(tel);
        this.setTelefone(nom);
    }

    public Pessoa(Pessoa nova){
        this.setIdade(nova.getNome());
        this.setNome(nova.getTelefone());
        this.setTelefone(nova.getIdade());
    }

    public String mostrarDados()
    {
        String retorno = "Nome: "+this.getNome() + " Idade: "+this.getIdade()+ " Telefone: "+this.getTelefone();
        return retorno;
    } 
```

Um código mostrado acima que vale a pena comentar é a atribuição de um objeto
para o outro. Vamos pegar a atribuição do atributo nome:

```java
this.setNome(nova.getNome());
```

Outra forma é direcionar os outros construtores para um único construtor.
Complicado? Nesta classe nós temos 3 construtores, que basicamente fazem a
mesma coisa, porém com atributos em quantidades e formatos diferentes. Porém,
o código dentro deles é muito parecido. Por que, em vez de ficar replicando as
chamadas dos métodos set em cada construtor, não elegemos um único construtor que terá estas chamadas dos métodos set e direcionamos os outros para
o construtor eleito? É bem simples se utilizarmos o this.

construtor eleito? É bem simples se utilizarmos o this.
Normalmente o construtor eleito para este trabalho é aquele que recebe os
atributos separadamente por parâmetro. Começando pelo primeiro construtor,
vamos chamar o construtor eleito da seguinte forma:

```java
this("","",0);
```

O comando this é usado de uma forma diferente neste caso. Não há necessidade do uso de pontos para chamada de método, apenas o this e os parâmetros.
Como o construtor eleito recebe nome, telefone e idade, nesta ordem, passamos
por parâmetro os valores que ele deverá colocar em cada atributo. Já no construtor que recebe o objeto como parâmetro, o comando ficará da seguinte forma:

```java
this(nova.getNome(), nova.getTelefone(), nova.getIdade());
```
Simplesmente estamos pegando cada atributo separadamente e mandando
em forma de parâmetro para o construtor eleito. Os três construtores juntos
ficam da seguinte forma:

```java
    public Pessoa(){
        this("","",0);
    }

    public Pessoa(String nom, String tel, int id)
    {
        this.setIdade(id);
        this.setTelefone(tel);
        this.setNome(nom);
    }

    public Pessoa (Pessoa nova)
    {
        this(nova.getNome(), nova.getTelefone(), nova.getIdade());
    }
```
Modificação nos construtores, para que todos apontem para um único construtor

# ESTADO E COMPORTAMENTO

A partir de uma única classe, podemos criar diversos objetos. Porém, existe
alguma forma de distinguir um objeto do outro? O que eles possuem em comum?
Vamos analisar o que é feito na classe. As classes são compostas por um conjunto
de atributos e métodos. O que ficou claro nos exemplos anteriores é que cada
objeto criado possui seus próprios atributos. Mesmo que for da mesma classe,
cada um possui o mesmo número e tipo de variáveis, mas cada um com o seu
valor. Neste caso, a classe só informa o modelo do que cada objeto irá conter,
mas o valor é gerenciado pelo objeto.

Este conjunto de atributos de um objeto define o estado em que ele se
encontra. Cada objeto, por ter os seus próprios atributos, pode estar em estados
diferentes. Por exemplo, dois objetos criados a partir da classe File, que gerencia arquivos do sistema. Um objeto pode estar com um documento em aberto
e pronto para alterar, enquanto que o outro pode já estar fechado, não podendo
mais alterar o arquivo. 

Já o comportamento que o objeto tem é algo descrito e compartilhado entre
todos os objetos por meio dos métodos. Estes possuem um código criado pelo
desenvolvedor, que não se altera de objeto para objeto, logo, todos possuem as
mesmas funções. Seus atributos podem acabar influenciando em um método,
mas todos os objetos têm acesso a todas as funções que os outros objetos têm. 

Podemos ver esta questão no nosso exemplo. Quando criamos dois objetos, ao
chamar a função setIdade(), ela irá atribuir o valor passado ou 0, dependendo do
valor. Porém, todos os objetos estão sujeitos a executar qualquer parte do código. 

## COMPARANDO OBJETOS

Se voltarmos algumas páginas, no momento em que é citado sobre a criação de
um objeto, vemos que o objeto é criado no momento em que usamos o comando
new. Antes disso, é criada uma variável (no nosso exemplo o “pes” e o “pes2”),
que vai servir de ponte para o nosso objeto quando resolvermos criá-lo. Ou seja,
podemos criar esta variável, e só depois de muitas linhas de código chamar o new. 

Isso nos faz pensar, o que é esse pes se ele existe antes mesmo de criar o
objeto? Podemos pensar nele como um ponteiro que aponta para o objeto quando
criado. Ou seja, quando executamos o seguinte comando:

```java
Pessoa pes;
```

Estamos criando um ponteiro que não aponta para lugar algum. A partir
do momento que fazemos:

```java
pes = new Pessoa();
```

O ponteiro pes recebe o endereço de onde o comando new criou o objeto.
Para termos certeza disto, basta colocar o seguinte comando:

```java
System.out.println(pes);
```

Irá aparecer um valor numérico precedido de um arroba e algumas letras. Isto
na verdade é o valor que pes possui, o endereço de seu objeto. Por isso, normalmente não trabalhamos com a variável pes diretamente. Sempre colocamos um
ponto para acessar o conteúdo do objeto apontado, como um método ou atributo.

Vamos efetuar uma alteração no nosso código. Quero que seja criado um
código que analise quem é a pessoa que possui a maior idade e mostre o nome
dela na tela

Baseado no código produzido até aqui, vamos acrescentar o seguinte código
dentro do método main, depois dos códigos já criados:

```java
if (pes > pes2)
    System.out.println(pes.getNome());
else
    System.out.println(pes2.getNome());
```

Apesar do NetBeans não apontar erro na sintaxe, nosso código acima contém
um erro grave. Ao compararmos os objetos por meio de seus ponteiros, na verdade estamos comparando qual endereço de memória possui o maior valor. Logo,
nosso código vai mostrar o nome de “pes” se o endereço apontado em pes for
maior. Para que seja efetuada a comparação correta, precisa-se especificar qual
atributo está sendo testado.

```java
if(pes.getIdade() > pes2.getIdade())
```