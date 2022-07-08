import java.io.* ;
import java.util.* ;
import java.lang.* ;
public class Program{
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = sc.nextLine();
      Set<Character> schar = new HashSet<Character>();
      int i = 0;
      int k=0;
      int maxi=0;
      // String maxiS = "";
      while(k<s.length() && i<s.length()){
        if(schar.contains(s.charAt(k))){
          schar.remove(s.charAt(i));
          i++;
        }else{
          schar.add(s.charAt(k));
          // maxi =  max(maxi, schar.size());
          if(maxi<schar.size()) maxi = schar.size();
          k++;
        }
      }
      System.out.println(s.substring(i,i+maxi));
  }
}
