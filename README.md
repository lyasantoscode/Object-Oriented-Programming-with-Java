# Object-Oriented-Programming-with-Java
Object-Oriented Programming with Java (Orientação a objetos com java)

Objeto - Propriedades e Métodos


# Programação Orientada a Objetos (POO)

A Programação Orientada a Objeto (POO) tem como pilar teórico o conceito
de objeto, ou seja, um sistema orientado a objeto é um conjunto de objetos
que representam os seres e coisas do mundo real, interagindo computacional-
mente com as mesmas características e comportamentos reais.
À estrutura computacional que define o modelo de um objeto do mundo real
damos o nome de classe, e a partir dela cópias são construídas para serem
utilizadas para cada objeto real que tenho no meu sistema.
As características dos objetos do mundo real são chamadas de atributos
no mundo computacional, enquanto a seus comportamentos chamamos
métodos.

- **Classes** são estruturas que definem as características e comportamentos dos
seres ou coisas do mundo real; quando implementados em Java nas classes, essas
características passam a se chamar atributos, e os comportamentos
se transformam nos nossos métodos.

- **Objetos** são as instâncias das minhas classes, os seres que existem no meu mundo real quando são inseridos no mundo computacional.

- **Atributos** são as características inerentes ao meu ser ou coisa do mundo real quando são definidas no mundo computacional.

- **Métodos** são os comportamentos ou funções de um objeto do mundo real na forma como ele é tratado no mundo computacional.

## Exemplo

### Imagine o seguinte:

1. **O Mundo Real é como um Brinquedo de Faz de Conta**  
   Quando você brinca de casinha, cada brinquedo na sua brincadeira tem características e faz coisas diferentes. Por exemplo:
   - O **cachorrinho de brinquedo** tem:  
     - Características (atributos): cor marrom, orelhas compridas, nome Rex.  
     - Comportamentos (métodos): pode latir, correr, ou deitar.
   - A **boneca** tem:  
     - Características (atributos): cabelo loiro, vestido azul, nome Ana.  
     - Comportamentos (métodos): pode falar, dançar, ou dormir.

2. **Classe é a Receita para Criar o Brinquedo**  
   Pense que uma **classe** é como uma receita ou molde. Por exemplo:
   - Antes de você ter o cachorrinho Rex, alguém precisou criar um molde chamado "Cachorro".  
   - Esse molde diz: "Todo cachorro tem cor, nome e orelhas", e "Todo cachorro pode latir, correr e deitar".  
   - Quando você cria o brinquedo "Rex", está usando essa receita para fazer **um cachorrinho de verdade**.

3. **Objeto é o Brinquedo Pronto**  
   Depois que você usa a receita (classe), o que você cria é o **objeto**. Ou seja:  
   - A classe "Cachorro" é só a ideia.  
   - Quando você usa essa ideia para criar o Rex, o Rex é **um objeto**.  
   - Outro cachorro, como o "Bob", seria outro **objeto** da mesma classe.

4. **Atributos São as Características**  
   Quando você olha para o Rex, o que você vê? São os **atributos** dele:  
   - Cor: marrom  
   - Orelhas: compridas  
   - Nome: Rex  

   Esses atributos fazem cada objeto ser único. O Bob, por exemplo, pode ser branco, com orelhas pequenas.

5. **Métodos São o Que o Brinquedo Pode Fazer**  
   Agora, o que o Rex pode fazer? Ele tem comportamentos, chamados de **métodos**:  
   - **Latir**: Quando você chama ele, ele faz "au au!"  
   - **Correr**: Ele corre pelo quintal.  
   - **Deitar**: Quando você diz "senta", ele se deita.

### Resumo com um Exemplo Completo:

Pense que você quer fazer um jogo com cachorros. Aqui está como a POO funciona:

1. **Classe (Molde ou Receita):**  
   Você cria uma classe chamada `Cachorro`.  
   - Atributos: cor, nome, orelhas.  
   - Métodos: latir(), correr(), deitar().

2. **Objetos (Brinquedos ou Instâncias):**  
   Você cria dois objetos a partir da classe:  
   - Cachorro1: cor marrom, nome Rex, orelhas compridas.  
   - Cachorro2: cor branca, nome Bob, orelhas pequenas.

3. **Comportamento:**  
   - Quando você diz `Rex.latir()`, ele faz "au au!"  
   - Quando você diz `Bob.deitar()`, ele se deita.

### Código em Java para Visualizar:

```java
// 1. A classe é a receita
class Cachorro {
    // Atributos (características)
    String cor;
    String nome;
    String orelhas;

    // Métodos (comportamentos)
    void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    void correr() {
        System.out.println(nome + " está correndo!");
    }

    void deitar() {
        System.out.println(nome + " se deitou.");
    }
}

// 2. Criando os objetos (brinquedos prontos)
public class Main {
    public static void main(String[] args) {
        // Criando o primeiro cachorro
        Cachorro rex = new Cachorro();
        rex.cor = "Marrom";
        rex.nome = "Rex";
        rex.orelhas = "Compridas";

        // Criando o segundo cachorro
        Cachorro bob = new Cachorro();
        bob.cor = "Branco";
        bob.nome = "Bob";
        bob.orelhas = "Pequenas";

        // 3. Usando os métodos
        rex.latir();
        bob.correr();
    }
}
```

### Resultado do Código:

```
Rex está latindo: Au Au!
Bob está correndo!
```

Agora, você entende que POO é como brincar de faz de conta: você cria moldes (classes), faz brinquedos (objetos), e cada brinquedo tem suas características (atributos) e pode fazer coisas (métodos). 😊



# O Operador `new` e o Construtor

O operador `new` reserva (aloca) a memória para o objeto conforme
a estrutura de sua classe e retorna uma referência para essa área que foi
alocada. O código que vem após o operador `new` é o que chamamos de
**construtor da classe** e tem o mesmo nome da classe seguido de `( )` (abre
e fecha parênteses); dentro deles podem vir parâmetros, dependendo da
classe a ser utilizada e de sua definição.

## 1. A Classe é como um Plano ou Projeto

Pense que você quer construir um carro. Para isso, você precisa de um projeto que diga:

- Como o carro é feito.
- O que ele pode fazer.

Esse projeto é a classe. No mundo da programação, antes de criar um carro real (objeto), você precisa desse plano.

## 2. O Objeto é o Carro Pronto

Quando você constrói o carro de verdade usando o plano, você cria o **objeto**. No código, usamos o operador `new` para dizer "quero construir algo a partir desse plano".

### Exemplo em Java:

```java
Carro a = new Carro();
```

### Aqui está o que acontece:

- **`Carro`**: É o nome da classe (o plano do carro).
- **`a`**: É o nome do objeto que estamos criando (o carro que será construído).
- **`new`**: É como dizer "comece a construir".
- **`Carro()`**: É o **construtor**, que é responsável por montar o objeto, configurando-o inicialmente.

## 3. O Que o Operador `new` Faz

O operador `new` tem duas funções importantes:

1. **Reservar espaço na memória:**  
   O computador cria um espaço específico para armazenar o novo objeto (nesse caso, o carro).

2. **Chamar o construtor:**  
   O construtor é um "manual de instruções" que vem junto com o plano (classe). Ele pode configurar o objeto assim que ele é criado.

## 4. O Construtor

O **construtor** tem o mesmo nome da classe e serve para configurar o objeto quando ele é criado. Você pode:

- Deixar ele vazio (como `Carro()`).
- Passar informações (parâmetros) para ele, como a cor ou o modelo do carro.

### Exemplo com Parâmetros:

```java
Carro a = new Carro("Vermelho", "SUV");
```

Aqui, estamos dizendo:

- Crie um carro **vermelho** do tipo **SUV**.

## 5. Exemplo Completo em Java

```java
class Carro {
    // Atributos (características do carro)
    String cor;
    String modelo;

    // Construtor da classe (mesmo nome da classe)
    Carro(String cor, String modelo) {
        this.cor = cor; // Configura a cor do carro
        this.modelo = modelo; // Configura o modelo do carro
    }

    // Método para exibir os detalhes do carro
    void exibirDetalhes() {
        System.out.println("Cor: " + cor + ", Modelo: " + modelo);
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro a = new Carro("Vermelho", "SUV");

        // Usando o método para exibir os detalhes
        a.exibirDetalhes();
    }
}
```

### O Que Acontece no Código:

1. **`new Carro("Vermelho", "SUV")`:**
   - Cria um novo espaço na memória para o carro.
   - Chama o construtor `Carro(String cor, String modelo)` e passa os valores `"Vermelho"` e `"SUV"`.

2. **Dentro do Construtor:**
   - A cor e o modelo são configurados nos atributos do objeto.

3. **`a.exibirDetalhes()`:**
   - Imprime as informações do carro:

```
Cor: Vermelho, Modelo: SUV
```




## Resumo:

- O operador `new` é como apertar o botão "Construir" usando o plano da classe.
- O **construtor** é como o manual que explica como montar o objeto.
- Você pode passar informações no momento da criação, para que o objeto já nasça configurado. 😊

- UTILIZANDO O THIS NAS SUAS CLASSES
A palavra reservada this é utilizada para resolver ambiguidades
que haja entre os elementos de uma classe em relação ao seu nome, não
os confundindo com outros elementos que tenham vindo de outra clas-
se que tenham o mesmo nome. Normalmente, é utilizado para acessar
atributos ou métodos da classe ativa.
Vamos analisar no trecho de classe a seguir o método setIdade:
...
...
No código anterior, temos um atributo int idade pertencente à clas-
se corrente e no parâmetro do método setIdade(int idade), outro atributo
idade, sendo este último idade, o que será passado como parâmetro por
outro objeto que utilizará o método da nossa classe. Assim, na próxima
linha, onde temos idade = idade, está ocorrendo uma ambiguidade, que
idade é de quem? Para resolver esse tipo de dúvida, o elemento perten-
cente à classe corrente recebe o prefixo this seguido de ponto antes do
atributo. Agora o código fica da seguinte forma:
...
...
