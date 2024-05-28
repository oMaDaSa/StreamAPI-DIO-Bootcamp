public class Primos {
    public static boolean isPrime(Integer n){
        if(n == 1 || (n%2 == 0 && n != 2)) return false;
        for(int i = 3; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
