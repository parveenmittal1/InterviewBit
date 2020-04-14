import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



class Stringoholic{
    private static int reverseNum(String a){
        String temp=a;
        int count=0;
        int i=1;
        String subA=a.substring(0,i);
        String subB=a.substring(i,a.length());
        a=subB+subA;
        i++;
        count++;
        while(!temp.equals(a)){
            if(i>a.length()){
                return -1;
            }
            count++;
            subA=a.substring(0,i);
            subB=a.substring(i,a.length());
            a=subB+subA;
            i++;
        }
        return  count;
    }
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a*b)/gcd(a, b);
    }

    private static int findLcm(List<Integer> temp) {
        int lcm=lcm(temp.get(0),temp.get(1));
        for(int i = 2; i<temp.size(); i++) {
            lcm=lcm(lcm,temp.get(i));
            }
        return lcm;
    }

    public static int solve(List<String> A) {
        List<Integer> temp = new ArrayList();
        for (int i = 0; i < A.size(); i++) {
            temp.add(reverseNum(A.get(i)));
            System.out.println(temp.get(i));
        }
        Collections.sort(temp);
        return findLcm(temp);
    }

    public static void main(String[] args) {
    //
      List<String> a=new ArrayList<>();
      a.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
      a.add("babaaaabbaba");
      a.add("baaaaababaabbaaaaabbbbbbbaabbaaaababbabaababaabaaabbbaaaaa");
      a.add("abaabb");
      a.add("aababbbbabbaaaabbaaaaaaaababbbabbbbaabbaabaabbaabaababbbababaababaabbababaaabaaaab");
      a.add("babaaaaababbbbbabbbbabbaaabaaaababbabbaabbbabbaaaabbbabaaaabaaaababb");
      a.add("bbbbbbaaaaaabbbbbbababaabaabbbbbaaabbabbaabbbbaaaaaababbabaaabbabbabbbabbaabbabbbbaabbbaaaaabbabaaab");
      a.add("aabaaabaabbbbababbabbabaaaababbababbbabbbbaabbaaaaababbbbbababbbbaaababababab");
      a.add("aaaababbbaabbbabaabb");
      a.add("ababaaaabbabbbbaaabbababbbabbbabaaa");
      a.add("aaabaabbbabaa");
      a.add("baababbababbbbbabbabaabbabbbbbaaaabaaaababaa");
      a.add("babaa");
      a.add("abbabababbbbbbbbbbbaaaaaababbababaaabbbaaaabbbababbabaabbaabbbbaabbbaabbababababaabaaabbaaabbba");
      a.add("ababbaabbaaabbbabaabababbbabaaabbbaababaaa");
      a.add("abbaaaababbbbaaabaaaabaaaaabaababbabbaababbbabbbbbbbbbabbaabaaabbaaababbbaa");
      a.add("bbabababaabbabbabbbabbaababbabaaabbbababab");
      a.add("abbbaaabaab");
      a.add("bbaaabbaaabbaabbabababa");
      a.add("aabaabaaaaaaabaabbbaaababbbbbbababbaabababbaaaaabbabbbabbbaababbaabababbbbbbbbbaabaab");
      a.add("babbaaabbabbaabaaabbb");
      a.add("bbabaabba");
      a.add("baabaaaaabbaaaaaabbbbaaaabababa");
      a.add("babbaababaaba");
      a.add("baabaabaabbababbaabbabbbbbabaaaabbbbbabbabbbbbabbbabaabbbbabbbbaaabbbbabababaaaababbaaabbabb");
      a.add("abbbbaaaabaabbabbaababaabbababbbaaabbabbbbbaaabbabbaabbb");
      a.add("bababaaaaabababbabbaabababbbaabbaabaabaabbabbbababbaaabababbababbbb");
      a.add("abaaabbbabbbaabba");
      a.add("bbbbaaaabbbababaabbbababaaaababbaaaaaabbbabbaababababbba");
      a.add("bababaabaaaabbaabbababbaabbaabaabbaaaaaaaababbaaaaaabbaaabaabaaababbababbbbaabbabbabaabab");
      a.add("aabbbabaaabababaabbbbaabbabaaabbbaaabbabbbbabaabbbbaabbbaaaaabbbabbbbb");
      a.add("aabbbbbbabaabbbabbaababbababaabaaababbbbabbbaababaaaabbaaabaaabaaaabbbabababbab");
      a.add("abaaaaababbabaabbbaaaaabbaaaabaaaaaaaababbaabbbaabbabbbabbaaaaaab");
      a.add("bbbaabbabbbbbbaaaabbabbbbbbbaaabaababbaaaabbbaababbaaabbbbbbbbabbabababbaaabaabaaabaaaabbbbbabaabaaa");
      System.out.println((a));
  }
}