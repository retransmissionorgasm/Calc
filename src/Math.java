public class Math {

    public static int calculate(int element1, String sign, int element2) {

        if (sign.equals("+")) {
            return element1 + element2;
        } else if (sign.equals("-")) {
            return element1 - element2;
        } else if (sign.equals("*")) {
            return element1 * element2;
        } else if (sign.equals("/")) {
            return element1 / element2;
        }
        return 0;
    }
}












