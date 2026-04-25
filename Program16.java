
interface Classify {
    String getDivision(double average);
}


class Result implements Classify {

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

        Result result = new Result();

        System.out.println(result.getDivision(72));
        System.out.println(result.getDivision(55)); 
    }
}
