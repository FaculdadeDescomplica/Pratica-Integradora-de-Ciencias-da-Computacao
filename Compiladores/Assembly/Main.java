package Assembly;

public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(3, 4);
        System.out.println(result);
    }
}

/*
* Representação Intermediária
*
* T1 = 3            ; T1 é um temporário que recebe 3
* T2 = 4            ; T2 é um temporário que recebe 4
* T3 = T1 + T2      ; T3 armazena o resultado da soma
* result = T3       ; A variável result recebe o valor de T3
* */
