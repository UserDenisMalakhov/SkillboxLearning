public class Book {
    private final String name;
    private final String author;
    private final int countPages;
    private final int isbnNumber;


    public Book(String name, String author, int countPages, int isbnNumber){
        this.name = name;
        this.author = author;
        this.countPages = countPages;
        this.isbnNumber = isbnNumber;
    }


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCountPages() {
        return countPages;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

}
