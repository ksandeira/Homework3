public class Main {
    public static void main(String[] args) {
       System.out.println("Задание 1,2");
       float a = 27.12F;
       System.out.println(a);
       long b = 987678965549L;
       System.out.println(b);
       float c = 2.786F;
       System.out.println(c);
       short d = 569;
       System.out.println(d);
       short e = -159;
       System.out.println(e);
       short f = 27897;
       System.out.println(f);
       byte g = 67;
       System.out.println(g);

       System.out.println("Задание 3");
       byte teacher1 = 23;
       byte teacher2 = 27;
       byte teacher3 = 30;
       short paper = 480;
       int totalStudents = teacher1 + teacher2 + teacher3;
       int studentPaper = paper / totalStudents;
       System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");

       System.out.println("Задание 4");
       byte minutes2 = 16;
       byte minutesHour = 60;
       byte hourDay = 24;
       byte daysMonth = 30;
       byte bottlesMin = (byte) (minutes2 / 2);
       short twentyMinutes =(short) (20 * bottlesMin);
       System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
       int oneDay = bottlesMin * minutesHour * hourDay;
       System.out.println("За один день машина произвела " + oneDay + " штук бутылок");
       int threeDays = oneDay * 3;
       System.out.println("За три дня машина произвела " + threeDays + " штук бутылок");
       int oneMonth = oneDay * daysMonth;
       System.out.println("За один месяц машина произвела " + oneMonth + " штук бутылок");

       System.out.println("Задание 5");
       byte totalPaints = 120;
       byte whitePaint = 2;
       byte brownPaint = 4;
       byte oneClass = (byte) (whitePaint + brownPaint);
       byte totalClasses = (byte) (totalPaints / oneClass);
       byte whiteClass = (byte) (totalClasses * whitePaint);
       byte brownClass = (byte) (totalClasses * brownPaint);
       System.out.println("В школе, где " + totalClasses + " классов, нужно " + whiteClass + " банок белой краски и " + brownClass + " банок коричневой краски");

       System.out.println("Задание 6");
       int bananaWeight = 5 * 80;
       int milkWeight = 2 * 105;
       int iceCreamWeight = 2 * 100;
       int eggsWeight = 4 * 70;
       int breakfastGr = bananaWeight + milkWeight + iceCreamWeight + eggsWeight;
       System.out.println("Вес завтрака в граммах: " + breakfastGr + " грамм");
       float breakfastKg = (float) (breakfastGr / 1000);
       System.out.println("Вес завтрака в килограммах: " + breakfastKg + " кг");

       System.out.println("Задание 7");
       byte resetWeight = 7;
       short loseWeight1 = 250;
       short loseWeight2 = 500;
       int dayLose1 = resetWeight * 1000 / loseWeight1;
       int dayLose2 = resetWeight * 1000 / loseWeight2;
       int averageDays = (dayLose1+ dayLose2) / 2;
       System.out.println("Если спортсмен будет терять " + loseWeight1 + " грамм в день, то потребуется " + dayLose1 + " дней.");
       System.out.println("ЕСли спортсмен будет терять " + loseWeight2 + " грамм в день, то потребуется " + dayLose2 + " дней.");
       System.out.println("В среднем на похудение у спортсмена уйдет " + averageDays + " день.");

       System.out.println("Задание 8");
       int salary1 = 67760;
       int salary2 = 83690;
       int salary3 = 76230;
       double salaryPercent = 0.10;
       double salaryPromotion1 = salary1 * salaryPercent;
       double newSalary1 = salary1 + salaryPromotion1;
       double incomeOld1 = salary1 * 12;
       double incomeNew1 = newSalary1 * 12;
       double incomeDiff1 = incomeNew1 - incomeOld1;
       System.out.println("Маша теперь получает " + newSalary1 + " рублей." + " Годовой доход вырос на " + incomeDiff1 + " рублей.");
       double salaryPromotion2 = salary2 * salaryPercent;
       double newSalary2 = salary2 + salaryPromotion2;
       double incomeOld2 = salary2 * 12;
       double incomeNew2 = newSalary2 * 12;
       double incomeDiff2 = incomeNew2 -incomeOld2;
       System.out.println("Денис теперь получает " + newSalary2 + " рублей." + " Годовой доход вырос на " + incomeDiff2 + " рублей.");
       double salaryPromotion3 = salary3 * salaryPercent;
       double newSalary3 = salary3 + salaryPromotion3;
       double incomeOld3 = salary3 * 12;
       double incomeNew3 = newSalary3 * 12;
       double incomeDiff3 = incomeNew3 - incomeOld3;
       System.out.println("Кристина теперь получает " + newSalary3 + " рублей." + " Годовой доход вырос на " + incomeDiff3 + " рублей.");
    }
}