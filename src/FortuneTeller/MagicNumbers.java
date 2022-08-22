package FortuneTeller;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        int numberOfNames = name.length() - name.replaceAll(" ", "").length() + 1;
        int result = age + numberOfNames;
        while(result >= 10){
            result -= 7;
        }
        return result;
    }

    public int calculateB() {
        int numberOfCharacters = location.length();
        int result = income + numberOfCharacters;
        while(result >= 10){
            result -= 7;
        }
        return result;
    }

    public int calculateC() {
        int result = calculateA() + calculateB() - height;
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
        result -= income;
        while(result < 0){
            result += 10;
        }
        return result;
    }

    public int calculateE() {
        double result = (age * income) * income ;
        result *= height;
        result = Math.sqrt(result);
        while(result >= 10){
            result /= 2;
        }
        result = Math.round(result);
        return (int)result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}