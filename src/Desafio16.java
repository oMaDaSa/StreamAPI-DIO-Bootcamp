import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {
    //Desafio 16 - Agrupe os números em pares e ímpares:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> MapParesImpares = ListaNumeros.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("pares: " + MapParesImpares.get(true));
        System.out.println("pares: " + MapParesImpares.get(false));
    }
}
