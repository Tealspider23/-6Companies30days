package Company01_GoldmanSachs;

public class question06 {

    public String gcdofStrings(String str1, String str2){

        if(str1.length()<str2.length()){
            return gcdofStrings(str2, str1);
        }
        if(!str1.startsWith(str2)){
            return "";
        }
        if(str2.isEmpty()){
            return str1;
        }
        return gcdofStrings(str1.substring(str2.length()), str2);
    }
    
}
