import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    //Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(2,54,100,100,23,43,21,22,4);
        System.out.println("Os números da lista são todos distintos: " + (ListaNumeros.stream().distinct().toList().size() == ListaNumeros.size()));
        //verifica se a lista distinct é do mesmo tamanho da lista original
    }
}
