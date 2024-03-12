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

Em Java, a leitura de dados pode ser realizada de várias maneiras. Mas a forma mais comum é com a classe Scanner. Ela será tratada em detalhes mais adiante quando tratarmos do pacote java.io, mas fique agora com o básico de como usá-la:

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

O `Scanner` oferece métodos para ler diferentes tipos de dados. Alguns dos mais comuns incluem:

- `nextInt()`: Lê um número inteiro.
- `nextDouble()`: Lê um número decimal.
- `next()` ou `nextLine()`: Lê uma string.
- a classe Scanner em Java não possui um método específico como 'nextBoolean()' para ler valores booleanos diretamente. No entanto, você pode ler uma string e, em seguida, converter para booleano.

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
    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.11.0</version>
                <configuration>
                    <source>21</source>
                    <target>21</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
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

## Exceções

Em Java, exceções são eventos anormais que ocorrem durante a execução de um programa e podem interromper o fluxo normal do código. O tratamento de exceções é fundamental para lidar com essas situações de forma controlada.

Principais conceitos sobre exceções e tratamento em Java:

**Tipos de Exceções:**

- **Checked Exceptions:** Obriga o programador a tratá-las, normalmente derivam de `Exception` (ex: `IOException`).
- **Unchecked Exceptions (RuntimeExceptions):** Não exigem tratamento obrigatório, derivam de `RuntimeException` (ex: `NullPointerException`).

**Blocos Try-Catch:**

- O código propenso a lançar exceções é colocado dentro do bloco `try`.
- O bloco `catch` contém o código que será executado se a exceção especificada ocorrer.

```java
try {
    // Código que pode lançar exceções
} catch (ExcecaoTipo1 e1) {
    // Tratamento para ExcecaoTipo1
} catch (ExcecaoTipo2 e2) {
    // Tratamento para ExcecaoTipo2
} finally {
    // Bloco opcional que é executado sempre, ocorrendo ou não exceções
}
```

**Bloco Finally:**

- É opcional e é utilizado para conter código que deve ser executado, independentemente de ocorrer uma exceção ou não.

**Throw e Throws:**

- `throw` é usado para explicitamente lançar uma exceção.
- `throws` é usado em declarações de método para indicar que o método pode lançar uma exceção específica.

```java
public void exemploMetodo() throws MinhaExcecao {
    // Código do método
    if (condicao) {
        throw new MinhaExcecao("Mensagem de erro");
    }
}
```

**Múltiplos Catch:**

- É possível ter vários blocos `catch` para tratar diferentes tipos de exceções.

```java
try {
    // Código que pode lançar exceções
} catch (ExcecaoTipo1 e1) {
    // Tratamento para ExcecaoTipo1
} catch (ExcecaoTipo2 e2) {
    // Tratamento para ExcecaoTipo2
} catch (ExcecaoGeral e) {
    // Tratamento para outras exceções
}
```

Idealmente, a captura de exceção deve ser a mais específica o possível. Uma maneira eficaz de identificar o tipo correto de exceção é permitir que o código gere um erro de propósito para que o compilador indique a exceção específica que está sendo lançada. Quando você executa o código e ocorre um erro, a mensagem de exceção exibida no console geralmente contém informações sobre o tipo de exceção e a linha onde ocorreu.

Por exemplo, se você tentar inserir uma String quando o programa espera um número inteiro, o InputMismatchException será lançado, e a mensagem de exceção indicará isso. O mesmo se aplica se você tentar fazer uma divisão por zero, onde o ArithmeticException será lançado.

A abordagem de permitir que o código gere erros de propósito é uma ótima maneira de entender e tratar as exceções específicas que podem ocorrer em diferentes partes do seu programa. Isso ajuda na depuração e melhoria da robustez do seu código.

## java.io

O pacote `java.io` em Java é essencial para operações de entrada e saída (I/O), possibilitando interações com diversos fluxos de dados, como arquivos, entrada padrão, saída padrão, entre outros.

### Hierarquia de Classes

1. **InputStream / OutputStream:**
   - `InputStream`: Classe abstrata para leitura de bytes.
   - `OutputStream`: Classe abstrata para gravação de bytes.

2. **Reader / Writer:**
   - `Reader`: Classe abstrata para leitura de caracteres.
   - `Writer`: Classe abstrata para gravação de caracteres.

### Classes Principais

- `File`: Representa caminhos e nomes de arquivos ou diretórios no sistema de arquivos.
- `FileInputStream` / `FileOutputStream`: Realizam operações de leitura e escrita de bytes em arquivos.
- `FileReader` / `FileWriter`: Realizam operações de leitura e escrita de caracteres em arquivos de texto.
- `BufferedReader` / `BufferedWriter`: Oferecem operações de leitura e escrita em buffer, otimizando o desempenho.
- `DataInputStream` / `DataOutputStream`: Permitem a leitura e gravação de tipos de dados primitivos.

### Exemplo de Uso

#### Leitura de Arquivo com FileReader

```java
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("caminho/do/arquivo.txt")) {
            int caractere;
            while ((caractere = fileReader.read()) != -1) {
                System.out.print((char) caractere);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

#### Escrita em Arquivo com FileWriter:

```java
import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivo {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("caminho/do/arquivo.txt")) {
            fileWriter.write("Conteúdo a ser escrito no arquivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Scanner para Entrada de Dados:

```java
import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Nome: " + nome + ", Idade: " + idade);

        scanner.close();
    }
}
```

### BufferedReader para Entrada do Teclado:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeituraDadosBuffered {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Digite uma frase: ");
            String frase = reader.readLine();

            System.out.println("Você digitou: " + frase);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---------

## Spring

O Spring Framework é um framework de desenvolvimento de aplicações Java de código aberto, amplamente utilizado para construir aplicações web robustas e escaláveis. Ele fornece diversos recursos para facilitar o desenvolvimento, como injeção de dependência, inversão de controle, gerenciamento de transações, acesso a dados e muito mais.

### Spring Boot

O Spring Boot é um framework que facilita o desenvolvimento de aplicações Spring. Ele fornece um conjunto de ferramentas e anotações que simplificam a configuração e o bootstrapping da aplicação, reduzindo a quantidade de código boilerplate necessário. O Spring Boot também oferece suporte para autoconfiguração, o que significa que a aplicação pode ser configurada automaticamente com base nas dependências presentes no classpath.

#### Spring Initializr

O Spring Initializr é uma ferramenta online que permite criar um projeto Spring Boot rapidamente. Basta escolher as dependências desejadas e o Spring Initializr gera um projeto completo com a configuração básica pronta para uso. [https://start.spring.io/](https://start.spring.io/)

##### Pastas no projeto criado com Spring Boot Initializr

- **src/main/java:** Contém as classes Java da aplicação.
- **src/main/resources:** Contém os arquivos de configuração da aplicação, como arquivos properties, XML e YAML.
- **src/test/java:** Contém os testes unitários da aplicação.
- **pom.xml:** Contém o arquivo de configuração do Maven, que define as dependências da aplicação.

#### Properties

O Spring Boot possui centenas de propriedades que podemos incluir nesse arquivo (application.properties), sendo impossível memorizar todas elas. Sendo assim, é importante conhecer a documentação que lista todas essas propriedades, pois eventualmente precisaremos consultá-la.

Você pode acessar a documentação oficial no link: [Common Application Properties](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html).

### Anotações @RestController e @RequestMapping

- `@RestController`: Indica que a classe é um controller RESTful.
- `@RequestMapping`: Mapeia uma URL para um método da classe controller.

```java
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/")
    public String hello() {
        return "Hello, world!";
    }
}
```

Neste exemplo, a classe `UserController` é um controller RESTful que mapeia a URL `/api` para o método `hello()`. O método `hello()` retorna a string "Hello, world!".

### Adicionando Dependências

O Maven, como gerenciador de dependências, facilita a inclusão de bibliotecas no projeto. As dependências são declaradas no arquivo pom.xml, que define as coordenadas (nome, versão) das bibliotecas necessárias.

Exemplo:

Para usar o Spring Data JPA, adicione a seguinte dependência no pom.xml:

```XML
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
    <version>2.7.0</version>
</dependency>
```

O Spring Boot fornece "starter dependencies" que agrupam dependências comuns para funcionalidades específicas.

Outra maneirar simplificada de adicionar as dependências é indo em  [https://start.spring.io/](https://start.spring.io/), adicionando as dependências desejadas, clicando em "explorar", copiar as dependências e colar no arquivo `pom.xml`. Não esqueça de fazer um "reload" do maven para garantir que as dependências foram instaladas e dando restart no projeto.

### Banco de Dados com Spring

#### Padrão DTO

- O padrão DTO (Data Transfer Object) é utilizado para representar os dados recebidos em uma requisição POST.
- Java Records podem ser utilizados para criar DTOs de forma concisa e eficiente.

```java
@Controller
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public void createUser(@RequestBody UserDTO user) {
        // ...
    }
}

public record UserDTO(
    String name,
    int age,
    String email
) {}
```

Neste exemplo, o método `createUser` é mapeado para a URL `/user` e recebe um objeto `UserDTO` como parâmetro. O objeto `UserDTO` é criado a partir dos dados JSON enviados na requisição POST.

#### Entidade JPA e Interface Repository

O JPA (Java Persistence API) mapeia objetos Java para relacionamentos em um banco de dados. Uma entidade JPA é uma classe que representa uma tabela (entidade) no banco de dados. Anotações JPA como @Entity, @Column e @GeneratedValue definem propriedades da entidade e da persistência.

Exemplo:

```Java
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    // ...
}
```

- `@Autowired`: é utilizada em Spring Framework para realizar a injeção de dependência automaticamente. Essa anotação indica ao contêiner Spring que ele deve fornecer a instância de uma classe como dependência para a classe que está sendo anotada.
- `@Table(name = "usuario")`: Define a tabela no banco de dados associada à entidade Usuario.
- `@Entity(name = "Usuarios")`: Indica que a classe Usuario é uma entidade JPA com o nome associado no banco de dados como "Usuarios".
- `@Getter`: Gera automaticamente métodos getters para todos os campos da classe.
- `@NoArgsConstructor`: Gera um construtor padrão sem argumentos.
- `@AllArgsConstructor`: Gera um construtor que inclui todos os campos da classe como argumentos.
- `@EqualsAndHashCode(of = "id")`: Implementa automaticamente os métodos equals e hashCode, usando apenas o campo "id" para a comparação.
- `@Id @GeneratedValue(strategy = GenerationType.IDENTITY)`: Define a propriedade "id" como a chave primária da entidade, com estratégia de geração automática de valor.

A interface Repository define operações CRUD (Create, Read, Update, Delete) para a entidade. O Spring Data JPA cria automaticamente uma implementação para a interface.

Exemplo:

```Java
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // ... métodos específicos da sua aplicação ...

}
```

Essa extensão possui uma vasta gama de possibilidade de querys. Para ver a lista completa, consulte: [JPA Query Methods](https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html).

### Flyway como Ferramenta de Migrations

Migrações de banco de dados são necessárias para alterar a estrutura do banco de dados ao longo do tempo. O Flyway é uma ferramenta que gerencia essas migrações de forma eficiente.

Exemplo:

Crie um script SQL para cada migração, nomeando-os com o formato V[VERSÃO]__[DESCRIÇÃO].sql. Por exemplo:

```SQL
V1_0__Criar_tabela_usuario.sql
```

No script, defina as alterações na estrutura da tabela. O Flyway executa os scripts na ordem crescente de versão, garantindo a atualização do banco de dados.

#### Configuração para Exibição de Comandos SQL no Console

   Por fim, discutimos como configurar o projeto para exibir os comandos SQL no console. Essa configuração é útil para debugging e compreensão do que está ocorrendo no banco de dados. Adicionamos a seguinte configuração no arquivo `application.properties`:

   ```properties
   spring.jpa.show-sql=true
   ```

#### Adicionando nova coluna

Ao criar uma nova coluna com intenção que a mesma seja `NOT NULL`, deve-se atentar para, antes de realziar essa declaração, criar a coluna e atribuir valores.

```sql
ALTER TABLE pacientes ADD COLUMN ativo TINYINT;
UPDATE pacientes SET ativo = 1;
ALTER TABLE pacientes MODIFY ativo TINYINT NOT NULL;
```

### CREATE com Spring

- `@PostMapping`: é utilizada em um método de um Controller para mapear uma requisição POST para um endpoint específico.
- `@RequestBody`: é utilizada em um parâmetro do método Controller para receber os dados do corpo da requisição e mapeá-los para um objeto Java.
- `@Valid`: é uma parte do Java Bean Validation, que é uma especificação para validação de dados em objetos de domínio. Essa anotação é frequentemente usada em métodos de controladores em frameworks como Spring MVC para indicar que um objeto deve ser validado antes de ser processado.

#### Validações com Bean Validation

O Bean Validation fornece anotações para validar objetos Java. As anotações como @NotNull, @NotBlank, @Size e @Pattern verificam se os campos possuem valores corretos.

Exemplo:

```Java
@PostMapping
@Transactional
public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroMedico dados, UriComponentsBuilder uriBuilder) {
    var medico = new Medico(dados);
    repository.save(medico);
    var uri = uriBuilder.path("/medicos/{id}").buildAndExpand(medico.getId()).toUri();

    return ResponseEntity.created(uri).body(new DadosDetalhamentoMedico(medico));
}

public record DadosCadastroMedico(
    @NotBlank
    String nome,
    @NotBlank
    @Email
    String email,
    @NotBlank
    String telefone,
    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    String crm,
    @NotNull
    Especialidade especialidade,
    @NotNull @Valid DadosEndereco endereco) {
}
```

O Spring Boot integra o Bean Validation, permitindo que as validações sejam automaticamente aplicadas.

### READ com Spring

```java
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

@RestController
public class MeuController {

    @GetMapping
    public Page<DadosListagemMedico> listar(@PageableDefault(size=10, sort={"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }
}
```

#### Anotação @GetMapping

   A anotação `@GetMapping` é essencial para mapear métodos em Controllers que produzem dados. Essa anotação é utilizada para associar uma URL específica a um método no controlador, permitindo a resposta adequada às requisições HTTP GET.

#### Interface Pageable do Spring

   A interface `Pageable` do Spring é uma ferramenta poderosa para realizar consultas com paginação. Ela permite a recuperação de dados de maneira segmentada, facilitando a apresentação e manipulação de grandes conjuntos de dados.

#### Controle de Paginação e Ordenação

   Nosso estudo também abrangeu o controle da paginação e ordenação dos dados devolvidos pela API. Para isso, utilizamos os parâmetros `page`, `size`, e `sort`. Esses parâmetros são essenciais para personalizar a resposta da API de acordo com as necessidades do cliente.

### UPDATE com Spring

```java
@PutMapping
@Transactional
public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados) {
    var medico = repository.getReferenceById(dados.id());
    medico.atualizarInformacoes(dados);
}

public record DadosAtualizacaoMedico(
        @NotNull
        long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}

public void atualizarInformacoes(DadosAtualizacaoMedico dados) {
    if (dados.nome() != null) {
        this.nome = dados.nome();
    }
    if (dados.telefone() != null) {
        this.telefone = dados.telefone();
    }
    if (dados.endereco() != null) {
        this.endereco.atualizarInformacoes(dados.endereco());
    }
}
```

#### Utilizando a Anotação @PutMapping

A anotação @PutMapping desempenha um papel fundamental no desenvolvimento de APIs, pois ela é responsável por mapear métodos que lidam com requisições HTTP do tipo PUT. Essa operação é frequentemente utilizada para atualizar informações em um servidor, e a anotação @PutMapping facilita a associação dessas operações a métodos específicos em nossos Controllers.

No exemplo, criamos um método chamado `atualizar` que recebe como parâmetro um objeto record `DadosAtualizacaoMedico` representando as informações a serem atualizadas. Destacamos a utilização da anotação @PutMapping acima do método, indicando que esse método responderá a requisições PUT.

Além disso, incorporamos a anotação @Transactional, que é essencial quando lidamos com transações em um contexto de persistência de dados. Isso garante que a transação seja concluída com sucesso ou revertida em caso de falha, mantendo a consistência do banco de dados.

Criamos uma classe DadosAtualizacaoMedico usando a nova feature do Java, chamada record, para representar os dados que serão utilizados na atualização do médico. Utilizamos anotações como @NotNull para garantir a validação dos dados.

No interior do método, obtivemos uma referência ao médico a ser atualizado usando o método `getReferenceById` do repositório. Em seguida, chamamos o método `atualizarInformacoes` do objeto `medico` para aplicar as alterações com base nos dados fornecidos.

No método atualizarInformacoes da classe Medico, realizamos a lógica de atualização, verificando se os dados fornecidos não são nulos antes de aplicar as alterações no objeto Medico. Essa abordagem permite uma atualização seletiva, apenas alterando os campos que foram fornecidos.

### Delete com Spring

```java
@DeleteMapping("/{id}")
@Transactional
public void remover(@PathVariable Long id) {
    //repository.deleteById(id); //exclusão completa
    var paciente = repository.getReferenceById(id);
    paciente.inativar();
}
```

#### Mapeamento de Requisições DELETE

Utilizamos a anotação `@DeleteMapping` para mapear a operação DELETE em nosso Controller de Paciente. Isso permite a criação de um endpoint específico para exclusão de recursos.

Neste trecho de código, estamos utilizando o método `remover` que recebe o identificador do paciente a ser removido como parâmetro. Dentro do método, obtemos a referência do paciente pelo ID e chamamos o método `inativar`, implementado na entidade Paciente, para realizar a exclusão lógica.

#### Manipulação de Parâmetros Dinâmicos em URL

A anotação `@PathVariable` foi utilizada para mapear parâmetros dinâmicos na URL, possibilitando a passagem do ID do paciente a ser removido.

```java
public void inativar() {
    this.ativo = false;
}
```

No método `inativar` da entidade Paciente, definimos o atributo `ativo` como falso, marcando o paciente como inativo.

Poderia der sido utilizado o método `deleteById()`, mas ele faria uma exclusão completa no banco de dados, o que poderia causar inconsistências por haver outros dados que se relacionam com o dado deletado.

#### Implementação de Exclusão Lógica

A exclusão lógica foi implementada através da introdução de um atributo booleano `ativo` na entidade Paciente. Alteramos o construtor da entidade para inicializar este atributo como verdadeiro e criamos o método `inativar` para modificar seu valor.

```java
private Boolean ativo;

public Paciente(DadosCadastroPaciente dados) {
    this.ativo = true;
    // ... restante do código
}
```

#### Atualização do Método de Listagem

No Controller de Paciente, modificamos o método de listagem para trazer apenas os pacientes ativos e criamos o respectivo método na interface `PacienteRepository`.

```java
@GetMapping
public Page<DadosListagemPaciente> listar(@PageableDefault(page = 0, size = 10, sort = { "nome" }) Pageable paginacao) {
    return repository.findAllByAtivoTrue(paginacao).map(DadosListagemPaciente::new);
}

Page<Paciente> findAllByAtivoTrue(Pageable paginacao);
```

### ResponseEntity

O `ResponseEntity` é uma classe que representa toda a resposta HTTP: código de status, cabeçalhos e corpo da resposta. Isso proporciona maior controle sobre o que é retornado ao cliente durante a execução de um endpoint.

É uma classe flexível e poderosa que encapsula a resposta HTTP. Ele oferece a capacidade de definir o código de status, cabeçalhos e corpo da resposta de maneira customizada. Este recurso é particularmente útil quando precisamos personalizar a resposta além dos casos comuns.

```java
@GetMapping
public ResponseEntity<Page<DadosListagemMedico>> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
    var page = repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    return ResponseEntity.ok(page);
}

@PutMapping
@Transactional
public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados) {
    var medico = repository.getReferenceById(dados.id());
    medico.atualizarInformacoes(dados);

    return ResponseEntity.ok(new DadosDetalhamentoMedico(medico));
}

@DeleteMapping("/{id}")
@Transactional
public ResponseEntity excluir(@PathVariable Long id) {
    //repository.deleteById(id); //exclusão completa
    var medico = repository.getReferenceById(id); //exclusão lógica (inativação)
    medico.desativar();

    return ResponseEntity.noContent().build();
}
```

- `ok(body)`: Cria uma resposta com o código 200 (OK) e o corpo da resposta definido pelo parâmetro `body`.
- `noContent()`: Cria uma resposta com o código 204 (No Content), indicando que a requisição foi bem-sucedida, mas não há conteúdo para retornar.
- `build():** Finaliza a construção da resposta HTTP e retorna a instância da `ResponseEntity`, permitindo o encadeamento de métodos para construir a resposta de forma fluente.
- `body(body)`: Cria uma resposta com o código de status e o corpo especificados pelos parâmetros. Este método é mais genérico, permitindo a definição personalizada do corpo da resposta e do código de status. É utilizado para casos em que é necessário maior controle sobre o conteúdo da resposta.
- `created(URI location)`: Cria uma resposta com o código 201 (Created) e o cabeçalho "Location" definido para a URI do novo recurso.
- `.notFound()`: configura a resposta com o código de status 404 (Not Found). Este método indica que a entidade requisitada não foi encontrada.
- `.badRequest():` Método que retorna uma resposta com status 400 (Bad Request).

### URI

As URIs (Uniform Resource Identifiers) são sequências de caracteres que identificam de maneira única um recurso na internet. Elas são utilizadas para identificar e localizar recursos, como páginas da web, imagens, documentos, serviços web, entre outros, de forma global.

Existem dois tipos principais de URIs:

1. **URL (Uniform Resource Locator):** Uma subcategoria de URIs que fornece a localização específica de um recurso na rede. As URLs incluem informações sobre como acessar o recurso, como o protocolo utilizado (por exemplo, "http" ou "https"), o domínio (como www.example.com) e o caminho para o recurso específico.

   Exemplo de URL: `https://www.example.com/pagina`

2. **URN (Uniform Resource Name):** Outra subcategoria de URIs, que tem como objetivo fornecer um identificador persistente e único para o recurso, independentemente de sua localização ou do tempo. URNs são menos comuns do que URLs na prática.

   Exemplo de URN: `urn:isbn:0451450523`

Em resumo, as URIs são essenciais para a identificação e acesso a recursos na internet, seja por meio de URLs que indicam a localização específica, ou URNs que fornecem identificadores únicos e persistentes.

#### UriComponentsBuilder

O `UriComponentsBuilder` é uma classe utilitária do Spring Framework que oferece uma maneira flexível de construir URIs. Ela simplifica a criação de URIs dinâmicas, especialmente útil ao lidar com parâmetros variáveis.

```java
@PostMapping
@Transactional
public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroMedico dados, UriComponentsBuilder uriBuilder) {
    // Criação do objeto Medico com base nos dados recebidos
    var medico = new Medico(dados);
    
    // Salvando o objeto Medico no repositório
    repository.save(medico);
    
    // Construção da URI para o recurso recém-criado
    var uri = uriBuilder.path("/medicos/{id}").buildAndExpand(medico.getId()).toUri();

    // Retorno da resposta com o código 201 (Created) e a URI do novo recurso
    return ResponseEntity.created(uri).body(new DadosDetalhamentoMedico(medico));
}
```

- `path(String path)`: Define o caminho base da URI.
- `buildAndExpand(Object... values)`: Constrói a URI expandindo os valores fornecidos para preencher as variáveis de caminho.
- `toUri()`: Converte a representação atual para um objeto URI.

### Tratamento de Erros com Spring

Nesta aula, exploramos a maneira eficiente de lidar com erros em aplicações Spring, utilizando as anotações `@RestControllerAdvice` e `@ExceptionHandler`. A abordagem adotada visa oferecer respostas adequadas quando uma exceção específica, como `EntityNotFoundException`, é lançada durante a execução do código.

```java
@RestControllerAdvice
public class TratadorDeErros {
    
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tratarErro404() {
        return ResponseEntity.notFound().build();
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity tratarErro400(MethodArgumentNotValidException ex) {
        var erros = ex.getFieldErrors();
        return ResponseEntity.badRequest().body(erros.stream().map(DadosErroValidacao::new).toList());
    }

    private record DadosErroValidacao(String campo, String mensagem) {
        public DadosErroValidacao(FieldError erro) {
            this(erro.getField(), erro.getDefaultMessage());
        }
    }
}
```

- `@RestControllerAdvice`: Esta anotação indica que a classe atua como um manipulador global de exceções para controladores marcados com `@RestController`.
- `@ExceptionHandler(EntityNotFoundException.class)`: Este método é chamado quando uma exceção do tipo `EntityNotFoundException` é lançada. Ele personaliza a resposta, utilizando `ResponseEntity.notFound().build()` para indicar um status HTTP 404 (Not Found).
- `@ExceptionHandler(MethodArgumentNotValidException.class):` Método que trata exceções do tipo `MethodArgumentNotValidException`, retornando uma resposta com status 400 e incluindo detalhes sobre os erros de validação.
- `.getFieldErrors():` Método utilizado para obter a lista de erros de campo em uma exceção de validação.

### Segurança com Spring

Para tal, utiliza-se o "Spring Security" disponível no Initializr. A gestão é feita por meio de uma classe anotada como serviço.

```java

@Configuration
@EnableWebSecurity
public class SecurityConfigurations {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(csrf -> csrf.disable())
                .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
```

#### Security Configuration

Anotações:

- `@Configuration`: indica que a classe contém métodos de configuração que serão processados pelo contêiner Spring.
- `@EnableWebSecurity`: ativa a segurança baseada na web para o aplicativo Spring.
- `@Bean`: indica que um método produzirá um bean (uma instância de uma classe que é gerenciada pelo contêiner e pode ser utilizado em diversas partes do aplicativo) gerenciado pelo Spring, que neste caso é a configuração da cadeia de filtros de segurança.

Classes e métodos:

- `SecurityFilterChain`: é uma classe que define a configuração da cadeia de filtros de segurança.
- `HttpSecurity`: é utilizado para configurar as regras de segurança específicas para requisições HTTP.
  - `.csrf(csrf -> csrf.disable())`: desabilita a proteção CSRF (Cross-Site Request Forgery) pois o spring já faz esse controle e acaba sendo redundante.
  - `.sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))`: Configura a política de gerenciamento de sessão como `STATELESS`, indicando que o aplicativo não deve criar sessões para usuários.
- `AuthenticationManager`: Configura o gerenciador de autenticação.
  - `getAuthenticationManager()`: é utilizado na configuração do sistema de segurança para obter o gerenciador de autenticação. Ele é parte integrante do fluxo de autenticação do Spring Security.
- `PasswordEncoder`: Configura o codificador de senhas.
  - `BCryptPasswordEncoder()`: é utilizado na configuração do sistema de segurança para especificar um codificador de senhas baseado no algoritmo BCrypt. Este algoritmo de hash é amplamente utilizado para armazenar senhas de forma segura.

#### Autentication Controller

```java
@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid DadosAutenticacao dados) {
        var token = new UsernamePasswordAuthenticationToken(dados.login(), dados.senha());
        var authentication = manager.authenticate(token);

        return ResponseEntity.ok().build();
    }
}
```

- `@RestController`: Indica que a classe é um controlador REST.
- `@RequestMapping("/login")`: Mapeia a URL base para as operações de login.
- `AuthenticationManager`: Injeta o gerenciador de autenticação.
- `efetuarLogin(@RequestBody @Valid DadosAutenticacao dados)`: Método para efetuar o login, utilizando `UsernamePasswordAuthenticationToken`.

#### User Configuration

```java
@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Usuario implements UserDetails {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}
```

- `@Table(name = "usuarios")` e `@Entity(name = "Usuario")`: Mapeamento da entidade usuário para a tabela "usuarios".
- Implementação da interface `UserDetails` para integração com Spring Security, sobrescrevendo os métodos da interface para retornar os atributos da classe (no caso, login e senha).
- `SimpleGrantedAuthority` é utilizada para representar uma autoridade ou papel atribuído a um usuário no contexto de segurança.

#### Autenticacao Service

```java
@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByLogin(username);
    }
}
```

- `@Service`: Indica que a classe é um serviço.
- `UserDetailsService`: Implementação do serviço de detalhes do usuário para autenticação.
- `loadUserByUsername(String username)`: Método que carrega os detalhes do usuário pelo nome de usuário, utilizando o `UsuarioRepository`.
