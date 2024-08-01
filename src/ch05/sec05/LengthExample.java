package ch05.sec05;

public class LengthExample {
    public static void main(String[] args){
        String ssn = "9402191230123";
        int length = ssn.length();

        if(length == 13){
            System.out.println("주민등록번호 자릿수 맞음");
        } else {
            System.out.println("주민등록번호 자릿수 틀림");
        }
    }
}
