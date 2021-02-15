import java.util.ArrayList;

class Empdata{
    private String name;
    private int[] numbers;
    private ArrayList elist;
    
    Empdata(){
        this.name = "아무개";
        //사용자 정의 타입 ,  Array , ArrayList >> 초기화 >>메모리를 갖는 것 >> new
        this.numbers = new int[10];  
        elist = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int[] getNumbers() {
        return this.numbers;
    }
    
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    
    public ArrayList getElist() {
        return this.elist;
    }
    
    public void setElist(ArrayList elist) {
        this.elist = elist;
    }
    
}

public class Ex04_ArrayList {

    public static void main(String[] args) {
        Empdata empdata = new Empdata();
        System.out.println(empdata.toString());
        System.out.println(empdata.getElist().toString());
        
        ArrayList li = new ArrayList();
        li.add(100);
        li.add(200);
        
        empdata.setElist(li);
        System.out.println(empdata.getElist().toString());
    }

}

