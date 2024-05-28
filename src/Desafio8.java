import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    //Desafio 8 - Somar os dígitos de todos os números da lista:
    public static void main(String[] args) {
        List<Integer>ListaNumeros = Arrays.asList(2,54,3,100,23,43,21);
        int soma = ListaNumeros.stream().flatMapToInt(n-> String.valueOf(n).chars().map(Character::getNumericValue)).sum();
        System.out.println(soma);
    }
}
