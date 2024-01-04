package Company01_GoldmanSachs;

public class question03 {

    /*
     Given an array of positive 
     numbers, the task is to find the number of
    possible contiguous subarrays having product
     less than a given number k
     */

     public long countSubArrayProductlessthank(long a[],int n, int k){
     long t = 0;
     long prod = 1;
     int left = 0;

     for(int right = 0; right<n ; right++){
        prod*=a[right];
        while(prod>=k){
            prod/=a[left];
            left++;
        }
        t+=right-left+1;
     }
     return t;
     }

     public static void main(String[] args) {
            long a[] = {1,2,3,4};
            int n = a.length;
            int k = 10;
            question03 obj = new question03();
            System.out.println(obj.countSubArrayProductlessthank(a, n, k));
     }
    
}
