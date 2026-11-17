public class TVLoyaltyProgram {
    public static void main(String[] args) {
        // объявляем переменные, которые будем использовать дальше в программе
        int targetAmount = 40000; // сколько нужно накопить
        int day = 1; // переменная для подсчёта количества дней
        int dailyIncome = 1; // переменная, показывающая ежедневные поступления

        // условие для цикла, переменную для накопления результата назовите totalAmount
        for (int totalAmount = 1; totalAmount <=targetAmount; totalAmount+=dailyIncome) {
            System.out.println("День " + day + ". На счету " + totalAmount);
            // правила изменения дня и ежедневных поступлений для первого тарифа
            dailyIncome*=2;
            day++;
        }

        System.out.println("В варианте I на " + day + "-й день будет достигнута нужная сумма." );



        // не забудьте задать значения переменных day и dailyIncome,
        // соответственно условиям второго тарифа
        day = 1;
        dailyIncome = 100;;
        for (int totalAmount=100; totalAmount <= targetAmount; totalAmount+=dailyIncome) { // условие для цикла. переменную для накопления результата назовите totalAmount
            System.out.println("День " + day + ". На счету " + totalAmount);
            // правила изменения дня и ежедневных поступлений для второго тарифа
            dailyIncome+=100;
            day++;

        }

        System.out.println("В варианте II на " + day + "-й день будет достигнута нужная сумма." );
    }
}
