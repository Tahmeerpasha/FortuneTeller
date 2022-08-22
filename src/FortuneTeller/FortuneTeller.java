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
        e = magicNumbers.calculateE();
        String fortune = translator.getFortune(a, b, c, d, e);
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

    public boolean setIncome(String income) {
        Integer incomeValue = convertToInteger(income);
        if (incomeValue == null) {
            return false;
        } else {
            magicNumbers.setIncome(incomeValue);
            return incomeValue<=10_000_000;
        }
    }

    public boolean setLocation(String location) {
        magicNumbers.setLocation(location);
        return location != null;
    }

    public boolean setAge(String age) {
        Integer ageValue = convertToInteger(age);
        if (ageValue == null) {
            return false;
        } else {
            magicNumbers.setAge(ageValue);
            return true;
        }
    }

    public boolean setHeight(String height) {
        Integer heightValue = convertToInteger(height);
        if (heightValue == null) {
            return false;
        } else {
            magicNumbers.setHeight(heightValue);
            return true;
        }
    }
}