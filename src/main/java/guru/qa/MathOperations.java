package guru.qa;

public class MathOperations {

    public static void main(String[] args) {
        mathOperationsForTask0();
        mathOperationsForTask1();
        mathOperationsForTask2();
        mathOperationsForTask3();
        mathOperationsForTask4();
    }


    public static void mathOperationsForTask0() {

        //применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int

        int primitiveOne = 20;
        int primitiveTwo = 3;

        int sum = primitiveOne + primitiveTwo;
        System.out.println("Сумма двух примитивов: " + sum);

        int difference = primitiveOne - primitiveTwo;
        System.out.println("Разница двух примитивов: " + difference);

        int multiply = primitiveOne * primitiveTwo;
        System.out.println("Произведение двух примитивов: " + multiply);

        int quotient = primitiveOne / primitiveTwo;
        System.out.println("Частное двух примитивов: " + quotient);
    }

    public static void mathOperationsForTask1() {

        //применить несколько арифметических операций над int и double в одном выражении

        int intValue = 10;
        double doubleValue = 6.5;

        // результат - double
        double sum = intValue + doubleValue;
        System.out.println("Сумма int и double: " + sum);

        // результат - double
        double difference = intValue - doubleValue;
        System.out.println("Разница int и double: " + difference);

        // результат - double
        double multiply = intValue * doubleValue;
        System.out.println("Произведение int и double: " + multiply);

        //результат - double
        double quotient = intValue / doubleValue;
        System.out.println("Частное int и double: " + quotient);
    }

    public static void mathOperationsForTask2() {

        // применить несколько логических операций ( < , >, >=, <= )

        int a = 10;
        double b = 7.5;

        boolean lessThan = a < b;
        System.out.println(a + " < " + b + " : " + lessThan);

        boolean greaterThan = a > b;
        System.out.println(a + " > " + b + " : " + greaterThan);

        boolean lessOrEqual = b <= b;
        System.out.println(b + " <= " + b + " : " + lessOrEqual);

        boolean greaterOrEqual = a >= b;
        System.out.println(a + " >= " + b + " : " + greaterOrEqual);
    }

    public static void mathOperationsForTask3() {

        // прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой (какие максимальные и минимальные значения есть, как их получить) и переполнение

        //какие максимальные и минимальные значения есть, как их получить
        System.out.println("float MIN_VALUE: " + Float.MIN_VALUE); // 1.4E-45
        System.out.println("float MAX_VALUE: " + Float.MAX_VALUE); // 3.4028235E38
        System.out.println("double MIN_VALUE: " + Double.MIN_VALUE); // 4.9E-324
        System.out.println("double MAX_VALUE: " + Double.MAX_VALUE); // 1.7976931348623157E308

        //Переполнение(бесконечность)
        float overFloatValue = Float.MAX_VALUE * 2;  //
    }

    public static void mathOperationsForTask4() {

        // получить переполнение при арифметической операции

        int plusOverflowInt = Integer.MAX_VALUE + 1;    // будет выход за пределы диапазона типа данных в большую строну
        System.out.println("MAX_INT + 1: " + plusOverflowInt);

        int minusOverflowInt = Integer.MIN_VALUE - 1;    // будет выход за пределы диапазона типа данных в меньшую строну
        System.out.println("MIN_INT - 1: " + minusOverflowInt);
    }

}
