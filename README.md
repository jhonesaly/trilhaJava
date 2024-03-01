# Trilha Java

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
Incremento: "++" | ex: int num = 1; int resultado = ++num

## Convenções

- Nome de classe: MinhaClasse
- Nome de método: meuMetodo()
- Nome de constante: MINHA_CONSTANTE
- Nome de variável: minhaVariavel
- Linhas de código devem ter menos de 80 char
- Espaços para separar operadores, palavras-chave e elementos de controle de fluxo | ex: if (condicao) {
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

## Strings

Em Java, String são classes
- String nome = "Alyson";
- String message= """
                  Text Block
                  """;
métodos:
- .equals(): compara conteúdo de strings (ex: senha.equals("12345"))
- .equalsIgnoreCase(): compara conteúdo de strings desconsiderando case (ex: senha.equalsIgnoreCase("AjSa"))
- .format(%s, %d, %.xf): insere dentro da string variáveis do tipo string (%s), inteiro (%d) e real com x casas decimais (%.xf)
    (ex: String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));)
