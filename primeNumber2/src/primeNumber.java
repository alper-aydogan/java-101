public class primeNumber {
    static boolean prime(int number) {
        int temp = number, denge = 2, l = 0;
        for (; number % denge == l; denge++) {

            if (l == 0 && denge < number)
                return true;
            else
                return false;
        }




    public static void main(String[] args) {
        System.out.println(prime(4));
    }
