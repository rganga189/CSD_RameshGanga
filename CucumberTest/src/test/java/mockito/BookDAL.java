package mockito;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class BookDAL {

  private static BookDAL bookDAL = new BookDAL();

  public List<Book> getAllBooks(){
      return Collections.EMPTY_LIST;
  }

  public Book getBook(String title){
      return null;
  }

  public String addBook(Book book){
      return book.getTitle();
  }

  public String updateBook(Book book){
      return book.getTitle();
  }

  public static BookDAL getInstance(){
      return bookDAL;
  }
}
