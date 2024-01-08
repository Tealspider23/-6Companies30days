package Company01_GoldmanSachs;

public class question07 {

  /*
   We have two arrays arr1 and arr2 which are initially empty.
    You need to add positive integers to them such that they satisfy all the following conditions:

arr1 contains uniqueCnt1 distinct positive integers, each of which is not divisible by divisor1.
arr2 contains uniqueCnt2 distinct positive integers, each of which is not divisible by divisor2.
No integer is present in both arr1 and arr2.
Given divisor1, divisor2, uniqueCnt1, and uniqueCnt2, return the minimum possible maximum integer
 that can be present in either array.
   */
  public int minimiseSet(int divisor1 , int divisor2, int UniqueCnt1, int UniqueCnt2){

    int max = Math.max(divisor1, divisor2);
    int min = Math.min(divisor1, divisor2);
    int maxUnique = Math.max(UniqueCnt1, UniqueCnt2);
    int minUnique = Math.min(UniqueCnt1, UniqueCnt2);

    int maxVal = max * maxUnique;
    int minVal = min * minUnique;

    int res = maxVal;
    for(int i = minVal; i <= maxVal; i++){
      if(i % min != 0 && i % max != 0){
        res = Math.min(res, i);
      }
    }
    return res;
  }
  public static void main(String[] args) {
    question07 q = new question07();
    System.out.println(q.minimiseSet(3, 5, 2, 3));
  }
    
}
