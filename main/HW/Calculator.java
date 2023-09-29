// В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки 
// и процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод 
// с использованием библиотеки AssertJ. Если метод calculateDiscount получает недопустимые 
// аргументы, он должен выбрасывать исключение ArithmeticException. Не забудьте написать 
// тесты для проверки этого поведения.

package main.HW;


public class Calculator {
    public static void main(String[] args) {
        System.out.println("Сумма покупки со скидкой: " + calculateDiscount(1, 10));
    }

    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount <= 0)
            throw new ArithmeticException("Сумма покупки не может быть нулевой или отрицательной!");
        if (discountAmount < 0 || discountAmount > 100)
            throw new ArithmeticException("Сумма скидки должна составлять от 0 до 100!");

        double result = purchaseAmount - (purchaseAmount / 100 * discountAmount);
        return result;
    }
}