public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Master", "Bulgakov", 500, 12132);
        Book book2 = new Book("Chaika", "Lev", 234, 7464);

        System.out.println("Книга №1" + "\n" +
                "Name - " + book1.getName() + "\n" +
                "Author - " + book1.getAuthor() + "\n" +
                "Count of pages - " + book1.getCountPages() + "\n" + "ISBN - " + book1.getIsbnNumber());

        System.out.println();

        System.out.println("Книга №2" + "\n" + "Name - " + book2.getName() + "\n" +
                "Author - " + book2.getAuthor() + "\n" +
                "Count of pages - " + book2.getCountPages() + "\n" + "ISBN - " + book2.getIsbnNumber());
    }
}