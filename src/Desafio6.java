import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    //Desafio 6 - Verificar se a lista contém algum número maior que 10:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(1,2,3,4,5,6,12);
        System.out.println(ListaNumeros.stream().anyMatch(n->n>10));
    }
}
