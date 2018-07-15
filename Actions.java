import java.util.ArrayList;
import java.util.List;


public class Actions {

    private Books book;
    private List <Books> books = new ArrayList<Books>();

    public List<Books> getBooks() {
        return books;
    }

    public void add(Books book) {
        books.add(book);
    }

      public boolean delete(Books book){
        return books.remove(book);
        }

    public void findByAuthor(String author) {
        for(Books book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }
    }

    public void findByTitle(String title) {
        for(Books book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book);
            }
        }
    }

    public void findByYear(int year) {
        for(Books book : books) {
            if (book.getYear()== year) {
                System.out.println(book);
            }
        }
    }



    public void printTable1(String author) {
        for(Books book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("|           Title           |     Author     |   Year  |  Price     |");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("|   " + book.getTitle() +"   |   " + book.getAuthor() + "   |   " + book.getYear()+"   |   $" + book.getPrice()+"   |");
                System.out.println("-----------------------------------------------------------------");
            }
        }
    }


    public void printTable2(String title) {
        for(Books book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("|           Title                                         |     Author         |   Year  |  Price       |");
                System.out.println("-----------------------------------------------------------------------------------------------------------");
                System.out.println("|   " + book.getTitle() +"   |   " + book.getAuthor() + "   |   " + book.getYear()+"   |   $" + book.getPrice()+"   |");
                System.out.println("-----------------------------------------------------------------------------------------------------------");
            }
        }
    }

    public void printTable3(int year){
        for(Books book: books){
            if(book.getYear()==year){
                System.out.println("|       Title    |     Author   |   Year  |  Price    |");
                System.out.println("--------------------------------------------------------");
                System.out.println("|   " + book.getTitle() +"   |   " + book.getAuthor() + "   |   " + book.getYear()+"   |   $" + book.getPrice()+"   |");
                System.out.println("--------------------------------------------------------");
            }
        }
    }

    public void printTable4(){
        for(Books book: books){

                System.out.println("|       Title    |     Author   |   Year  |  Price    |");
                System.out.println("--------------------------------------------------------");
                System.out.println("|   " + book.getTitle() +"   |   " + book.getAuthor() + "   |   " + book.getYear()+"   |   $" + book.getPrice()+"   |");
                System.out.println("--------------------------------------------------------");
            }
        }






}
