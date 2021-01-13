import java.text.SimpleDateFormat;
import java.util.*;

public class test {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(4);

        Iterator<Integer> integerIterator=list.iterator();
        while (integerIterator.hasNext()){
            Integer next=integerIterator.next();
            if (next==3){
                integerIterator.remove();
            }
        }
//        for (Integer i:list){
//            System.out.println(i);
//        }
        for (int j=0;j<1000000000;j++){
            int z=0;
            z++;
        }
        Iterator<Integer> integer=list.iterator();
        while (integer.hasNext()){
            System.out.println(integer.next());
        }

        String a="aaaa";
        a="aaabbbb";
        String replace = a.replace('b', 'c');
        System.out.println(replace);
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l+"ms");
        sum(1,2,3,4,6,3,6,3);


        String qqq="aaa";
        jiao(qqq);
        System.out.println(qqq);
        Date data=new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y-M-d  h:m:s");
        String format = simpleDateFormat.format(data);
        System.out.println(format);
        System.out.println("--------------    ");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }

    public static void sum(int... nums){
        int sum=0;
        for (int i =0;i<nums.length;i++){
            sum+=nums[i];
        }
        System.out.println(sum);
    }
    public static void jiao(String a){
        System.out.println(a);
        System.out.println("=====");

        a=new String("bbb");
    }
}
