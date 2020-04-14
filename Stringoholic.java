import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



class Stringoholic{
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
      System.out.println(solve(a));
  }
}