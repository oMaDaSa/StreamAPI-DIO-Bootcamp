import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio13 {
    //Desafio 13 - Filtrar os números que estão dentro de um intervalo:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(1,54,85,43,23,523,34,21,2,8,6,5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o intervalo para filtrar");
        System.out.print("De: ");
        int intervaloInferior = Integer.parseInt(scanner.next());
        System.out.print("Á: ");
        int intervaloSuperior = Integer.parseInt(scanner.next());
        ListaNumeros.stream().filter(n1 -> n1>=intervaloInferior && n1 < intervaloSuperior).sorted().forEach(System.out::println);
    }
}
