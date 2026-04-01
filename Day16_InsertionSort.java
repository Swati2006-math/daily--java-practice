public class InsertionSort{
  public static void main(String[]args){
    int[] arr={5,3,2,1,4};
    for(int i=1;i<arr.length;i++){
      int current=arr[i];
      int j=i-1;
      while(j>=0&&arr[j]>current){
        arr[j+1]=arr[j];j--;
      }
      arr[j+1]=current;
    }
    for(int num:arr){
      System.out.println(num="");
    }
  }
}
