import java.util.Scanner;

public class CalcResult {
    public String calcSum() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        do {
            System.out.println("Sayı Giriniz : ");
            num = scanner.nextInt();

            if (num % 2 == 0 && num % 4 == 0) {
                sum += num;
            }
        } while (num % 2 == 0);
        String result = "Toplam = " + sum;
        return result;
    }
}
