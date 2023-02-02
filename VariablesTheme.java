public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль \n");

        boolean pc = true;
        byte core = 4;
        short typeOs = 64;
        int ram = 16_000;
        long hddSwapSize = 2_000_221_184l;
        float biosBootSize = 4.2f;
        double cpuFreq = 2.700;
        char osName = 'U';
        System.out.println("Есть ли компьютер? - " + pc);
        System.out.println(core + " ядра в процессоре");
        System.out.println(ram + "MB оперативной памяти");
        System.out.println(hddSwapSize + " bytes - размер файла подкачки");
        System.out.println(biosBootSize + "mb - размер загрузочного раздела BIOS");
        System.out.println(cpuFreq + " МГц - частота процессора");
        System.out.println(osName + "buntu - операционная система");
        System.out.println(typeOs + " бит - тип операционной системы");

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        int penCost = 100;
        int bookCost = 200;
        int totalCost = penCost + bookCost;
        double discount = 0.89;
        System.out.println("Общая стоимость товара без скидки: " + totalCost);
        System.out.println("Сумма скидки: " + (totalCost * (1 - discount)));
        System.out.println("Общая стоимость товара со скидкой: " + (totalCost * discount));

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
        System.out.println("Значение после инкремента переменной byte: " + maxByte++);
        System.out.println("Значение после декремента переменной byte: " + maxByte--);
        System.out.println("Первоначальное значение переменной short: " + maxShort);
        System.out.println("Значение после инкремента переменной short: " + maxShort++);
        System.out.println("Значение после декремента переменной short: " + maxShort--);
        System.out.println("Первоначальное значение переменной int: " + maxInt);
        System.out.println("Значение после инкремента переменной int: " + maxInt++);
        System.out.println("Значение после декремента переменной int: " + maxInt--);
        System.out.println("Первоначальное значение переменной long: " + maxLong);
        System.out.println("Значение после инкремента переменной long: " + maxLong++);
        System.out.println("Значение после декремента переменной long: " + maxLong--);

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
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новое значение переменной а: " + a);
        System.out.println("Новое значение переменной b: " + b);
        System.out.println("\nПерестановка значений с помощью побитовой операции ^ ");
        System.out.println("Исходное значение переменной a: " + a);
        System.out.println("Исходное значение переменной b: " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новое значение переменной а: " + a);
        System.out.println("Новое значение переменной b: " + b);

        System.out.println("\n6. Вывод символов и их кодов\n");

        char hashtag = '#';
        char ampersand = '&';
        char commercialAt = '@';
        char caret = '^';
        char lowLine = '_';
        System.out.println((int) hashtag + " " + hashtag);
        System.out.println((int) ampersand + " " + ampersand);
        System.out.println((int) commercialAt + " " + commercialAt);
        System.out.println((int) caret + " " + caret);
        System.out.println((int) lowLine + " " + lowLine);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backSlash = '\\';
        char lowSlash = '_';
        char leftParent = '(';
        char rightParent = ')';

        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + lowSlash + leftParent + " " +rightParent + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + lowSlash + lowSlash + lowSlash + lowSlash + slash + 
                backSlash + lowSlash + lowSlash + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");

        int num = 123;
        int hungreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;
        System.out.println("Число " + num + " содержит:");
        System.out.println(hungreds + " сотен");
        System.out.println(tens + " десятков");
        System.out.println(ones + " единиц");
        System.out.println("Сумма его цифр = " + (hungreds + tens + ones));
        System.out.println("Произведение = " + (hungreds * tens * ones));

        System.out.println("\n9. Вывод времени\n");

        int totalSeconds = 86_399;
        int hours = totalSeconds / 3_600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}