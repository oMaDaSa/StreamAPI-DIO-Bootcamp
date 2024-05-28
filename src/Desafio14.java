import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    //Desafio 14 - Encontre o maior número primo da lista:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(2,4,6,13,89,122);
        System.out.println(ListaNumeros.stream().filter(Primos::isPrime).max(Integer::compare).orElse(null));
    }


}
