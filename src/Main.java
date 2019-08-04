
import java.lang.*;


//class User {
//    private Integer age;
//    private String sex;
//
//    public User(String name, String sex) {
//        this.age = age;
//        this.sex = sex;
//    }
//
//    public Integer getAge() {
//        return this.age;
//    }
//
//    public String getSex() {
//        return this.sex;
//    }
//}

class Validator {
    public boolean validateAge(Integer age) {
        if (age<15) {
            System.out.println("Age under 15");
            return false;
        } else {
            System.out.println("Age more than 15");
            return true;
        }
    }

    public void validateSex(String sex) {
        if(sex == "male") {
            System.out.println("This is male");
        } else {
            System.out.println("This is female");
        }
    }
}
public class Main {

    public static void main(String[] args) {

        System.out.println("Starting...");
        int age = 18;
        String sex = "male";

        Validator validator = new Validator();
        boolean checkAge = validator.validateAge(age);

        if (checkAge) {
            validator.validateSex(sex);
        }
        System.out.println("End program ...");
    }
}
