import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



class Stringoholic{
    ////will give the number of operation to get same string again
    private static long reverseNum(String a){
        String temp=a;
        long count=0;
        int i=1;
        String subA=a.substring(0,i);
        String subB=a.substring(i,a.length());
        a=subB+subA;
        i++;
        count++;
        while(!temp.equals(a)){
            count++;
            subA=a.substring(0,i);
            subB=a.substring(i,a.length());
            a=subB+subA;
            i++;
        }
        return  count;
    }
    static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    // method to return LCM of two numbers
    static long lcm(long a, long b)
    {
        return (a*b)/gcd(a, b);
    }

    private static long findLcm(List<Long> temp) {
        long lcm=lcm(temp.get(0),temp.get(1));
        for(int i = 2; i<temp.size(); i++) {
            lcm=lcm(lcm,temp.get(i));
            }
        return lcm;
    }
    public static long  solve(List<String> A) {
        List<Long> temp = new ArrayList();
        for (int i = 0; i < A.size(); i++) {
            temp.add((long) reverseNum(A.get(i)));
            System.out.println(temp.get(i));
        }
        Collections.sort(temp);
        return findLcm(temp);
    }

    public static void main(String[] args) {
    //
      List<String> a=new ArrayList<>();
      a.add("a");
      a.add("abab");
      a.add("abba");
      System.out.println(solve(a));
  }
}