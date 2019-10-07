public class Program {
    public static void preview()
    {
        System.out.println("Калькулятор");
        System.out.println("1) умеет работать только с арабскими или римскими цифрами одновременно");
        System.out.println("2) умеет работать только с целыми числами.");
        System.out.println("3) принимает значения только от 1 до 10 включительно");
        System.out.println("\nПримеры:");
        System.out.println("1 + 1");
        System.out.println("V + II");
        System.out.println("Для выхода введите exit\n\n");
    }
    public static void afterview()
    {
        System.out.println("\n\nВ этом проекте использовались: ");
        System.out.println("1) Классы");
        System.out.println("2) Объектная композиция");
        System.out.println("3) Объектная агрегация");
        System.out.println("4) Конструкторы");
        System.out.println("5) Реализация интерфейса");
        System.out.println("6) Перечисления");
        System.out.println("7) Статические методы");
        System.out.println("8) Регулярные выражения");
        System.out.println("9) Выбрасывание исключений");
    }
    public static void main(String[] args) throws Exception {
        preview();

        App application = new App(System.in);
        application.run();

        afterview();
    }
}
