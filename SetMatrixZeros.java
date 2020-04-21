import java.util.ArrayList;

public class SetMatrixZeros {

    public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(0).size();j++){
                if(a.get(i).get(j)==0){
                    a.get(i).set(0,0);
                    a.get(0).set(j,0);
                };
        System.out.print(" "+a.get(i).get(j));
            }
      System.out.println();
        }

        for(int i=1;i<a.size();i++){
            if(a.get(i).get(0)==0){
                for(int j=0;j<a.get(i).size();j++){
                    a.get(i).set(j,0);
                }
            }
            }


            for(int j=1;j<a.get(0).size();j++){
                if(a.get(0).get(j)==0){
                    for(int k=0;k<a.size();k++){
                        a.get(k).set(j,0);
                    }
                }
                }

            if(a.get(0).get(0)==0){
                for(int i=0;i<a.size();i++){
                    a.get(i).set(0,0);
                }

                for(int k=0;k<a.get(0).size();k++){
                    a.get(0).set(k,0);
                }
            }
            }

  public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> temp=new ArrayList(3);
            for (int i = 0; i < 2; i++) {
                temp.add(new ArrayList<>());
                for (int j = 0; j < 3; j++) {
                    temp.get(i).add(1);
                }
            }

        temp.get(1).set(2,0);
        setZeroes(temp);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(temp.get(i).get(j));
          }
        }
    }
  }
