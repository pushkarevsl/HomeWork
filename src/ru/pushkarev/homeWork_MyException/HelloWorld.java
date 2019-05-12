package ru.pushkarev.homeWork_MyException;


public class HelloWorld {

    private static Object object;

    public static void main(String[] args) {

        try {
            int result = divide(2, 1);
            System.out.println(result);

            System.out.println(object.toString());

        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int divide(int a, int z) throws DivisionByZeroException {

        if (z == 0) {
            DivisionByZeroException exception = new DivisionByZeroException();
            throw exception;
        }
        return a / z;

    }
}

