package mockito;

import java.util.List;


public class Book {
  
  private String title;
  private String author;
  private String publication;
  private Integer yearOfPublication;
  private Integer numberOfPages;

  public Book(String title,
              String author,
              String publication,
              Integer yearOfPublication,
              Integer numberOfPages){

    
    this.title = title;
    this.author = author;
    this.publication = publication;
    this.yearOfPublication = yearOfPublication;
    this.numberOfPages = numberOfPages;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getPublication() {
    return publication;
  }

  public Integer getYearOfPublication() {
    return yearOfPublication;
  }

  public Integer getNumberOfPages() {
    return numberOfPages;
  }
}
