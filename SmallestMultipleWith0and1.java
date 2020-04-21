
import java.math.BigInteger;

public class SmallestMultipleWith0and1 {

    public static String generatePrintBinary(long n){
        return Integer.toBinaryString((int)n);
    }
    static long numberZeroOne(int num){
        String temp="";
        int numTemp=num;
        while(numTemp>10){
            numTemp=numTemp/10;
            temp='0'+temp;
        }
        temp='1'+temp;
        return Integer.parseInt(temp,2);
    }

    public static String multiple(int A) {
        long temp2 = (long)A;
        long count = numberZeroOne(A);
        long temp = Long.parseLong((generatePrintBinary(count)));
        while (temp%temp2!=0) {
            temp = Long.parseLong(generatePrintBinary(++count));
        }
        return String.valueOf(temp);
    }
    public static void main(String[] args) {
        long max=-1;
        for(int i=1;i<2000;i++){
            String temp=multiple(i);

            System.out.println(
                    i+" : "+generatePrintBinary(i)+" :"+multiple(i));
        }
    }
}