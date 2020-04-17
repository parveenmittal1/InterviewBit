import java.util.ArrayList;

public class SetMatrixZeros {

    public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
        ArrayList<ArrayList<Boolean>> b=new ArrayList<>();

        for(int i=0;i<a.size();i++){
            b.add(new ArrayList<>());
            for(int j=0;j<a.get(0).size();j++){
                b.get(i).add(a.get(i).get(j)==0);
            }
        }

        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(0).size();j++){
                if(b.get(i).get(j)){
                    for(int k=0;k<a.get(i).size();k++){
                        a.get(i).set(k,0);
                    }
                    for(int k=0;k<a.size();k++){
                        a.get(k).set(j,0);
                    }
                }
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
