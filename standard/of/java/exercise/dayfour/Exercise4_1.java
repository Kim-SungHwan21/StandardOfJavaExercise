package standard.of.java.exercise.dayfour;

public class Exercise4_1 {

    public static void main(String[] args) {
    //1
        int x = 10;
        boolean b= (x > 10 && x < 20) ? true : false;
    //2
        char ch = ' ';
        boolean b2= (ch !=' '  && ch != '\t') ? true : false;
    //3
        char ch2 = 'x';
        boolean b3= (ch2 == 'x' || ch2 == 'X') ? true : false;
    //4
        char ch3 = '9';
        boolean b4= (ch3 <= '9' || ch3 >= '0') ? true : false;
    //5
        char ch4 = 'A';
        boolean b5= ((ch4 >= 'A' && ch4 <= 'Z') || (ch4 >= 'a' && ch4 <= 'z')) ? true : false;
    //6
        int year = 400;
        boolean b6= ((year%400 == 0 || year%4 == 0 ) && year%100 != 0) ? true : false;
    //7
        boolean powerOn = false;
        boolean b7= (powerOn==false) ? true : false;
    //8
        String str = "yes";
        boolean b8= (str.equals("yes")) ? true : false;
    }



//2. char ch true 형 변수 가 공백이나 탭이 아닐 때 인 조건식

//3. char ch ‘x' ’X' true 형 변수 가 또는 일 때 인 조건식

//4. char ch 형 변수 가 숫자(‘0’~‘9’)일 때 인 조건식 true

//5. char ch ( ) true 형 변수 가 영문자 대문자 또는 소문자 일 때 인 조건식

//6. int year 400 4 100 형 변수 가 으로 나눠떨어지거나 또는 로 나눠떨어지고 으로 나눠떨어지지
//않을 때 인 조건식 true

//7. boolean powerOn false true 형 변수 가 일 때 인 조건식

//8. str “yes” true 문자열 참조변수 이 일 때 인 조건식

}
