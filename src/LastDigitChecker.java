public class LastDigitChecker {
    public static boolean hasSameLastDigit (int a, int b, int c) {
        if (a <10 || a >1000) {
            return false;
        }
        if (b <10 || b >1000) {
            return false;
        }
        if (c <10 || c >1000) {
            return false;
        }
        int lastDigitA  = a / 10;
        int lastDigitB = b / 10;
        int lastDigitC = c / 10;

        if (lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid (int number) {
        if (number<10 || number>1000) {
            return false;
        } else {
            return true;
        }
    }
}
