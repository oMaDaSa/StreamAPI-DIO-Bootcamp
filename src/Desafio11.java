import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    //Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(1,2,3,4,5);
        ListaNumeros.forEach(n->System.out.printf("%d² = %d\n",n,n*n));
        System.out.println("Soma = " + ListaNumeros.stream().map(n -> n * n).reduce(Integer::sum).orElse(0));
    }
}
