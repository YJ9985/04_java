package afternoon.nested.local.ex4;

import java.util.Scanner;

public class Library {
    Book[] books;
    int bookCount;
    static final int LIBRARY_SIZE = 4;
    Scanner scanner = new Scanner(System.in);

    public Library() {
        this.books = new Book[LIBRARY_SIZE];
        bookCount = 0;
    }

    //Book 중첩 클래스
    class Book {
        String title;
        String author;


        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

    //새로운 책 추가
    public void addBook() {
        if (bookCount < LIBRARY_SIZE) {
            System.out.println("책 제목을 입력하세요: ");
            String title = scanner.nextLine();

            System.out.println("책 저자를 입력하세요: ");
            String author = scanner.nextLine();

            books[bookCount] = new Book(title, author);
            bookCount++;
            System.out.println("보관된 책의 수는: " + bookCount);
        } else {
            System.out.println("더 이상 책을 보관할 수 없습니다.");
        }
    }

    //전체 책 보기
    public void showBook() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println("책 제목: " + books[i].getTitle());
            System.out.println("책 저자: " + books[i].getAuthor());
            System.out.println("** 총 보관된 책의 수는: " + bookCount + "입니다. ***");
        }
    }

    public void removeBook() {
        if(bookCount == 0){
            System.out.println("보관된 책이 존재하지 않습니다.");
            return;
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.addBook();
        library.showBook();
    }

}