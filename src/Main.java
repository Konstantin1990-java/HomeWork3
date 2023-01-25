public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 20;
        short b = 500;
        int c = 1000;
        long d = 1000000L;
        float e = 567.98f;
        double f = 23546.7869;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int numberStudentsClass1 = 23;
        int numberStudentsClass2 = 27;
        int numberStudentsClass3 = 30;
        System.out.println("На каждого ученика рассчитано " + 480 / (numberStudentsClass1 + numberStudentsClass2 + numberStudentsClass3) + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int bottlesMinute = 8;
        System.out.println("За 20 минут машина произвела " + 20 * bottlesMinute + " штук бутылок");
        System.out.println("За 1 день машина произвела " + 1440 * bottlesMinute + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + 4320 * bottlesMinute + " штук бутылок");
        System.out.println("За месяц машина произвела " + 43200 * bottlesMinute + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int totalNumberCansPaint = 120;
        int consumptionWhitePaint = 2;
        int consumptionBrownPaint = 4;
        int totalClass = totalNumberCansPaint / (consumptionWhitePaint + consumptionBrownPaint);
        System.out.println("В школе, где " + totalClass +
                " классов, нужно " + totalClass * consumptionWhitePaint + " банок белой краски и " + totalClass * consumptionBrownPaint +
                " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int bananasCount =5;
        int milkCount = 2;
        int iecCreamCount = 2;
        int eggCount = 4;
        int weightBananasUnit = 80;
        int weightMilkUnit = 105;
        int weightIceCreamUnit = 100;
        int weightEggUnit = 70;
        int weightInGrams = (bananasCount * weightBananasUnit) + (milkCount * weightMilkUnit) + (iecCreamCount * weightIceCreamUnit) + (eggCount * weightEggUnit);
        double weightInKilograms =(double) weightInGrams / 1000;
        System.out.println("Вес спортзавтрака в граммах равен " + weightInGrams);
        System.out.println("Вес спортзавтрака в граммах равен " + weightInKilograms);
    }

    public static void task7() {
        System.out.println("Задача 7");
        double cellLoseWeightInGrams = 7000;
        double converterDays250 = cellLoseWeightInGrams / 250;
        double converterDays500 = cellLoseWeightInGrams / 500;
        double averageDays = (converterDays250 + converterDays500) / 2;
        System.out.println("Если спортсмен будет худеть на 250 грамм в день, то он похудеет на 7кг за " + converterDays250 + " дней");
        System.out.println("Если спортсмен будет худеть на 500 грамм в день, то он похудеет на 7кг за " + converterDays500 + " дней");
        System.out.println("В среднем он похудеет за " + averageDays + " дней");
    }

    public static void task8() {
        System.out.println("Задача 8");
        double salary1 = 67760;
        double salary2 = 83690;
        double salary3 = 76230;
        double salaryIncrease1 = ((salary1 / 100) * 10) + salary1;
        double salaryIncrease2 = ((salary2 / 100) * 10) + salary2;
        double salaryIncrease3 = ((salary3 / 100) * 10) + salary3;
        double annualIncome1 = (salaryIncrease1 * 12) - (salary1 * 12);
        double annualIncome2 = (salaryIncrease2 * 12) - (salary2 * 12);
        double annualIncome3 = (salaryIncrease3 * 12) - (salary3 * 12);
        System.out.println("Маша теперь получает " + salaryIncrease1 + " рублей. Годовой доход вырос на " +
                annualIncome1 + " рублей");
        System.out.println("Денис теперь получает " + salaryIncrease2 + " рублей. Годовой доход вырос на " +
                annualIncome2 + " рублей");
        System.out.println("Кристина теперь получает " + salaryIncrease3 + " рублей. Годовой доход вырос на " +
                annualIncome3 + " рублей");

    }
}