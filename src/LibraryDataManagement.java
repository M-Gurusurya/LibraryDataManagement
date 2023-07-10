class LibraryItem
{
    int id;
    private String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    int year;
    void showLibraryItem()
    {
        System.out.println("Id: "+id+"\nTitle: "+getTitle()+"\nYear: "+year);
    }
}

class Book extends LibraryItem
{
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    void showAuthor()
    {
        System.out.println("Author: "+getAuthor());
    }
}

class Magazine extends LibraryItem
{
    int issue;
    void showIssue()
    {
        System.out.println("Issue: "+issue);
    }
}

public class LibraryDataManagement
{
    public static void main(String[] args)
    {
        Book book = new Book();
        Magazine magazine = new Magazine();
        magazine.id=10;
        magazine.setTitle("Atomic Habits");
        magazine.year=2003;
        magazine.issue=10;
        book.setAuthor("james clear");
        magazine.showLibraryItem();
        book.showAuthor();
        magazine.showIssue();
    }

}
