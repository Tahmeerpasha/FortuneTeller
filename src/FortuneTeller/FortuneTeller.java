package FortuneTeller;

public class FortuneTeller {
    MagicNumbers magicNumbers;

    FortuneTellerGui fortuneTellerGui;
    Translator translator;
    public String calculate() {
        int a, b, c, d, e;
        a = magicNumbers.calculateA();
        b = magicNumbers.calculateB();
        c = magicNumbers.calculateC();
        d = magicNumbers.calculateD();
        //e = magicNumbers.calculateE();
        String fortune = translator.getFortune(a, b, c, d);
        return fortune;
    }

    public static void main(String[] args) {
        new FortuneTeller();
    }

    FortuneTeller() {
        fortuneTellerGui = new FortuneTellerGui(this);
        magicNumbers = new MagicNumbers();
        translator = new Translator();

    }

    public boolean setName(String name) {

        magicNumbers.setName(name);
        return name != null;
    }

    Integer convertToInteger(String input) {
        Integer output = null;
        try {
            output = Integer.valueOf(input);
        } catch (NumberFormatException numberFormatException) {
            //if an exception is caught we'll return null
        }
        return output;
    }

    public boolean setDOB(String DOB) {
        Integer DOBValue = convertToInteger(DOB);
        if (DOBValue == null) {
            return false;
        } else {
            magicNumbers.setDOB(DOBValue);
            return DOBValue<=10_000_000;
        }
    }

    public boolean setZodiacSign(String ZodiacSign) {
        magicNumbers.setZodiacSign(ZodiacSign);
        return ZodiacSign != null;
    }

    public boolean setMOB(String MOB) {
        Integer MOBValue = convertToInteger(MOB);
        if (MOBValue == null) {
            return false;
        } else {
            magicNumbers.setMOB(MOBValue);
            return true;
        }
    }

    public boolean setYOB(String YOB) {
        Integer YOBValue = convertToInteger(YOB);
        if (YOBValue == null) {
            return false;
        } else {
            magicNumbers.setYOB(YOBValue);
            return true;
        }
    }
}