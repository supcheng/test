import java.util.HashMap;
import java.util.Map;

public class test1 {
    public static void main(String[] args) {
        String a="hello word ee aa g bb cc hello bb dd a";
        String[] words=a.split(" ");
        Map<String,Integer> result=new HashMap<>(10);
        for (String word:words){
            if(result.containsKey(word)){
                result.put(word,result.get(word)+1);
            }else {
                result.put(word,1);
            }
        }
        for(Map.Entry entry:result.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
