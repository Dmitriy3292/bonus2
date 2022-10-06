public class Main {
    public static void main(String[] args) {

        int amount = 100;   //начальная сумма
        int sumInput = 1211;  // сумма полнения


        int bonus;
        if (sumInput > 1000) {
            bonus = sumInput / 100;  //считаю бонус
            int total = amount + bonus + sumInput;  // считаю итоговую сумму

            System.out.println(" Ваша сумма баланса " + total + " начисленные бонусы " + bonus);
        }

    }

}
