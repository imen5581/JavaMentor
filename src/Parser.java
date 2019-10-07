public class Parser {
    public static Operation getOperation(String expression)
    {
        for(int i = 0; i < expression.length(); i++)
        {
            for(Operation op : Operation.values())
                if(op.asChar() == expression.charAt(i))
                    return op;
        }
        return null;
    }
    public static String getFirst(String expression) {
        String result = "";
        for (int i = 0; i < expression.length(); i++)
        {
            char ch = expression.charAt(i);
            if(Character.isLetterOrDigit(ch))
                result += ch;
            else break;
        }
        return result;
    }
    public static String getSecond(String expression)
    {
        //VIII+V
        //VIII прочтется
        //по индексу останутся "+V"
        String result = "";
        //Флаг для пропуска первого числа
        boolean flag = false;
        for(int i = 0; i < expression.length(); i++)
        {
            char ch = expression.charAt(i);
            if(!Character.isLetterOrDigit(ch) && !flag)
                flag = true;

            if(Character.isLetterOrDigit(ch) && flag)
                result += ch;
        }
        return result;
    }
}
