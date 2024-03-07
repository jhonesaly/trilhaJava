# Trilha Java

## Introdução

Java é uma linguagem de programação amplamente utilizada que se destaca por suas características distintivas. Ela é conhecida por ser uma linguagem fortemente tipada, o que significa que as variáveis têm tipos de dados fixos e o compilador verifica rigorosamente a consistência de tipos durante a compilação. Isso contribui para a detecção precoce de erros e aumenta a segurança do código.

A portabilidade é outra característica notável do Java, uma vez que os programas escritos em Java podem ser executados em diferentes plataformas sem a necessidade de recompilação. Isso é possível devido à Máquina Virtual Java (JVM), que executa o código Java convertido para um formato intermediário chamado bytecode.

A orientação a objetos é um princípio fundamental em Java, proporcionando modularidade, reutilização de código e facilidade de manutenção. As classes e objetos formam a base para a criação de estruturas complexas, facilitando o desenvolvimento de software robusto e escalável.

A segurança é uma prioridade em Java, especialmente em ambientes online. A execução de código não confiável é controlada por meio do gerenciamento de memória automático e da inclusão de recursos como a verificação de arrays para prevenir vulnerabilidades.

Além disso, Java possui um sistema de coleta de lixo que gerencia automaticamente a alocação e desalocação de memória, aliviando os desenvolvedores dessa responsabilidade. A vasta biblioteca padrão de Java, juntamente com o suporte à comunidade e a multiplicidade de frameworks, torna a linguagem uma escolha robusta para uma variedade de aplicações, desde desenvolvimento web até aplicativos móveis.

Essas características tornam Java uma linguagem versátil e poderosa, atendendo às demandas de diversos cenários de desenvolvimento de software.

| Logo do Java | Mascote do Java |
|---|---|
|![Logo do Java](images/java_logo.png)|![Mascote do Java](images/Duke_(Java_mascot)_waving.svg)|


## Manipulações

Atribuições:

- "=" (recebe valor)
- "+=" (aumenta valor)
- "-=" (diminui valor)

Operações:

- "+" (adição)
- "-" (subtração)
- "*" (multiplicação)
- "/" (divisão)
- "%" (resto da divisão)

Comparações:

- "==" (igual a)
- "!=" (diferente de)
- ">" (maior que)
- ">=" (maior ou igual a)
- "<" (menor que)
- "<=" (menor ou igual a)

Operadores:

- "&&" (AND)
- "||" (OR)
- "!" (NOT)
- 
Incremento: "++" | ex: int num = 1; int resultado = ++num

## Convenções

- Nome de classe: MinhaClasse
- Nome de método: meuMetodo()
- Nome de constante: MINHA_CONSTANTE
- Nome de variável: minhaVariavel
- Linhas de código devem ter menos de 80 char
- Espaços para separar operadores, palavras-chave e elementos de controle de fluxo | ex: if (condição)
- Use comentários para documentar seu código (//linha)

## Tipos primitivos

- boolean (true ou false)
- char (caracteres unicode individuais ex:'a')
- byte (inteiros de 8 bits [-128 a 127])
- short (inteiros de 16 bits [-32.768 a 32.767])
- int (inteiros de 32 bits [-2.147.483.648 a 2.147.483.647])
- long (inteiros de 64 bits [-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 {+-9.2*10^18}])
- float (reais de 32 bits)
- double (reais de 64 bits)

**Casting**: mudar tipo de uma variável especificando o tipo desejado na frente da mesma (ex: int varInt = (int) varFloat;)

**Declaração com var**: a palavra-chave `var` no Java permite a inferência automática de tipos durante a declaração de variáveis, simplificando o código ao eliminar a necessidade de especificar o tipo explicitamente. É útil em situações onde o tipo é claro a partir do contexto, tornando o código mais conciso e legível. Essa adição visa melhorar a experiência do desenvolvedor sem comprometer a forte tipagem do Java.

Por exemplo:
```java
var numero = 42;  // O tipo int é inferido automaticamente
var texto = "Exemplo";  // O tipo String é inferido automaticamente
```

### Strings

Em Java, String são classes

- String nome = "Alyson";
- String message= """
                  Text Block
                  """;
métodos:
- .equals(): compara conteúdo de strings (ex: senha.equals("12345"))
- .equalsIgnoreCase(): compara conteúdo de strings desconsiderando case (ex: senha.equalsIgnoreCase("AjSa"))
- .format(%s, %d, %.xf): insere dentro da string variáveis do tipo string (%s), inteiro (%d) e real com x casas decimais (%.xf)
    (ex: String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor))

## Decisão

Em Java, as principais estruturas de decisão são `if`, `else if` e `else`.

1. **if:** Utilizado para executar um bloco de código se uma condição for verdadeira.

   ```java
   int idade = 18;
   if (idade >= 18) {
       System.out.println("Maior de idade");
   }
   ```

2. **else if:** Permite verificar condições adicionais se a condição do `if` não for atendida.

   ```java
   int nota = 75;
   if (nota >= 90) {
       System.out.println("A");
   } else if (nota >= 80) {
       System.out.println("B");
   } else {
       System.out.println("C");
   }
   ```

3. **switch:** Útil para avaliar várias condições sobre uma variável.

   ```java
   int diaDaSemana = 3;
   switch (diaDaSemana) {
       case 1:
           System.out.println("Domingo");
           break;
       case 2:
           System.out.println("Segunda-feira");
           break;
       // ... outros casos
       default:
           System.out.println("Dia inválido");
   }
   ```

Estas estruturas fornecem flexibilidade para tomar decisões com base em diferentes condições em seus programas Java.

## Entrada de dados

Certamente! Em Java, a leitura de dados pode ser realizada de várias maneiras.

### Scanner

Em Java, a classe `Scanner` é muito útil para ler dados do usuário a partir do teclado. Vamos abordar alguns pontos-chave:

1. **Importação da classe Scanner:**
   No início do seu programa Java, você precisa importar a classe `Scanner`. Isso é feito com a seguinte linha de código:

   ```java
   import java.util.Scanner;
   ```

   Essa instrução diz ao Java para usar a classe `Scanner` do pacote `java.util`.

2. **Criação de uma instância de Scanner:**
   Antes de usar o `Scanner`, você precisa criar uma instância dele. Isso é feito da seguinte maneira:

   ```java
   Scanner scanner = new Scanner(System.in);
   ```

   Aqui, `System.in` representa a entrada padrão, que é o teclado.

3. **Leitura de diferentes tipos de dados:**
   O `Scanner` oferece métodos para ler diferentes tipos de dados. Alguns dos mais comuns incluem:

   - `nextInt()`: Lê um número inteiro.
   - `nextDouble()`: Lê um número decimal.
   - `next()` ou `nextLine()`: Lê uma string.
   - a classe Scanner em Java não possui um método específico como 'nextBoolean()' para ler valores booleanos diretamente. No entanto, você pode ler uma string e, em seguida, converter para booleano.

   Exemplo de leitura de um número inteiro:

   ```java
   int numero = scanner.nextInt();
   ```

4. **Exibição de mensagens ao usuário:**
   Você pode usar `System.out.print` ou `System.out.println` para exibir mensagens indicando ao usuário o que deve ser inserido. Por exemplo:

   ```java
   System.out.print("Digite sua idade: ");
   ```

5. **Fechamento do Scanner:**
   Quando você terminar de usar o `Scanner`, é uma boa prática fechá-lo para liberar recursos. Isso é feito assim:

   ```java
   scanner.close();
   ```

   Fechar o `Scanner` é importante para evitar vazamento de recursos e possíveis problemas no programa.

Juntando tudo, aqui está um exemplo completo de como usar o `Scanner` para ler a idade do usuário:

```java
import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        // Criação de uma instância de Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibição da mensagem
        System.out.print("Digite sua idade: ");

        // Leitura de um número inteiro
        int idade = scanner.nextInt();

        // Exibição do resultado
        System.out.println("Sua idade é: " + idade);

        // Fechamento do Scanner
        scanner.close();
    }
}
```

### BufferedReader e Linha de comando

1. **BufferedReader para entrada do teclado:**
   Utilizando a classe `BufferedReader` para ler dados do teclado.

   ```java
   import java.io.BufferedReader;
   import java.io.IOException;
   import java.io.InputStreamReader;

   public class LeituraDados {
       public static void main(String[] args) throws IOException {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

           System.out.print("Digite uma frase: ");
           String frase = reader.readLine();

           System.out.println("Você digitou: " + frase);

           reader.close();
       }
   }
   ```

2. **Ler argumentos da linha de comando:**
   Para ler argumentos passados na linha de comando ao executar o programa.

   ```java
   public class LeituraDados {
       public static void main(String[] args) {
           if (args.length > 0) {
               System.out.println("Argumento passado: " + args[0]);
           } else {
               System.out.println("Nenhum argumento passado.");
           }
       }
   }
   ```

## Loops

Vamos abordar os loops mais comuns em Java, como `while` e `for`. Essas estruturas são utilizadas para repetir a execução de um bloco de código enquanto uma condição específica for atendida.

1. **Loop `while`:**
   O loop `while` executa um bloco de código enquanto uma condição for verdadeira. O seja, o que estiver dentro do parênteses, deve ser uma expressão booleana verdadeira. Aqui está um exemplo simples:

   ```java
   int contador = 0;
   while (contador < 5) {
       System.out.println("Contagem: " + contador);
       contador++;
   }
   ```

   Neste exemplo, o bloco de código dentro do `while` é repetido enquanto a variável `contador` for menor que 5.

2. **Loop `do-while`:**
   Similar ao `while`, mas garante que o bloco de código seja executado pelo menos uma vez, mesmo que a condição seja falsa inicialmente.

   ```java
   int contador = 0;
   do {
       System.out.println("Contagem: " + contador);
       contador++;
   } while (contador < 5);
   ```

3. **Loop `for`:**
   O loop `for` é frequentemente usado quando você sabe exatamente quantas vezes deseja repetir o código. Possui uma inicialização, uma condição e uma expressão de atualização, todos no cabeçalho do loop.

   ```java
   for (int i = 0; i < 5; i++) {
       System.out.println("Iteração: " + i);
   }
   ```

   Neste exemplo, o loop `for` é usado para iterar 5 vezes, de 0 a 4, de 1 em 1 (i++).

4. **Loop `for-each`:**
   Esse tipo de loop é específico para iterar sobre elementos de uma coleção, como arrays ou listas.

   ```java
   int[] numeros = {1, 2, 3, 4, 5};
   for (int numero : numeros) {
       System.out.println("Número: " + numero);
   }

   ArrayList<Produto> produtos = new ArrayList<>();
   for (Produto i: produtos) {
        System.out.println(i);
   }
   ```

   Aqui, o loop `for-each` percorre cada elemento do array `numeros`.

5. **Break e Continue:**
   - A palavra-chave `break` é usada para sair imediatamente de um loop.
   - A palavra-chave `continue` é usada para pular a iteração atual e continuar com a próxima.

   ```java
   for (int i = 0; i < 10; i++) {
       if (i == 5) {
           break; // Sai do loop quando i é igual a 5
       }
       if (i % 2 == 0) {
           continue; // Pula a iteração se i for par
       }
       System.out.println("Número ímpar: " + i);
   }
   ```

## Criação de Classes e Objetos em Java

### Public e Private

Em Java, as palavras-chave `public` e `private` são utilizadas para controlar o acesso aos membros de uma classe. Quando um atributo ou método é declarado como `public`, ele pode ser acessado por qualquer classe. Por outro lado, ao declarar como `private`, restringimos o acesso apenas à própria classe.

Exemplo:

```java
public class ExemploClasse {
    public int atributoPublico;
    private String atributoPrivado;

    // Métodos e construtores aqui...
}
```

### Getters e Setters

Para garantir um encapsulamento adequado, é comum utilizar métodos conhecidos como "getters" e "setters" para acessar e modificar os atributos privados de uma classe, impedindo que o usuário possa manipular diretamente os atributos.

Exemplo:

```java
public class ExemploClasse {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
}
```

Não, construtores, getters e setters são conceitos distintos, mas todos estão relacionados com a criação e manipulação de objetos em Java.

### Construtores

Os construtores são métodos especiais em uma classe que são chamados automaticamente quando um objeto dessa classe é instanciado. Eles são usados para inicializar os atributos do objeto ou realizar outras operações necessárias durante a criação. Um construtor em Java tem o mesmo nome da classe e não possui tipo de retorno.

Exemplo:

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

No exemplo acima, o construtor `Pessoa` recebe um parâmetro `nome` e `pessoa`, inicializando os atributos da classe.

#### Construtores herdados

Ao herdar de uma classe mãe em Java, a classe filha pode estender a funcionalidade da classe base e incluir seus próprios atributos. No entanto, a gestão dos construtores, especialmente quando há novos atributos na classe filha, requer atenção.

**Exemplo:**

Considere uma classe mãe `Pessoa` com dois atributos e construtores:

```java
public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

Agora, ao criar uma classe filha `Funcionario` com dois atributos adicionais, podemos usar o `super` para chamar o construtor da classe mãe:

```java
public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String cargo, double salario) {
        super(nome, idade); // Chama o construtor da classe mãe
        this.cargo = cargo;
        this.salario = salario;
    }
}
```

Ao criar uma instância da classe `Funcionario`, podemos inicializar tanto os atributos herdados da classe mãe quanto os novos atributos da classe filha:

```java
Funcionario empregado = new Funcionario("Alice", 30, "Desenvolvedor", 5000.0);
```

Dessa forma, garantimos que tanto os atributos da classe mãe quanto os da classe filha são inicializados corretamente ao criar um objeto da classe filha. O uso do `super` no construtor da classe filha é crucial para delegar a inicialização dos atributos herdados à classe mãe.

### Herança

Herança em Java permite a criação de uma nova classe que herda características de uma classe existente. A palavra-chave `extends` é usada para estabelecer essa relação. A classe filha herda atributos e métodos da classe mãe (superclasse).

Exemplo:

```java
public class Animal {
    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

public class Cachorro extends Animal {
    // Métodos específicos para a classe Cachorro...
}
```

### Annotations

Annotations são metadados que fornecem informações sobre o código-fonte. Elas são precedidas pelo símbolo `@` e podem ser aplicadas a classes, métodos, variáveis, etc. No contexto de Java, elas são usadas para fornecer informações adicionais ao compilador, ambiente de execução ou ferramentas. São uteis para gerar "hints" em caso de refatoração, indicando relações que precisam ser refatoradas também.

Exemplo:

```java
public class ExemploAnnotation {

    @Override
    // Indica que o método está substituindo um método na classe pai
    public void metodoOverride() {
        // Implementação aqui...
    }

    @Deprecated
    // Indica que o método está obsoleto e deve ser evitado
    public void metodoAntigo() {
        // Implementação aqui...
    }
}
```

#### Serialized

O annotation `@SerializedName` é uma anotação utilizada em bibliotecas de serialização e desserialização de JSON para associar o nome de um campo em sua classe Java com a chave correspondente em um objeto JSON. Essa anotação é comumente usada em conjunto com bibliotecas como o Gson, que converte objetos Java em JSON e vice-versa.

```java
public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;

   public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }
}

```

No exemplo, as anotações `@SerializedName` estão sendo usadas para indicar como os campos da classe `Titulo` devem ser serializados e desserializados quando trabalhamos com JSON. Por exemplo, o campo Java `nome` será serializado como a chave "Title" no JSON, e o campo `anoDeLancamento` será serializado como a chave "Year".

Isso é particularmente útil quando você está lidando com APIs ou serviços web que trocam dados no formato JSON, garantindo que os nomes dos campos em sua classe Java estejam alinhados com as expectativas do JSON que você está enviando ou recebendo.

### Polimorfismo em Java

O polimorfismo em Java refere-se à capacidade de entidades (métodos ou objetos) assumirem diferentes formas. Existem dois tipos principais: sobrecarga, com métodos de mesmo nome e diferentes parâmetros, e sobreposição, com métodos em classes relacionadas.

#### Sobrecarga (Overloading)

Definição: Múltiplos métodos com o mesmo nome, mas diferentes parâmetros.

Exemplo:

```java
public class ExemploPolimorfismo {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }
}
```

#### Sobreposição (Overriding)

Definição: Uma classe filha fornece implementação específica para um método já definido na classe pai.

Exemplo:

```java
public class Animal {
    public void fazerSom() {
        System.out.println("Som genérico de animal");
    }
}

public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Latindo...");
    }
}
```

O polimorfismo torna o código mais flexível e reutilizável, permitindo o tratamento genérico de classes base, enquanto ainda executa comportamentos específicos das implementações.

### Protected em Java

A palavra-chave `protected` em Java é um modificador de acesso que permite o acesso a membros (atributos e métodos) dentro da mesma classe, em subclasses (herança) e no mesmo pacote. Aqui está um resumo com um exemplo de código:

```java
public class ExemploProtected {
    protected int idade;  // Atributo protegido

    protected void exibirIdade() {
        System.out.println("Idade: " + idade);
    }
}

// Classe filha que herda de ExemploProtected
public class Filha extends ExemploProtected {
    public void mostrarInformacoes() {
        idade = 25;  // Acesso direto ao atributo protegido da classe pai
        exibirIdade();  // Chama o método protegido da classe pai
    }
}
```

No exemplo acima, a classe `Filha` pode acessar o atributo `idade` e o método `exibirIdade()` da classe `ExemploProtected` porque estão marcados como `protected`. Isso ilustra como o modificador `protected` facilita a implementação de herança ao permitir o acesso controlado a membros nas classes derivadas.

## Pacotes e Importações

Em Java, pacotes são mecanismos de organização de classes e interfaces. Eles ajudam a evitar conflitos de nomes entre classes e fornecem uma estrutura hierárquica para organizar o código. A importação, por sua vez, permite o uso de classes de outros pacotes no código atual.

### Pacotes

Definição: Pacotes são diretórios que contêm classes relacionadas, organizando o código Java. Eles ajudam na modularização e reutilização de código.

Exemplo de Declaração de Pacote:

```java
package com.example.classes;

public class MinhaClasse {
    // Código da classe aqui...
}
```

### Importações

Definição: Importações permitem que você use classes de outros pacotes em seu código. Isso simplifica a referência a essas classes e evita a necessidade de escrever o caminho completo toda vez.

Exemplo de Importação:

```java
package com.example;

import com.example.classes.MinhaClasse;  // Importa a classe dentro da pasta classes

public class Main {
    public static void main(String[] args) {
        MinhaClasse objeto = new MinhaClasse();
        // Uso da classe ArrayList aqui...
    }
}
```

Ao importar, é possível utilizar apenas '*' para importar todas as classes dentro da pasta.

```java
package com.example;

import com.example.classes.*;
...
```

## Interface e Implements

Em Java, interfaces são contratos que definem um conjunto de métodos que uma classe deve implementar. A palavra-chave `implements` é usada para indicar que uma classe está seguindo o contrato de uma interface.

### Interface

Definição: Uma interface em Java é um conjunto de métodos abstratos (sem implementação) que serve como um contrato para as classes que a implementam. Elas permitem alcançar a abstração total.

Exemplo de Interface:

```java
public interface Animal {
    void emitirSom();
    void dormir();
}
```

### Implements

Definição: A palavra-chave `implements` é usada para declarar que uma classe está comprometida em fornecer implementações para os métodos definidos em uma ou mais interfaces.

Exemplo de Implementação:

```java
public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Latindo...");
    }

    @Override
    public void dormir() {
        System.out.println("Zzzzz...");
    }
}
```

No exemplo acima, a classe `Cachorro` implementa a interface `Animal` e fornece implementações para os métodos `emitirSom()` e `dormir()`. Isso garante que qualquer classe que implemente a interface `Animal` deve fornecer essas implementações.

Interfaces são cruciais para alcançar a abstração e fornecer uma maneira consistente de definir contratos entre classes em Java. O uso de `implements` garante que uma classe está aderindo aos requisitos definidos pela interface.

## Coleções

Em Java, listas, arrays e matrizes são estruturas de dados fundamentais chamadas genericamente de coleções.

Arrays (vetores) são coleções fixas de elementos do mesmo tipo.

Matrizes são arrays bidimensionais.

Listas, como ArrayList, são versões dinâmicas que podem crescer ou diminuir.

1. **Arrays:**
   - `length`: Retorna o comprimento do array.
   - Exemplo:

     ```java
     int[] numeros = {1, 2, 3};
     int tamanho = numeros.length; // Resultado: 3
     ```

2. **Matrizes:**
   - Acessadas por `[linha][coluna]`.
   - Exemplo:
  
     ```java
     int[][] matriz = {{1, 2}, {3, 4}};
     int elemento = matriz[0][1]; // Resultado: 2
     ```

3. **ArrayList (Lista):**

     ```java
     import java.util.ArrayList;

     ArrayList<String> nomes = new ArrayList<>();
     ```

### ArrayList

**ArrayList em Java:**

O `ArrayList` é uma implementação da interface `List` em Java, sendo uma coleção dinâmica que pode crescer ou diminuir conforme necessário. Ao contrário de arrays convencionais, o `ArrayList` permite adicionar, remover e acessar elementos de forma flexível, proporcionando maior versatilidade em manipulações de dados.

**Principais Métodos do ArrayList:**

1. **`add(elemento)`:** Adiciona um elemento ao final da lista.

    ```java
    import java.util.ArrayList;

    ArrayList<String> nomes = new ArrayList<>();
    nomes.add("Alice");
    nomes.add("Bob");
    ```

2. **`remove(index)`:** Remove o elemento no índice especificado.

    ```java
    nomes.remove(0); // Remove "Alice"
    ```

3. **`get(index)`:** Retorna o elemento no índice especificado.

    ```java
    String primeiroNome = nomes.get(0); // Resultado: "Bob"
    ```

4. **`size()`:** Retorna o número de elementos na lista.

    ```java
    int tamanho = nomes.size(); // Resultado: 1
    ```

O `ArrayList` é especialmente útil quando a quantidade de elementos é dinâmica e precisa ser gerenciada eficientemente durante a execução do programa. Sua versatilidade o torna uma escolha comum para muitas operações de manipulação de listas em Java.

## instanceof

A palavra-chave `instanceof` em Java é utilizada para verificar se um objeto é uma instância de uma determinada classe ou implementa uma interface específica. Isso é útil para verificar o tipo de um objeto antes de realizar operações específicas a esse tipo.

**Exemplo:**

```java
public class Animal {
    // Algumas propriedades e métodos da classe Animal
}

public class Cachorro extends Animal {
    // Propriedades e métodos específicos de Cachorro
}

public class TesteInstanceOf {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();

        // Verificando se meuAnimal é uma instância de Animal
        if (meuAnimal instanceof Animal) {
            System.out.println("É uma instância de Animal");
        }

        // Verificando se meuAnimal é uma instância de Cachorro
        if (meuAnimal instanceof Cachorro) {
            System.out.println("É uma instância de Cachorro");
        }
    }
}
```

Neste exemplo, `meuAnimal instanceof Animal` retorna `true`, indicando que `meuAnimal` é uma instância de `Animal`. Da mesma forma, `meuAnimal instanceof Cachorro` também retorna `true`, pois `meuAnimal` é, na verdade, uma instância de `Cachorro`.

Essa verificação de tipos é valiosa ao lidar com herança e polimorfismo, permitindo que o código se adapte dinamicamente ao tipo real do objeto em execução.

## Ordenação

### Ordenação com Collections.sort

No Java, a ordenação de listas torna-se simples com o método `sort` da classe `Collections` quando os objetos são comparáveis. Este método, por exemplo, coloca uma lista de Strings em ordem alfabética.

```java
import java.util.Collections;
import java.util.ArrayList;

public class OrdenacaoExemplo {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList();
        listaNomes.add("Bruna");
        listaNomes.add("Cecília");
        listaNomes.add("Alice");
        Collections.sort(listaNomes);
        System.out.println(listaNomes); //Saída: [Alice, Bruna, Cecília]
    }
}
```

### Comparable e compareTo

A interface `Comparable` é fundamental ao lidar com objetos personalizados, como a classe `Titulo`, ao realizar ordenações em Java. Essa interface permite que você defina a lógica de comparação específica para seus objetos, possibilitando que o Java compreenda como ordená-los corretamente.

Ela é usada quando você precisa especificar uma ordem natural para seus objetos. Por exemplo, se você tiver uma classe `Titulo` e desejar que os títulos sejam ordenados com base em critérios específicos, como ano de lançamento, nome ou qualquer outro atributo, a implementação da interface `Comparable` é necessária.

Ao implementar `Comparable`, você define a lógica de comparação no método `compareTo`, indicando como um objeto deve ser comparado a outro para determinar a ordem.

Observe que a implementação do método `compareTo` ao implementar a interface não é opcional. Pode parecer esquisito o `compareTo` aparecer dentro do `@Override`, mas o que etá acontecendo é que você está usando o `compareTo` de outra classe (String, por exemplo), para modificar o `compareTo` da classe atual (Titulo, por exemplo).

Observe também que a Class em `Comparable<Class>` deve ser sempre da mesma classe ou de uma superclasse da classe sendo criada. Essa é a maneira de indicar que a classe Titulo é comparável com outras instâncias da mesma classe.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoLancamento;

    // Construtor, getters e setters

    @Override
    public int compareTo(Titulo outroTitulo) {
        return Integer.compare(this.anoLancamento, outroTitulo.anoLancamento);
    }

    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("Titulo1", 2010));
        listaTitulos.add(new Titulo("Titulo2", 2005));
        listaTitulos.add(new Titulo("Titulo3", 2015));

        Collections.sort(listaTitulos);

        // Exibindo a lista ordenada
        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.getNome() + " - Ano: " + titulo.getAnoLancamento());
        }
    }
}
```

Neste exemplo, a classe `Titulo` é comparável com base no ano de lançamento. A lista de títulos é então ordenada de acordo com esse critério específico ao utilizar `Collections.sort`.

## Declaração flexível

Por exemplo, a classe `ArrayList` implementa a interface `List`, que por sua vez é uma subinterface de `Collection`. Ao declararmos uma lista como `List<Tipo> lista`, ganhamos a flexibilidade de trocar facilmente a implementação subjacente sem alterar o restante do código.

```java
List<String> lista = new ArrayList<>();
// Ou, se preferir trocar a implementação:
List<String> outraLista = new LinkedList<>();

List<Integer> lista = new ArrayList<>();
```

Observe, entretanto, que ao criar uma List deve-se usar uma variável genérica (Generics) para funcionar.

Estes conceitos são essenciais para o desenvolvimento em Java, proporcionando flexibilidade e eficiência no gerenciamento e manipulação de listas. Continue praticando para aprimorar suas habilidades de programação em Java.

### Generics

Generics em Java são uma poderosa característica que permite criar classes, interfaces e métodos que operam com tipos de dados desconhecidos até o momento da compilação.

**Declaração de Generics:**

A declaração de generics é feita usando parâmetros de tipo, indicados entre colchetes angulares `< >`.

```java
public class Caixa<T> {
    private T conteudo;

    public void armazenar(T novoConteudo) {
        conteudo = novoConteudo;
    }

    public T obterConteudo() {
        return conteudo;
    }
}
```

**Uso de Generics:**

Ao criar instâncias de classes genéricas, você especifica o tipo de dados que a classe irá manipular.

```java
Caixa<String> caixaDeTexto = new Caixa<>();
caixaDeTexto.armazenar("Olá, Generics!");
String conteudo = caixaDeTexto.obterConteudo();
```

**Métodos Genéricos:**

Generics também podem ser aplicados a métodos, permitindo flexibilidade no tipo de dados a ser manipulado.

```java
public <T> T primeiroElemento(List<T> lista) {
    return lista.isEmpty() ? null : lista.get(0);
}
```

**Bounded Wildcards:**

Limitar os tipos que podem ser usados em generics, conhecido como Bounded Wildcards, oferece mais controle sobre os tipos aceitáveis.

```java
public static double somaLista(List<? extends Number> listaNumeros) {
    double soma = 0.0;
    for (Number numero : listaNumeros) {
        soma += numero.doubleValue();
    }
    return soma;
}
```

Generics proporcionam reusabilidade, tipo seguro e flexibilidade ao lidar com estruturas de dados e algoritmos em Java, permitindo que você escreva código mais genérico e robusto.

## Map

- **Definição:** `Map` é uma interface que representa uma coleção de pares chave-valor, onde cada chave é única e mapeada para um único valor.

- **Características:**
  - Não pode conter chaves duplicadas.
  - Permite associar valores a chaves específicas.
  - Fornece métodos para recuperar, inserir, remover e verificar a presença de chaves e valores.

- **Principais Implementações:**
  - `HashMap`: Implementação baseada em tabela de dispersão, oferecendo alta eficiência em operações básicas, como inserção, remoção e recuperação. Não garante ordem de inserção ou ordenação das chaves.
  - `TreeMap`: Implementação baseada em árvore de busca binária balanceada (árvore vermelho-preta), garantindo ordenação natural das chaves ou uma ordem definida por um comparador.
  - `LinkedHashMap`: Implementação que mantém a ordem de inserção dos pares chave-valor, além de permitir a ordenação baseada em acesso (ordem de último acesso).

- **Métodos Importantes:**
  - `put(key, value)`: Adiciona um par chave-valor ao mapa.
  - `get(key)`: Retorna o valor associado à chave especificada.
  - `containsKey(key)`: Verifica se o mapa contém uma chave específica.
  - `keySet()`: Retorna um conjunto de todas as chaves no mapa.

### HashMap

- **Definição:** `HashMap` é uma implementação da interface `Map` que armazena os pares chave-valor em uma estrutura de tabela de dispersão.

- **Características:**
  - Permite inserção, remoção e recuperação de pares chave-valor em tempo constante, em média (O(1)).
  - Não garante a ordem de inserção dos elementos.
  - Permite que chaves e valores sejam `null`.
  - É não sincronizado, o que significa que não é seguro para uso em ambientes concorrentes sem sincronização externa.

- **Uso Comum:**
  - Ideal para situações em que a ordem dos elementos não é importante e o acesso rápido aos elementos é prioritário.
  - Amplamente utilizado para armazenar dados em cache, construir índices e realizar mapeamentos simples entre chaves e valores.

Resumindo, `Map` é uma interface que define a estrutura de dados de mapeamento chave-valor, enquanto `HashMap` é uma das implementações mais comuns dessa interface, fornecendo uma estrutura eficiente para armazenar e manipular pares chave-valor em Java.

  ```java
  import java.util.HashMap;
  import java.util.Map;

  public class ExemploHashMap {
      public static void main(String[] args) {
          // Criando um HashMap
          Map<String, Integer> mapa = new HashMap<>();

          // Adicionando elementos
          mapa.put("Chave1", 10);
          mapa.put("Chave2", 20);
          mapa.put("Chave3", 30);

          // Acessando valores
          int valor = mapa.get("Chave2");
          System.out.println("Valor associado à Chave2: " + valor); // Valor associado à chave2: 20
      }
  }
  ```

Em resumo, `Map` é uma interface que define a estrutura de um mapa chave-valor, enquanto `HashMap` é uma implementação específica dessa interface, utilizando uma tabela de dispersão para armazenar os dados. O `HashMap` é amplamente utilizado em Java para operações eficientes de mapeamento.

## Maven 

O Apache Maven é uma ferramenta de automação de construção e gerenciamento de projetos que simplifica o processo de compilação e gestão de dependências em projetos Java.

### Adicionar Bibliotecas com Maven no VSCode

**Crie ou abra o projeto no VSCode:**
   Certifique-se de que o seu projeto Java está aberto no VSCode.

**Caso não tenha, crie o arquivo `pom.xml`:**

- Crie um arquivo chamado `pom.xml` na raiz do seu projeto.
- Adicione o seguinte conteúdo inicial:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>seuGrupo</groupId>
    <artifactId>seuArtefato</artifactId>
    <version>1.0-SNAPSHOT</version>
</project>
```

Substitua "seuGrupo" e "seuArtefato" pelos valores apropriados para o seu projeto.

**Configurar no VSCode:**

- Abra o VSCode e instale a extensão "Java Extension Pack" se ainda não tiver.
- O VSCode normalmente reconhecerá automaticamente que o projeto agora usa o Maven.

**Adicionar dependências:**

- Dentro do arquivo `pom.xml`, você pode adicionar dependências especificando-as dentro da tag `<dependencies>` dentro da tag `<project>`.

Exemplo de adição de dependência para o Log4j:

```xml
<project>
...
    <dependencies>
        <!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.10.1</version>
        </dependency>
    </dependencies>
</project>
```

**Atualizar o projeto:**

- Execute o comando Maven para baixar as dependências e atualizar o projeto:
  
```bash
mvn clean install
```

Agora, seu projeto deve estar configurado com o Maven, e você pode adicionar dependências conforme necessário. Lembre-se de ajustar as configurações no `pom.xml` conforme a necessidade do seu projeto.

### MVN repository

O Maven Repository, muitas vezes referido como "MvnRepository" ou "Central Repository", é um repositório centralizado para armazenar e disponibilizar artefatos de software relacionados ao ecossistema do Apache Maven. O Maven é uma ferramenta de gerenciamento de construção e projeto amplamente utilizada na comunidade Java.

O MvnRepository serve como um repositório de artefatos compilados, bibliotecas e plugins Maven, permitindo que os desenvolvedores acessem e baixem dependências necessárias para seus projetos. Essas dependências podem incluir bibliotecas de terceiros, frameworks e outras ferramentas.

Os desenvolvedores podem declarar as dependências de seus projetos em arquivos de configuração específicos do Maven (como o arquivo pom.xml). Quando o projeto é construído usando o Maven, a ferramenta automaticamente baixa as dependências necessárias do MvnRepository e as inclui no projeto, facilitando a gestão de dependências e a construção de aplicativos Java.

acesse em: [mvn repository link](https://mvnrepository.com/)

## Java Record

Records são uma forma concisa de criar classes imutáveis e transparentes para dados. Eles são frequentemente usados para representar dados simples e não mutáveis, como estruturas de dados.

Alguns pontos importantes sobre records:

1. **Imutabilidade:** Os records são automaticamente imutáveis, o que significa que seus atributos não podem ser alterados depois de criados. Isso contribui para uma abordagem mais segura e fácil de entender para lidar com dados.

2. **Métodos padrão:** Records geram automaticamente métodos padrão, como equals(), hashCode() e toString(), com base nos atributos da classe. Isso economiza tempo e reduz a necessidade de escrever código boilerplate.

3. **Declaratividade:** A declaração de um record é concisa, focando apenas na definição dos atributos. O compilador Java cuida da implementação dos métodos padrão, simplificando o código.

Exemplo de um record simples:

```java
public class ExemploRecord {

    // Definindo o record Pessoa
    public record Pessoa(String nome, int idade) {
        // Nenhum método adicional é necessário, pois o compilador gera automaticamente equals, hashCode e toString
    }

    public static void main(String[] args) {
        // Criando uma instância do record Pessoa
        Pessoa pessoa = new Pessoa("João", 25);

        // Exibindo os dados usando o método toString() gerado automaticamente
        System.out.println("Dados da Pessoa: " + pessoa);

        // Acessando os atributos do record
        String nome = pessoa.nome();
        int idade = pessoa.idade();

        // Exibindo os atributos individualmente
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

```

Neste exemplo, o record "Pessoa" possui dois atributos, "nome" e "idade", e todos os métodos padrão são automaticamente gerados pelo compilador.

## Dependências

### Gson

A biblioteca Gson é uma ferramenta em Java que facilita a conversão de objetos Java para formato JSON e vice-versa. Ela é amplamente utilizada para serialização e desserialização de dados, tornando mais fácil a comunicação entre sistemas que compartilham informações no formato JSON.

Principais usos e métodos da biblioteca Gson:

1. **Serialização para JSON:**
   - `toJson(Object obj)`: Converte um objeto Java para uma representação JSON em formato de string.

2. **Desserialização de JSON para objetos Java:**
   - `fromJson(String json, Class<T> classOfT)`: Converte uma string JSON para um objeto Java do tipo especificado pela classe.

3. **Configurações e personalizações:**
   - Gson oferece várias opções de configuração, como o uso de anotações para personalizar o processo de serialização e desserialização.

4. **Tratamento de tipos complexos:**
   - Pode lidar com coleções, arrays, mapas e tipos complexos de forma eficiente.

5. **Controle sobre campos:**
   - Permite configurar a inclusão ou exclusão de campos específicos durante a serialização/desserialização.

Exemplo básico de uso:

```java
import com.google.gson.Gson;

public class ExemploGson {
    public static void main(String[] args) {
        // Criando um objeto
        Pessoa pessoa = new Pessoa("João", 25);

        // Convertendo objeto para JSON
        Gson gson = new Gson();
        String json = gson.toJson(pessoa);
        System.out.println("Objeto para JSON: " + json); //Objeto para JSON: {"nome":"João","idade":25}

        /* JSON de entrada:
            {
            "nome": "João",
            "idade": 25
            }
        */

        // Convertendo JSON para objeto
        Pessoa pessoaDesserializada = gson.fromJson(json, Pessoa.class);
        System.out.println("JSON para objeto: " + pessoaDesserializada); //JSON para objeto: Pessoa{nome='João', idade=25}
    }
}

```
