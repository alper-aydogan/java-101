public class palindromNumbers {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;

            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        return if (number = reverseNumber) {
            =true;
        } else {
            =false;

        }
    }
}
