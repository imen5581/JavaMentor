
public class Calculator implements BasicCalculations {
    private final int MAX_VALUE = 10;
    private final int MIN_VALUE = 1;

    //Реализовано только ради выбрасывания исключения
    private boolean check(int a)
    {
        //Если меньше или равно максимальному значению и если равно или больше минимального значения
        if(MAX_VALUE >= a && MIN_VALUE <= a)
            return true;
        return false;
    }

    @Override
    public int sum(int a, int b) throws IllegalArgumentException {
        if(check(a) && check(b))
            return a + b;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public int division(int a, int b) throws IllegalArgumentException/*, ArithmeticException*/ {
        //Так как мин = 1, нуля быть не может
        //if(b == 0) throw new ArithmeticException();
        if(check(a) && check(b))
            return a / b;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public int multiplication(int a, int b) throws IllegalArgumentException {
        if(check(a) && check(b))
            return a * b;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public int subtract(int a, int b) throws IllegalArgumentException {
        if(check(a) && check(b))
            return a - b;
        else
            throw new IllegalArgumentException();
    }
}