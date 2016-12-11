package mockito;


import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;


public class BookDALTest {

  private static BookDAL mockedBookDAL;
  private static Book book1;
  private static Book book2;
  private static Book book3;
  private static Book book4;

  @BeforeClass
  public static void setUp(){
    mockedBookDAL = mock(BookDAL.class);
    book1 = new Book("Three Mistakes in my life",
            "Chetan Bhagat",
            "Sidney", 2008,1009);

    book2 = new Book("How to Love",
            "Ravindra Singh",
            "Amazon", 2010,950);
    
    book3 = new Book("Tulasidalam",
            "Yandamuri",
            "VCC", 2001,65);
    
    book4 = new Book("Yerrasita",
            "Gollapudi",
            "AMC", 2003,93);

    when(mockedBookDAL.getAllBooks()).thenReturn(Arrays.asList(book1, book2));
    when(mockedBookDAL.getBook("Three Mistakes in my life")).thenReturn(book1);
    when(mockedBookDAL.getBook("How to Love")).thenReturn(book2);
    when(mockedBookDAL.addBook(book1)).thenReturn(book1.getTitle());

    when(mockedBookDAL.updateBook(book1)).thenReturn(book1.getTitle());
    when(mockedBookDAL.updateBook(book4)).thenReturn(book4.getTitle());
    when(mockedBookDAL.addBook(book3)).thenReturn(book3.getTitle());

  }

  @Test
  public void testGetAllBooks() throws Exception {

    List<Book> allBooks = mockedBookDAL.getAllBooks();
    assertEquals(2, allBooks.size());
    Book myBook = allBooks.get(0);
    assertEquals("Three Mistakes in my life", myBook.getTitle());
    assertEquals((Integer)2008, myBook.getYearOfPublication());
    assertEquals((Integer) 1009, myBook.getNumberOfPages());
    assertEquals("Sidney", myBook.getPublication());
  }

  @Test
  public void testGetBook(){

    String title = "Three Mistakes in my life";
    Book myBook = mockedBookDAL.getBook(title);    
    assertNotNull(myBook);
    assertEquals("Three Mistakes in my life", myBook.getTitle());
    assertEquals((Integer)2008, myBook.getYearOfPublication());
    assertEquals((Integer)1009, myBook.getNumberOfPages());
    
    String title1 = "How to Love";
    Book myBook1 = mockedBookDAL.getBook(title1);
    assertNotNull(myBook1);
    assertEquals("How to Love", myBook1.getTitle());
    assertEquals((Integer)2010, myBook1.getYearOfPublication());
    assertEquals((Integer)950, myBook1.getNumberOfPages());

  }

  @Test
  public void testAddBook(){
	
    String title2 = mockedBookDAL.addBook(book3);
    assertNotNull(title2);
    assertEquals(book3.getTitle(), title2);
  }

  @Test
  public void testUpdateBook(){

    String title = mockedBookDAL.updateBook(book1);
    assertNotNull(title);
    assertEquals(book1.getTitle(), title);
    
    String title1 = mockedBookDAL.updateBook(book4);
    assertNotNull(title1);
    assertEquals(book4.getTitle(), title1);
  }
}
