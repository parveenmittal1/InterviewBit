class ReverseTheString{
    private void reverseString(String []array){
        int i=0;
        int j=array.length-1;
        String temp="";
    while (i < j) {
      temp = array[i];
      array[i] = array[j];
      array[j] = temp;
}
    }
    public String solve(String A) {

        String [] array=A.split(" ");
        for(int i=0;i<array.length;i++){
            array[i]=array[i].trim();
        }
        reverseString(array);

        return String.join(" ",array);


    }

    public static void main(String[] args){
      System.out.println(solve("it is fundamental    right"));
    }
}