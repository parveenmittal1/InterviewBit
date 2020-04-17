import java.util.ArrayList;
import java.util.List;

public class MaxSumSubArray {
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
