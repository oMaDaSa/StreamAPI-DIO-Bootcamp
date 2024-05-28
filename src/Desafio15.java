import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    //Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(2,4,6,13,89,122, -2);
        System.out.println("A lista contém algum número negativo: " + ListaNumeros.stream().anyMatch(n->n<0));
    }
}
