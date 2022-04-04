import java.util.Scanner;

public class Dispetcher {

    public String element1;
    public String sign;
    public String element2;

    private boolean isRoman;

    public Dispetcher (Scanner scan) throws Exception {
        isNormal(scan);
    }

    public void isNormal(Scanner scan) throws Exception {
        element1 = scan.next();
        sign = scan.next();
        element2 = scan.next();
        if (!sign.equals("+") && !sign.equals("*") && !sign.equals("-") && !sign.equals("/")) {
            System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            throw new Exception();
        }
    }

    public boolean getIsRoman() throws Exception {
        if (isNum(element1) && isNum(element2)) {
            return false;
        } else if (!isNum(element1) && !isNum(element2)) {
            return true;
        } else if (!isNum(element1) && isNum(element2)) {
            System.out.println("Используются одновременно разные системы счисления");
            throw new Exception();
        } else if (isNum(element1) && !isNum(element2)) {
            System.out.println("Используются одновременно разные системы счисления");
            throw new Exception();
        }
        throw new Exception();
    }

    private static boolean isNum(String znachenie) {
        try {
            Integer.parseInt(znachenie);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
