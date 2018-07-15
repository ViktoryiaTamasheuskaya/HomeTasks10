public class Library {
    public static void main (String[] args) {

        Actions books = new Actions();

        Books book1 = new Books ("To Kill a Mockingbird", "Harper Lee", 1960, 251.2);
        books.add(book1);
        Books book2 = new Books ("It Came From a Black Hole, and Landed in Antarctica", "Dennis Overbye", 2018, 103.12);
        books.add(book2);
        Books book3 = new Books ("JAVA Basic", "John Doe", 2013, 126.5);
        books.add(book3);



        System.out.println("Search by Author name ( = Harper Lee)");
        books.findByAuthor("Harper Lee");
        System.out.println(" ");
        books.printTable1("Harper Lee");
        System.out.println(" ");

        System.out.println("Search by Title ( = It Came From a Black Hole, and Landed in Antarctica)");
        books.findByTitle("It Came From a Black Hole, and Landed in Antarctica");
        System.out.println(" ");
        books.printTable2("It Came From a Black Hole, and Landed in Antarctica");
        System.out.println(" ");

        System.out.println ("Search by Year ( = 2013)");
        books.findByYear (2013);
        System.out.println(" ");
        books.printTable3 (2013);
        System.out.println(" ");

        books.delete(book2);
        System.out.println ("Results are:");
        books.printTable4();

    }}
