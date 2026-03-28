public class Day13_SecondLargest{
  public static void main(String[] args){
    int [] arr={10,25,5,40,15};
    int largest=Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>largest){
        secondLargest=largest;
        largest=(arr[i]>secondLargest&&arr[i] !=laregst){
          secondLargest=arr[i];
        }
      }
      System.out.println("Second largest element:"+secondLargest);
    }
  }
  
