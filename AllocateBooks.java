import java.util.ArrayList;
import java.util.List;

public class AllocateBooks {
        private static int helper(ArrayList<Integer> A, int B, int min, int mid, int max){
            int temp=0;
            int numberOfStudent=B;
            int maxPage=0;
            int i=0;
            if(min==max){
                return min;
            }
            for(i=0;i<A.size()&&numberOfStudent>0;i++){
                temp+=A.get(i);
                if(temp>mid){
                    temp-=A.get(i);
                    i--;
                    numberOfStudent--;
                    if(maxPage<temp){
                        maxPage=temp;
                    }
                    temp=0;
                }
                if(maxPage<temp)
                maxPage=temp;
            }
            if(temp>0)
            numberOfStudent--;

            if(numberOfStudent>0){
                max=mid;
                if((min+mid)%2==0)
                    mid=(min+mid)/2;
                else{
                    mid=(min+mid+1)/2;
                }
                return helper(A,B,min,mid,max);
            }

            if(i<A.size()){
                min =mid;
                if((mid+max)%2==0)
                    mid=(mid+max)/2;
                else{
                    mid=(mid+max+1)/2;
                }
                return helper(A,B,min,mid,max);
            }

            if(mid>maxPage){
                max=mid;
                if((mid+min)%2==0)
                    mid=(mid+min)/2;
                else{
                    mid=(mid+min+1)/2;
                }
                return helper(A,B,min,mid,max);
            }

            if(mid<maxPage){
                min=mid;
                if((mid+max)%2==0)
                    mid=(mid+max)/2;
                else{
                    mid=(mid+max+1)/2;
                }
                return helper(A,B,min,mid,max);
            }

            if(mid==maxPage){
                return mid;
            }
            return mid;
        }

        public static int books(ArrayList<Integer> A, int B) {
            int temp=B;
            int max=-1;
            int sum=0;

            for(int i=0;i<A.size();i++){
                sum=sum+A.get(i);
                if(max<A.get(i)){
                    max=A.get(i);
                }
            }
            int mid;
            if((sum+max)%2==0)
            mid=(sum+max)/2;
            else{
                mid=(sum+max+1)/2;
            }
            if(B==1){
                return sum;
            }
            return helper(A,B,max,mid,sum);
        }

  public static void main(String[] args) {
    //
      ArrayList<Integer> book=new ArrayList(){{
          add(97);
          add(26);
          add(12);
          add(67);
          add(10);
          add(33);
          add(20);
          add(79);
          add(49);
          add(79);
          add(21);
          add(67);
          add(72);
          add(93);
          add(36);
          add(85);
          add(45);
          add(28);
          add(91);
          add(94);
          add(57);
          add(1);
          add(53);
          add(8);
          add(44);
          add(68);
          add(90);
          add(24);
           /*A : [ 97, 26, 12, 67, 10, 33, 79, 49, 79, 21, 67, 72, 93, 36, 85, 45, 28, 91, 94, 57, 1, 53, 8, 44, 68, 90, 24 ]
B : 26
*/
          }};
    System.out.println(books(book,26));
  }
        }
