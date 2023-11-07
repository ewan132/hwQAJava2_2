public class Main {
    public static void main(String[] args) {

        int initialSum = 100;
        int depositSum = 2200;
        int bonusRub = 0;
        int resultSum = initialSum + depositSum;

        System.out.println("Сумма до пополнения: " + initialSum);
        System.out.println("Сумма пополнения: " + depositSum);

        if (depositSum >= 1000) {
            bonusRub = depositSum / 100;
            System.out.println("Сумма бонуса: " + bonusRub);
            System.out.println("Итоговый счет: " + (resultSum + bonusRub));
        } else {
            System.out.println("Сумма бонуса: " + bonusRub);
            System.out.println("Итоговый счет: " + (resultSum + bonusRub));
        }

    }
}