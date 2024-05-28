import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    //Desafio 7 - Encontrar o segundo número maior da lista:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(2,54,3,100,23,43,21);
        System.out.println(ListaNumeros.stream().sorted().toList().get(ListaNumeros.size()-2));
    }
}
