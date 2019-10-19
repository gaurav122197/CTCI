import java.util.*;
class allUnique
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    isDifferentTwo(s);
  }
  static void isDifferentOne(String str)
  {
    HashMap<String,Integer> hm=new HashMap<String,Integer>();
    String s[]=str.split("");
    for(String st:s)
    {
      if(hm.containsKey(st))
      {
        System.out.println("Duplicate");
        System.exit(0);
      }
      else
      hm.put(st,1);
    }
    System.out.println("All Unique");
  }
  static void isDifferentTwo(String str)
  {
    char ch[]=str.toCharArray();
    Arrays.sort(ch);
    int i;
    for(i=1;i<ch.length;i++)
    {
      if(ch[i-1]==ch[i])
      {
        System.out.println("Not unique");
        break;
      }
    }
    if(i==ch.length)
    System.out.println("Unique");
  }
}
