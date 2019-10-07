enum Operation {
    //Экземпляры перечисления
    MULTIPLICATION('*'),
    DIVISION('/'),
    ADDITION('+'),
    SUBTRACTION('-');

    //Конструктор
    Operation(char asChar)
    {
        this.asChar = asChar;
    }
    //Сам символ операции
    private final char asChar;
    //Геттер для получения символа операции
    public char asChar() {
        return asChar;
    }

}
