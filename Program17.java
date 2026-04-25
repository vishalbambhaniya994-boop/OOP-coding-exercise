
interface Exam {
    boolean isPassed(int mark);
}


interface Classify {
    String getDivision(double average);
}


class Result implements Exam, Classify {

    
    @Override
    public boolean isPassed(int mark) {
        return mark >= 40; 
    }

    
    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Below First Division";
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Result r = new Result();

        int mark = 55;
        double average = 65.5;

        
        System.out.println("Marks: " + mark);
        if (r.isPassed(mark)) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

        
        System.out.println("Average: " + average);
        System.out.println("Division: " + r.getDivision(average));
    }
}
