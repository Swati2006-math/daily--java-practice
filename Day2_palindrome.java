public class Day2_palindrome{
  public static void main(String []args)
  {
    int num=121,reversed=0,reminder;
    int original = num;
    while(num!=0){
      reminder=num%10;
      reversed=reversed*10+reminder;
      num=num/10;
    }
    if(original==reversed)
      System.out.println("palindrome number");
    else
      System.out.println("Not palindrome");
  }
  {
