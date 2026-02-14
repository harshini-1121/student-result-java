public class StudentResultTest {

    public static String getResult(int marks) {

        if(marks >= 40){
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    public static void main(String[] args) {

        int marks = 75;

        System.out.println("Student Marks: " + marks);
        System.out.println("Result: " + getResult(marks));
    }
}
