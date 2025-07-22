public class Book{
    protected String title;
    protected String author;
    protected int pages;
    protected boolean isAvailable;

    public Book(String title, String author, int pages){
        this.title = title;
        this.author=author;
        this.pages=pages;
        isAvailable=true;


    }

    public void borrowBook(){
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + isAvailable);
    }
    public String getTitle() { return title; }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}


public class Textbook extends Book {
    private String subject;
    private int edition;

    public Textbook(String title, String author, int pages, String subject, int edition){
        super(title,author,pages);
        this.subject=subject;
        this.edition=edition;

    }




    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Subject   : " + subject);
        System.out.println("Edition   : " + edition);
    }

    public int getEdition() {
        return edition;
    }

    public String getSubject() {
        return subject;
    }
}

public class Library {
    public static void main(String[] args){
        Book book1 = new Book("python", "salim", 234);
        Book book2 = new Book("java", "ahmed", 569);


        Textbook textbook1 = new Textbook("Java Programming", "yousuf", 650, "Computer Science", 1);


        System.out.println("\n--- Book 1 ---");
        book1.displayInfo();

        System.out.println("\n--- Book 2 ---");
        book2.displayInfo();

        System.out.println("\n--- Textbook ---");
        textbook1.displayInfo();


        System.out.println("\nBorrowing Books:");
        book1.borrowBook();
        book1.borrowBook();

        System.out.println("\nReturning Books:");
        book1.returnBook();

        System.out.println("\nAfter Return:");
        book1.displayInfo();

    }
}
