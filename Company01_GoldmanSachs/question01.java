package Company01_GoldmanSachs;

import java.util.ArrayList;
import java.util.HashMap;



public class question01 {

    /*
     Given an array of strings, return all groups of strings that are anagrams. The groups must be created
      in order of their appearance in the original array.
    */
    
    

    public ArrayList<ArrayList<String>> Anagrams(String[] string_list) {

    //using HashMaps for above question
    HashMap<HashMap<Character,Integer>, ArrayList<String>> bmap = new HashMap<>();
    for(String s:string_list){
        HashMap<Character,Integer> fmap = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            fmap.put(ch,fmap.getOrDefault(ch, 0)+1);
        }

        if(bmap.containsKey(fmap) == false ){
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            bmap.put(fmap,list);
        }
        else{
            ArrayList<String> list = bmap.get(fmap);
            list.add(s);
            bmap.put(fmap,list); 
        }
    }
    ArrayList<ArrayList<String>> res = new ArrayList<>();
    for(ArrayList<String> val : bmap.values()){
        res.add(val);

    }
    return res;
    
    }

    public static void main(String[] args) {
        String[] string_list = {"act","god","cat","dog","tac"};
        question01 obj = new question01();
        ArrayList<ArrayList<String>> res = obj.Anagrams(string_list);
        System.out.println(res); 
    
    }
}
