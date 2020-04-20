import java.math.BigDecimal;
import java.math.BigInteger;

public class SmallestMultipleWith0and1 {
    static String generatePrintBinary(int n){
        return Integer.toBinaryString(n);
    }
    public static String multiple(int A) {
        BigInteger temp2=BigInteger.valueOf(A);
        int count=1;
        BigInteger temp=new BigInteger((generatePrintBinary(count)));
        BigInteger a=temp.remainder(temp2);
        while(a.compareTo(new BigInteger(String.valueOf('0')))!=0){
            temp=new BigInteger(generatePrintBinary(++count));
            a=temp.remainder(temp2);

        }
        return String.valueOf(temp);
    }
  public static void main(String[] args) {
    System.out.println(
    multiple(10000000));
  }
}
