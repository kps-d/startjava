public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль \n");

        boolean pc = true;
        byte core = 4;
        int ramm = 16_000;
        long hddSwapSize = 2_000_221_184l;
        float biosBootSize = 4.2f;
        char osName = 'U';
        System.out.println("Есть ли компьютер? - " + pc);
        System.out.println(core + " ядра в процессоре");
        System.out.println(ramm + "MB оперативной памяти");
        System.out.println(hddSwapSize + " bytes - размер файла подкачки");
        System.out.println(biosBootSize + "mb - размер загрузочного раздела BIOS");
        System.out.println(osName + "buntu - операционная система");

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        int pensileCost = 100;
        int bookCost = 200;
        double discount = 0.89;
        System.out.println("Общая стоимость товара без скидки: " + (pensileCost + bookCost));
        System.out.println("Сумма скидки: " + (pensileCost + bookCost) * (1 - discount));
        System.out.println("Общая стоимость товара со скидкой: " + (pensileCost + bookCost) * discount);

        System.out.println("\n3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807l;
        System.out.println("Первоначальное значение переменной byte: " + maxByte);
        System.out.println("Значение после инкремента переменной byte: " + (maxByte + 1));
        System.out.println("Значение после декремента переменной byte: " + (maxByte - 1));
        System.out.println("Первоначальное значение переменной short: " + maxShort);
        System.out.println("Значение после инкремента переменной short: " + (maxShort + 1));
        System.out.println("Значение после декремента переменной short: " + (maxShort - 1));
        System.out.println("Первоначальное значение переменной int: " + maxInt);
        System.out.println("Значение после инкремента переменной int: " + (maxInt + 1));
        System.out.println("Значение после декремента переменной int: " + (maxInt - 1));
        System.out.println("Первоначальное значение переменной long: " + maxLong);
        System.out.println("Значение после инкремента переменной long: " + (maxLong + 1));
        System.out.println("Значение после декремента переменной long: " + (maxLong - 1));

        System.out.println("\n5. Перестановка значений переменных\n");

        int a = 2;
        int b = 5;
        System.out.println("Перестановка значений с помощью третьей переменной");
        System.out.println("Исходное значение переменной a: " + a);
        System.out.println("Исходное значение переменной b: " + b);
        int c = b;
        b = a;
        a = c;
        System.out.println("Новое значение переменной а: " + a);
        System.out.println("Новое значение переменной b: " + b);
        System.out.println("\nПерестановка значений с помощью арифметических операций");
        System.out.println("Исходное значение переменной a: " + a);
        System.out.println("Исходное значение переменной b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Новое значение переменной а: " + a);
        System.out.println("Новое значение переменной b: " + b);
        System.out.println("\nПерестановка значений с помощью побитовой операции ^ ");
        System.out.println("Исходное значение переменной a: " + a);
        System.out.println("Исходное значение переменной b: " + b);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("Новое значение переменной а: " + a);
        System.out.println("Новое значение переменной b: " + b);

        System.out.println("\n6. Вывод символов и их кодов\n");

        int dec35 = 35;
        int dec38 = 38;
        int dec64 = 64;
        int dec94 = 94;
        int dec95 = 95;
        char symbol35 = (char) dec35;
        char symbol38 = (char) dec38;
        char symbol64 = (char) dec64;
        char symbol94 = (char) dec94;
        char symbol95 = (char) dec95;
        System.out.println(dec35 + " " + symbol35);
        System.out.println(dec38 + " " + symbol38);
        System.out.println(dec64 + " " + symbol64);
        System.out.println(dec94 + " " + symbol94);
        System.out.println(dec95 + " " + symbol95);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char s1 = (char) 47; // '/'
        char s2 = (char) 92; // '\'
        char s3 = (char) 95; // '_'
        char s4 = (char) 40; // '('
        char s5 = (char) 41; // ')'

        System.out.println("    " + s1 + s2);
        System.out.println("   " + s1 + "  " + s2);
        System.out.println("  " + s1 + s3 + s4 + " " +s5 + s2);
        System.out.println(" " + s1 + "      " + s2);
        System.out.println("" + s1 + s3 + s3 + s3 + s3 + s1 + s2 + s3 + s3 + s2); // почему если не добавлять строку выводиться числовое значение?

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");

        int num = 123;
        int sumHungreds = num / 100;
        int sumTens = (num % 100) / 10;
        int sumOne = num - (sumHungreds * 100) - (sumTens * 10);
        System.out.println("Число " + num + " содержит:");
        System.out.println(sumHungreds + " сотен");
        System.out.println(sumTens + " десятков");
        System.out.println(sumOne + " единиц");
        System.out.println("Сумма его цифр = " + (sumHungreds + sumOne + sumTens));
        System.out.println("Произведение = " + (sumHungreds * sumOne * sumTens));

        System.out.println("\n9. Вывод времени\n");

        int sec = 86_399;
        int sumOurs = sec / 3_600;
        int sumMin = (sec % 3600) / 60;
        int sumSec = sec - (sumOurs * 3_600) - (sumMin * 60);
        System.out.println(sumOurs + ":" + sumMin + ":" + sumSec);
    }
}