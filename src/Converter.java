public class Converter {
    public boolean isInt(String str)
    {
        try
        {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
    public int convertRomanNums(String roman) throws NumberFormatException
    {
        switch (roman){
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
        }
        throw new NumberFormatException();
    }
    //NumberFormatException наследуется от IllegalArgumentException
    public int convertArabNums(String arab) throws IllegalArgumentException //, NumberFormatException
    {
        int result = Integer.parseInt(arab);
        return result;
    }

    public String toRoman(int number) {
        return String.valueOf(new char[number]).replace('\0', 'I')
                //Простая замена
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX");
    }
}
