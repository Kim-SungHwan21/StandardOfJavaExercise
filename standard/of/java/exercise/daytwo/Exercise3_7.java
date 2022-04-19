package standard.of.java.exercise.daytwo;

public class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (5f/9f * (fahrenheit - 32f));
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println(String.format("Celcius: %.2f", celcius));
    }

}
