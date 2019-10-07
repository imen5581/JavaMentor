import java.io.InputStream;
import java.util.Scanner;

public class App {
    private Scanner scanner;
    private Calculator calculator;
    private Converter converter;

    public App(InputStream stream)
    {
        this.scanner = new Scanner(stream);
        calculator = new Calculator();
        converter = new Converter();
    }
    public void run() throws Exception {
        String expression;
        Operation operation;
        String firstStr;
        String secondStr;
        int firstNum;
        int secondNum;
        int result = -1;
        boolean isRoman = false;

        while(true)
        {
            //Считывание и удаление всех пробелов
            expression = scanner.next();
            expression = expression.replaceAll("\\s","");
            if(expression.equalsIgnoreCase("exit"))
                break;

            //Парсинг первого, второго числа и операции
            operation = Parser.getOperation(expression);
            firstStr = Parser.getFirst(expression);
            secondStr = Parser.getSecond(expression);

            //Если что-то из них не запарсилось, то выбрасываем исключение
            if(firstStr == null || secondStr == null || operation == null)
                throw new Exception();
            else {
                //Если оба числа в строком представлении Арабские
                if(converter.isInt(firstStr) && converter.isInt(secondStr))
                {
                    firstNum = converter.convertArabNums(firstStr);
                    secondNum = converter.convertArabNums(secondStr);
                }
                //Иначе если оба числа в строком представлении Римские
                else if(!converter.isInt(firstStr) && !converter.isInt(secondStr))
                {
                    firstNum = converter.convertRomanNums(firstStr);
                    secondNum = converter.convertRomanNums(secondStr);
                    isRoman = true;
                }
                //Иначе выбрасываем исключение
                else
                    throw new Exception();
            }

            switch (operation){
                case ADDITION:
                    result = calculator.sum(firstNum, secondNum);
                    break;
                case DIVISION:
                    result = calculator.division(firstNum, secondNum);
                    break;
                case SUBTRACTION:
                    result = calculator.subtract(firstNum, secondNum);
                    break;
                case MULTIPLICATION:
                    result = calculator.multiplication(firstNum, secondNum);
                    break;
            }
            if(!isRoman)
                System.out.println(result);
            else
                System.out.println(converter.toRoman(result));
        }
    }

}
