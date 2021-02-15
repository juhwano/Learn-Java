import java.util.ArrayList;
import java.util.List;
import kr.or.bit.MyStack;

public class List_Practice {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Kim");
        list.add("kang");
        list.add("kim");
        
        System.out.println(list.size());
        
        for(int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----");
    }

}
