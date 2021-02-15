import java.util.ArrayList;

class Product {
    int price;
    int bonuspoint;

    // Product() { }
    Product(int price) {
        this.price = price;
        this.bonuspoint = (int) (this.price / 10.0);
    }
}

class KtTv extends Product {
    KtTv() {
        super(500);
    }
    // KtTv(int price){ super(price);}

    @Override
    public String toString() {
        return "KtTv";
    }
}

class Audio extends Product {
    Audio() {
        super(100);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

class NoteBook extends Product {
    NoteBook() {
        super(150);
    }

    @Override
    public String toString() {
        return "NoteBook";
    }
}

public class Ex07_Generic_Quiz {

            public static void main(String[] args) {
                //1. Array  배열을 사용해서  cart 만들고 제품을 담으세요 (tv , audio , notebook)
                //정적배열
                //객체 생성
                Product[] cart = new Product[3];  //갯수가 제한적
                //담기
                cart[0] = new KtTv();
                cart[1] = new Audio();
                cart[2] = new NoteBook();
                
                //2. ArrayList   를 사용해서  cart  만들고 제품을 담으세요
                //동적배열
                ArrayList<Product> cart2 = new ArrayList<Product>();
                cart2.add(new KtTv());
                cart2.add(new KtTv());
                cart2.add(new KtTv());
                cart2.add(new KtTv());
                cart2.add(new KtTv());
                cart2.add(new NoteBook());
                
                for(Product product : cart2) {
                    System.out.println(product);
            }

        }

}

