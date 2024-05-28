import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    //Desafio 18 - Verifique se todos os números da lista são iguais:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(1,1,1,2,1);
        System.out.println("A lista tem elementos diferentes: " + ListaNumeros.stream().anyMatch(n -> !n.equals(ListaNumeros.getFirst())));
    }
}
