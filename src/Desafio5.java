import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio5 {
    //Desafio 5 - Calcule a média dos números maiores que 5:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(ListaNumeros.stream().filter(n -> n > 5).reduce(Integer::sum).get()/(float)ListaNumeros.stream().filter(n -> n > 5).count());
    }
}
