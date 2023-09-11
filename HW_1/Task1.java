package HW_1;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
// Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы
// массива
// Метод divisionByZero - Деление на 0
// Метод numberFormatException - Ошибка преобразования строки в число
// Важно: они не должны принимать никаких аргументов

  class Answer {
    public static void arrayOutOfBoundsException() {
        Integer[] array = { 1, 5, 8, 41, 33 };
    System.out.println(array[9]);
}

    public static void divisionByZero() {
          int a = 5;
          int b = 0;
          System.out.println(a / b);
}

    public static void numberFormatException() {
      String string = "123Число";
      int number = Integer.parseInt(string);
      System.out.println(number);
 }
}

public class Task1 {
    public static void main(String[] args) {
        new Answer();
        try {
            Answer.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            Answer.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            Answer.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}