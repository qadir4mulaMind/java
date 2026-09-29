package in.Qadir.Challange;

public class LibraryItem {

    private String itemId;
    private String title;
    private String author;

    public void checkOut()
    {
        System.out.println("checkout.");
    }

    public void returnItem()
    {
        System.out.println("Returning item.");
    }

}