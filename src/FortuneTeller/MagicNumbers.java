package FortuneTeller;

public class MagicNumbers {

    private String name;
    private int DOB;
    private String ZodiacSign;
    private int MOB;
    private int YOB;

    public int calculateA() {
        int numberOfNames = name.length() - name.replaceAll(" ", "").length() + 1;
        int result = MOB + numberOfNames;
        while(result >= 10){
            result -= 7;
        }
        return result;
    }

    public int calculateB() {
        int numberOfCharacters = ZodiacSign.length();
        int result = DOB + numberOfCharacters;
        while(result >= 10){
            result -= 7;
        }
        return result;
    }

    public int calculateC() {
        int result = calculateA() + calculateB() - YOB;
        while(result < 0){
            result += 10;
        }
        return result;
    }

    public int calculateD() {
        int result = calculateA();
        if(result > 5){
            result += calculateB();
        }
        else{
            result += calculateC();
        }
        result -= DOB;
        while(result < 0){
            result += 10;
        }
        return result;
    }

//    public int calculateE() {
//        double result = (MOB * DOB) * DOB;
//        result *= YOB;
//        result = Math.sqrt(result);
//        while(result >= 10){
//            result /= 2;
//        }
//        result = Math.round(result);
//        return (int)result;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public void setZodiacSign(String zodiacSign) {
        this.ZodiacSign = zodiacSign;
    }

    public void setMOB(int MOB) {
        this.MOB = MOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }
}