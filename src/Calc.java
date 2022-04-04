import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isExit = false;

        while (!isExit) {

            try {
                System.out.println(" ");
                System.out.println("Для подсчета ввидете два арабских или римских числа, либо (c) для выхода");

                Dispetcher dispetcher = new Dispetcher(scan);

                String elem1 = dispetcher.element1;
                if (elem1.equals("c")) {
                    isExit = true;
                    System.out.println("Пока");
                    return;
                }
                String sign = dispetcher.sign;
                String elem2 = dispetcher.element2;

                if (dispetcher.getIsRoman()) {
                    int arabElement1 = Roman.romanToNumber(elem1);
                    int arabElement2 = Roman.romanToNumber(elem2);
                    int result = Math.calculate(arabElement1, sign, arabElement2);
                    System.out.println("Результат: " + Roman.convertNumToRoman(result));
                } else {
                    int result = Math.calculate(Integer.parseInt(elem1), sign, Integer.parseInt(elem2));
                    System.out.println("Результат: " + result);
                }

            } catch (Exception e) {
            }
        }
    }
}
