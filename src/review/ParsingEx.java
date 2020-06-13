package review;

public class ParsingEx {
    public static void main(String[] args) {
        String tenString = "10";
        //this wont work since you cant add integer and string
        //Integer result = 20 + tenString;

        //this will set result to 30
        Integer result = 20 + Integer.parseInt(tenString);
        System.out.println(result);
    }
}
