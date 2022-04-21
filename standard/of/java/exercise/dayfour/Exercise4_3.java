package standard.of.java.exercise.dayfour;

public class Exercise4_3 {
    //1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오.

    public static void main(String[] args) {
        int result = 0;
        int sum = 0;
        for ( int i=1; i<=10; i++) {

        sum += i;
        result += sum;
        }
            System.out.println(result);


    }
}
