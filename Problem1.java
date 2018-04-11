public class Problem1{
  public static void main(String[] args){
    int[] a = { 9, 20, 28, 18, 11};
    int[] b = { 30, 1, 21, 17, 28};
    soultion(5,a,b);
  }
  
  static void soultion(int n, int[] arr1, int[] arr2){
    String[] answer = new String[n];
    String[] arrS1 = new String[n];
    String[] arrS2 = new String[n];
    
    for(int i = 0; i < n ; i++){
      arrS1[i] = Integer.toBinaryString(arr1[i]);
      arrS2[i] = Integer.toBinaryString(arr2[i]);
      while (arrS1[i].length() < n){
        arrS1[i] = "0" + arrS1[i];
      }
      while(arrS2[i].length() < n){
        arrS2[i] = "0" + arrS2[i];
      }
    }
    
    for(int i = 0; i<n; i++){
      answer[i] = "";
      for(int j; j<n;j++){
        if(arrS1[i].split("")[j].equals("1") || arrS2[i].split("")[j].equals("1")){
          answer[i] = answer[i] + "#";
        } else {
          answer[i] = answer[i] + " ";
        }  
      }  
    }
    
  }
}
