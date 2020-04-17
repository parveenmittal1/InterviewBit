import java.util.ArrayList;
import java.util.List;

public class MaxSumSubArray {
//    public static int maxSubArray(final List<Integer> A) {
//        if(A.size()==0){
//            return 0;
//        }
//        if(A.size()==1){
//            return A.get(0);
//        }
//
//        int maxSum=A.get(0);
//        ArrayList<Long> sum=new ArrayList<>();
//
//        for(int i=0;i<A.size();i++){
//            long tempSum=0;
//      if (A.get(i) > 0) {
//        while (A.get(i) > 0) {
//          tempSum = tempSum + A.get(i);
//          i++;
//        }
//      } else {
//        while (A.get(i) < 0) {
//          tempSum = tempSum + A.get(i);
//          i++;
//        }
//        }
//      sum.add(tempSum);
//        }
//
//        long max =0;
//        int start=0;
//        int next=1;
//        long temp=0;
//        if(sum.get(start)>0)
//        temp=sum.get(start);
//        else {
//            start++;
//            next++;
//            temp=sum.get(start);
//        }
//        while(next<sum.size()-1){
//            if(sum.get(next)+sum.get(next+1)>0){
//                temp=temp+sum.get(next)+sum.get(next+1);
//                next=next+2;
//            }
//            else if(sum.get(next)>0) {
//                temp=temp+sum.get(next);
//            }
//            if(max<temp){
//                max=temp;
//            }
//
//
//
//        }
//    }
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public static int  maxSubArray(final List<Integer> A) {
            if(A.size()==0){
                return 0;
            }
            if(A.size()==1){
                return A.get(0);
            }
            int temp=0;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<A.size();i++){
                if(max<A.get(i)){
                    max=A.get(i);
                }
                if(temp+A.get(i)>0){

                    temp=temp+A.get(i);
                    if(max<temp){
                        max=temp;
                    }
                }
                else{
                    temp=0;
                }

            }
            return max;
        }

  public static void main(String[] args) {
            List a=new ArrayList<Integer>(){{
                add(-2);
                add(1);
                add(-3);
                add(4);
                add(-1);
                add(2);
                add(1);
                add(-5);
                add(4);
            }};
    System.out.println(maxSubArray(a));

    //
  }
    }
