import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

class Book {
    private String id;
    private String title;
    private String author;
    private int publicationYear;

    // Constructor, getters, and setters


}

class User {
    private String id;
    private String name;
    private String email;
    private List<Rental> rentals;

    // Constructor, getters, and setters
    public User (String id, String name, String email, List<Rental> rentals){
        this.id = id;
        this.name = name;
        this.email = email;
        this.rentals = rentals;
    }


    public void rentBook(Book book) {
        // Implement rent logic considering the 3-book limit - 제한을 두어라 3권으로
        
    }

    public void returnBook(Book book) {
        // Implement return logic
    }

    // public List<Book> getOverdueBooks() {
    //     // Implement logic to get overdue books

    // }
}

class Rental {
    private String rentalId;
    private String userId;
    private String bookId;
    private LocalDate rentalDate;

    // Constructor, getters, and setters

    // public long getOverdueDays() {
    //     // Calculate and return overdue days
    // }

    // public long calculateFine() {
    //     // Calculate and return fine based on overdue days
    // }
}

public class LibrarySystem {
    private List<Book> books;
    private List<User> users;

    public void addBook(Book book) {
        // Implement logic to add a book
    }

    public void addUser(User user) {
        // Implement logic to add a user
    }

    public void rentBook(String userId, String bookId) {
        // Implement logic for renting a book
    }

    public void returnBook(String userId, String bookId) {
        // Implement logic for returning a book
    }

    public static void main(String[] args) {
        // Sample implementation
    }

    private static List<User> crateTestUserData() {

        List<User> users = new ArrayList<>();

        User user1 = new User("user1", "kim", "sada@naver.com");

        User user2 = new User("user2", "sim", "koko@naver.com");

        users.add(user1);
        users.add(user2);

        return users;
    }

    private static void rentBook(User user) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String s;
        int possiblerentbooks = 0;
        if(user.getRentals().size() < MAX_RENTAL_BOOKS){
            possiblerentbooks = MAX_RENTAL_BOOKS - user.getRentals().size();

            bw.write("당신이 책을 대출 할 수 있는 권 수는 " + possiblerentbooks + "권 입니다.");
            bw.newLine();
            bw.write("몇 권을 대출 하시겠습니까? : ");
            bw.flush();

            s = br.readLine();

            System.out.println(Integer.parseInt(s));




        } else {

        }
    }

    public static final int MAX_RENTAL_BOOKS = 3;

    public static boolean canUserBookRentals(User user){
        // 책을 빌릴 수 있는 상태인가?
        return user.getRentals().size() < MAX_RENTAL_BOOKS;
    }
}
