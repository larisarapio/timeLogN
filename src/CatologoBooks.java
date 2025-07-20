import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}


public class CatologoBooks {

    public static void main(String[] args) {
        List<Book> catologiesBooks = new ArrayList<>();
        catologiesBooks.add(new Book("Nação Dopamina", "Ueslei"));
        catologiesBooks.add(new Book("Biblioteca da meia noite", "Alguém"));
        catologiesBooks.add(new Book("O sol é para todos", "????"));

        for (Book book : catologiesBooks) {
            System.out.println("Autor: " + book.author + " Livro: " + book.title);
        }


    }
}
