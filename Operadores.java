public class Operadores {

    public static void main(String[] args) {
        
        // Teste concatenação de string
        String nomeCompleto = "Linguagem" + " " + "Java";

        System.out.println(nomeCompleto);

        // teste concatenação string mais numero
        String concatenar;

        concatenar = 1 + 1 + 1 + "1";

        System.out.println(concatenar);

        // concatenação em evidencia
        concatenar = "1" + (1 + 1 + 1);

        System.out.println(concatenar);

        // teste com valor uniario
        int numero = 5;
        numero = - numero; // tornou o numero negativo
        numero = numero * -1; // retorna a variavel numero para positivo

        System.out.println(numero);
        
        // teste repetição incremento
        numero = numero + 2;
        System.out.println(numero);
        
        numero++; // sinal duplo ++ incrementa mais 1
        System.out.println(numero);
        System.out.println(++ numero); // pode ser aplicado diretamente na impressao

        numero--; // sinal duplo -- decresce 1
        System.out.println(numero);
        System.out.println(-- numero); // pode ser aplicado diretamente na impressao

        // teste negação
        boolean variavel = true;
        System.out.println(variavel); //valor em memoria
        System.out.println(!variavel); // simbolo ! inverte o valor booleano

        variavel = !variavel; // inverte o valor booleano na memoria
        System.out.println(variavel);

        // exemplo operador ternario
        int a, b;
        a = 6;
        b = 6;
        String resultado;

        //modo tradicional de comparativo
        if (a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";
        System.out.println(resultado);

        //operador ternario
        resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        // operador relacional

        boolean simNao = a == b;
        System.out.println("a e b são iguais? " + simNao);

        simNao = a != b;
        System.out.println("a e b são diferentes? " + simNao);
        
        simNao = a > b;
        System.out.println("a é maior que b? " + simNao);
        
        simNao = a < b;
        System.out.println("a é menor que b? " + simNao);

        simNao = a <= b;
        System.out.println("a é menor ou igual a ? " + simNao);

        simNao = a >= b;
        System.out.println("a é maior ou igual a b? " + simNao);

        // operadores logicos

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println("As duas condiçoes são verdadeiras");
        }
    
        if(condicao1 || condicao2){
            System.out.println("Uma das condiçoes é verdadeira");
        }

        System.out.println("fim");






    } 


}