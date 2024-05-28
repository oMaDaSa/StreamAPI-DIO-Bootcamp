import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    //Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(2,5,30);
        System.out.println(ListaNumeros.stream().filter(n -> (n % 5 == 0 || n % 3 == 0)).reduce(Integer::sum).orElse(0));
    }
}
