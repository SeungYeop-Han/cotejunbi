import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {


    public static void main(String[] args) throws IOException {
        /**
         * 추가 조건 1
         * 도서관에서는 각 사용자가 한 번에 대여할 수 있는 도서의 수를 최대 3권으로 제한합니다.
         * 이 제한을 고려하여 대여 기능을 수정하세요.
         * */

        List<User> users = crateTestUserData();// User Test Data Create !!

        for(User realUser : users){
            System.out.println(realUser);
        }

        System.out.println("users index 0 : " + users.get(0));

        if(canUserBookRentals(users.get(0))){
            rentBook(users.get(0));

        } else {
            System.out.println("No!!!");
            System.out.println("Your Rental Books Num : " + users.get(0).getRentals().size());
        }


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

class User {
    private String id;
    private String name;
    private String email;
    private List<Rental> rentals = new ArrayList<>();

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }



    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    @Override
    public String toString() {
        return "User{id='" + id + "', name='" + name + "', email='" + email + "', rentals=" + rentals + '}';
    }
}

class Rental {
    private String id;
    private String bookId;
    private LocalDate rentalDate;

    public Rental(String id, String bookId, LocalDate rentalDate) {
        this.id = id;
        this.bookId = bookId;
        this.rentalDate = rentalDate;
    }

    public String getId() {
        return id;
    }

    public String getBookId() {
        return bookId;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    @Override
    public String toString() {
        return "Rental{id='" + id + "', bookId='" + bookId + "', rentalDate=" + rentalDate + '}';
    }
}


