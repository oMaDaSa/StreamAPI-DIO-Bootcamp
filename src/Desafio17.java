import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    //Desafio 17 - Filtrar os números primos da lista:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        ListaNumeros.stream().filter(Primos::isPrime).forEach(System.out::println);
    }
}
