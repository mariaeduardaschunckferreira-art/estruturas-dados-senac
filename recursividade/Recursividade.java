package recursividade;

public class Recursividade {



    public static void main(String[] args) {
        somaIterativa(4);
        somaRecursiva(5);

        System.out.println( somaIterativa(5));
        System.out.println(somaRecursiva(5));

        
    }

    public static int somaRecursiva(int n){
        if (n <= 0){
            return 0;
        }
        return n + somaRecursiva(n - 1);  
    }

    public static int somaIterativa(int n ){
        int soma = 0;
        for(int i = 1; i <= n; i++){
            soma += i;
        }
        return soma;
    }
    
}

