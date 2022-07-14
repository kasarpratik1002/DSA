import java.util.*;
class LeetcodeFirstUniqueChar {
    public int firstUniqChar(String s) {
        
        
        char arr[]=s.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){

               if(!map.containsKey(arr[i])){
                    map.put(arr[i],1);
               } else{
                   map.put(arr[i],map.get(arr[i])+1);
               }            
        }
        char op=' ';
        for(Map.Entry<Character,Integer> mapentry:map.entrySet()){

            if(mapentry.getValue()==1){
                     op=mapentry.getKey(); 
                     break;
            }
        }
        
        int ind=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==op){
                ind=i;
            }
        }
        return ind;
    }
    public static void main(String[] args) {
    	LeetcodeFirstUniqueChar c=new LeetcodeFirstUniqueChar();
    	System.out.println(c.firstUniqChar("leetcode"));
	}
}