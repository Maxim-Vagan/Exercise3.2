package ru.maxvagan;

public class Main {

    public static void main(String[] args) {
//      Lesson 3.2 - Дополнительные задания (08.04.2022). Условные операторы
//	    Task 6
        System.out.println("Task 6");
        byte clientAge = 19;
        int clientSalary = 58_000;
        int clientCreditLimit = clientSalary;
        boolean isClientAdult = clientAge >= 18;
        boolean isClientRelevant = clientSalary >= 35_000;
        System.out.println("Данные клиента: возраст " + clientAge + " лет; доход " + clientSalary + " руб.");
        if (clientAge < 23) clientCreditLimit *= 2;
        else clientCreditLimit *= 3;
        if (clientSalary >= 50_000 && clientSalary < 80_000) clientCreditLimit *= 1.2;
        else if (clientSalary >= 80_000) clientCreditLimit *= 1.5;
        if (!(isClientAdult && isClientRelevant))
            System.out.println("Вам отказано в выдаче кредитной карты!");
        else System.out.println("Вам одобрена кредитная карта с лимитом " + clientCreditLimit + " руб.");
//        Task 7
        System.out.println("Task 7");
        int clientWishCreditSum = 330_000;
        byte creditPeriod = 12;
        float baseCreditYearTax = 0.1f; float calcCreditTaxKoeff = baseCreditYearTax;
        int maxClientMonthPurchase = (int) (clientSalary * 0.5f);
        if (clientAge < 23) calcCreditTaxKoeff += 0.01;
        else if (clientAge < 30) calcCreditTaxKoeff += 0.005;
        if (clientSalary >= 80_000) calcCreditTaxKoeff -= 0.007;
        int maxCreditMonthPurchase = (int) (clientWishCreditSum / creditPeriod * calcCreditTaxKoeff);
        boolean isClientPayable = maxClientMonthPurchase >= maxCreditMonthPurchase;
        if (!(isClientAdult && isClientRelevant))
            System.out.println("Вам отказано в выдаче кредитной карты!");
        else if (!isClientPayable)
            System.out.println("Максимальный платеж при ЗП " + clientSalary +
                    " равен " + maxClientMonthPurchase + " рублей. Платеж по кредиту " + maxCreditMonthPurchase +
                    " рублей. Вам в кредите Отказано!");
        else
            System.out.println("Максимальный платеж при ЗП " + clientSalary +
                    " равен " + maxClientMonthPurchase + " рублей. Платеж по кредиту " + maxCreditMonthPurchase +
                    " рублей. Кредит Одобрен!");
//        Task 4. Циклы
        System.out.println("Task 4. Ping-Pong");
        for (int i = 0; i < 30; i++) {
            if ((i+1) % 3 == 0 && (i+1) % 5 == 0) System.out.println((i+1) + " :Ping Pong!");
            else if ((i+1) % 3 == 0) System.out.println((i+1) + " :Ping");
            else if ((i+1) % 5 == 0) System.out.println((i+1) + " :Pong");
            else System.out.println((i+1) + " :");
        }
//        Task 5
        System.out.println("Task 5");
        short aFibo = 0; short bFibo = 1;
        short buffer = 0;
        System.out.println("Последовательность ряда Фибоначчи:");
        System.out.print(aFibo + " " + bFibo + " ");
        for (int i = 0; i < 7; i++) {
            System.out.print(aFibo + bFibo + " ");
            buffer = aFibo; aFibo = bFibo; bFibo = (short) (buffer + bFibo);
        }
        System.out.println(aFibo + bFibo);
    }
}
