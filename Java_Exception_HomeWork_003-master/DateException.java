package javaErrorException.HomeWork_003;

public class DateException extends Exception {
    public DateException() {
    }

    public void dateException(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("It`s not correct date format: %s", i);
        System.out.println();
    }
}
