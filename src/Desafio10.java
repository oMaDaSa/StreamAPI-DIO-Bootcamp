import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    //Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        ListaNumeros.stream().filter(n-> (n%5==0 || n%3==0) && n%2==1).forEach(System.out::println);
    }
}
