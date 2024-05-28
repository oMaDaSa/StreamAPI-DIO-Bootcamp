import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    //Desafio 2 - Imprima a soma dos números pares da lista:
    public static void main(String[] args) {
        List<Integer> ListaNumeros = Arrays.asList(1,2,4,5,6,12,10,23,101);
        System.out.println(ListaNumeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum));
    }
}
