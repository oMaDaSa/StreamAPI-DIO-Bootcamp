import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    //Desafio 3 - Verifique se todos os números da lista são positivos:
    public static void main(String[] args) {
        List<Integer> ListaNumero = Arrays.asList(1,2,2,5,3,3);
        System.out.println(ListaNumero.stream().allMatch(n->n>0));
    }
}
