import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    //Desafio 12 - Encontre o produto de todos os números da lista:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(2,3,4);
        System.out.println(ListaNumeros.stream().reduce(1, (n1,n2) -> n1*n2));
    }
}
