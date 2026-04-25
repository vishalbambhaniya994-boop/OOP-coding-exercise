import java.util.Scanner;

public class College {

    
    private String collegeName;

   
    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    
    class Admission {
        private String studentName;
        private String course;

        
        public void acceptData() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name: ");
            studentName = sc.nextLine();

            System.out.print("Enter course: ");
            course = sc.nextLine();
        }

       
        public void displayData() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); // accessing outer class member
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    
    public static void main(String[] args) {

        
        College college = new College("SSASIT College");

        
        College.Admission admission = college.new Admission();

        
        admission.acceptData();
        admission.displayData();
    }
}
