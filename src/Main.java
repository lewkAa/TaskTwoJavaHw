public class Main {
    public static void main(String[] args) {

        int balance = 100; // стартовый баланс
        int amount = 1200; // сумма пополнения
        int bonus = amount > 1000 ? amount / 100 : 0;  // начисляемый бонус
        int totalBalance = balance + amount + bonus;   // итоговый баланс

        System.out.println("Вы успешно пополнили счет на " + amount + " рублей.");

        if (bonus > 0) System.out.println("Вам начислено " + bonus + " бонусных рублей.");

        System.out.println("Ваш баланс составляет " + totalBalance + " рублей.");


    }
}