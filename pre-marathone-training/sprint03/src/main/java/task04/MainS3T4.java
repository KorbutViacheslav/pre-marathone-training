package task04;

public class MainS3T4 {
    public static void main(String[] args) {
        LineType lineType = LineType.DOTTED;
        System.out.println(message(lineType));
    }

    public static String message(LineType lineType) {
        return "The line is " + lineType.toString().toLowerCase() + " type.";
    }
}
