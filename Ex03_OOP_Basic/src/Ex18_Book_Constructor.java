import kr.or.bit.Book;

public class Ex18_Book_Constructor {

    public static void main(String[] args) {
        Book book = new Book("홍길동전", 10000);
        book.bookInfo();
        System.out.println(book.getBname());
        System.out.println(book.getPrice());

    }

}
