import java.util.List;
import java.util.Arrays;

public class Desafio1 {
    //Desafio 1 - Mostre a lista na ordem numérica:
    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(1,7,4,2,23,4,65,2,4,3);
        listaNumeros.stream().sorted().forEach(n -> System.out.print(n + " "));
    }
}