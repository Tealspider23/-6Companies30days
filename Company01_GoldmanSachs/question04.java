package Company01_GoldmanSachs;

public class question04 {
    /*
     Given a string, Your task is to  complete
      the function encode that returns the run length
       encoded string for the given string.
eg if the input string is “wwwwaaadexxxxxx”, then the
 function should return “w4a3d1e1x6″.
You are required to complete the function encode that takes
 only one argument the string which is to be encoded
  and returns the encoded string.
     */

     String encode(String str){
        String res = " ";
        int count = 1;
        for(int i=1;i<str.length();i++){
        if(str.charAt(i)==str.charAt(i-1)){
            count++;
        }
        else{
            res+=str.charAt(i-1);
            res+=count;
        }
    }
    res+=str.charAt(str.length()-1);
    res+=count;
    return res;

     }

     public static void main(String[] args) {
            String str = "wwwwaaadexxxxxx";
            question04 obj = new question04();
            System.out.println(obj.encode(str));
     }
    
}
