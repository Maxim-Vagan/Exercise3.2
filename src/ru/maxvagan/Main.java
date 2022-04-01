package ru.maxvagan;

public class Main {

    public static void main(String[] args) {
//      Lesson1.3 - Дополнительные задания
//	    Task 1
        System.out.println("Task 1");
//        int valueNumber = 137;
        long valueNumber = Math.round(Math.random()*300);
        boolean isNumberOdd = valueNumber % 2 == 0;
        if (isNumberOdd && valueNumber != 0) {
            System.out.println("Число: " + valueNumber + " является чётным");
        } else {
            System.out.println("Число: " + valueNumber + " является нечётным");
        }
//	    Task 2
        System.out.println("Task 2");
        short controlNumber = 10;
        float valueP = 9.3f; float valueD = 11.23f;
        float distanceP = Math.abs(controlNumber - valueP); float distanceD = Math.abs(controlNumber - valueD);
        if (distanceP < distanceD){
            System.out.println("К контрольному числу: " + controlNumber + " ближе всего число: " + valueP);
        } else {
            System.out.println("К контрольному числу: " + controlNumber + " ближе всего число: " + valueD);
        }
//	    Task 3
        System.out.println("Task 3");
        long valueFromRange = 3 + Math.round(Math.random()*155);
        if (valueFromRange >=22 && valueFromRange < 100) {
            System.out.println("Контрольное значение " + valueFromRange + " находится в контрольном интервале [22; 99]");
        } else System.out.println("Контрольное значение " + valueFromRange + " не находится в контрольном интервале [22; 99]");
//	    Task 4
        System.out.println("Task 4");
        long random3signedNumber = 100 + Math.round(Math.random()*899);
        long firstDecimal = random3signedNumber / 100;
        long secondDecimal = (random3signedNumber - firstDecimal*100) / 10;
        long thirdDecimal = random3signedNumber % 10;
//        long maximumDecimal = Math.max(Math.max(firstDecimal, secondDecimal), thirdDecimal);
        long maximumDecimal = firstDecimal;
        if (maximumDecimal < secondDecimal){maximumDecimal = secondDecimal;}
        if (maximumDecimal < thirdDecimal){maximumDecimal = thirdDecimal;}
        System.out.println("Самой большой цифрой числа: " + random3signedNumber + " является - " + maximumDecimal);
//	    Task 5
        System.out.println("Task 5");
        int num = 33000;
        long numberA = 32000 - Math.round(Math.random()*64000);
        long numberB = 32000 - Math.round(Math.random()*64000);
        long numberC = 32000 - Math.round(Math.random()*64000);
        long firstN, secondN, thirdN;
        firstN = numberA;
        if (firstN > numberB){ firstN = numberB; }
        if (firstN > numberC){ firstN = numberC; }
        thirdN = numberA;
        if (thirdN < numberB){ thirdN = numberB; }
        if (thirdN < numberC){ thirdN = numberC; }
        if (numberA > firstN && numberA < thirdN){
            secondN = numberA;
        } else if (numberB > firstN && numberB < thirdN) {
            secondN = numberB;
        } else { secondN = numberC; }
        System.out.println("Даны числа: " + numberA + "; " + numberB + "; " + numberC);
        System.out.println("Возрастающая последовательность такова: " + firstN + "; " + secondN + "; " + thirdN);
//	    Task 6
        System.out.println("Task 6");
        int a = 12; int b = 27; int c = 44; int d = 15; int e = 9;
        int result = a * (b + (c - d * e)); int newResult = result*(-1);
        System.out.println("Изначальный результат result = " + result + ". Инвертированный: " + newResult);
//	    Task 7
        System.out.println("Task 7");
        int numA = 5; int numB = 7;
        System.out.println("Дано: A = "+ numA + "; B = " + numB);
        if (numA < numB){
            numA = numB - numA;
            numB = numB - numA;
            numA = numB + numA;
        } else {
            numA = numA - numB;
            numB = numB + numA;
            numA = numB - numA;
        }
        System.out.println("Стало: A = "+ numA + "; B = " + numB);
//	    Task 8
        System.out.println("Task 8");
        long varA = 100 + Math.round(Math.random()*899);
        long varB = ((varA % 100) / 10);
        System.out.println("В числе: " + varA + " центральной цифрой является - " + varB);
    }
}
