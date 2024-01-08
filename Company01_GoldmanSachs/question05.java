package Company01_GoldmanSachs;

public class question05 {
    /*
     An ugly number is a positive integer whose prime 
     factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.
     */

     int isUgly(int n){

        if (n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(n>1){
            if(n/2==0){
                return isUgly(n);
            }
            if(n/3==0){
                return isUgly(n);
            }
            if(n/5==0){
                return isUgly(n);
            }
        }
        return 0;
     }


        public static void main(String[] args) {
            int n = 6;
            question05 obj = new question05();
            System.out.println(obj.isUgly(n)==1);
        }
    
}
