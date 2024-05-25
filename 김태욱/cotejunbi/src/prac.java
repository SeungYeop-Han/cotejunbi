import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class prac {

    public static void main(String[] args) throws IOException {
//        List<String> list1 = new ArrayList<>();
//
//        list1.add("apple");
//        list1.add("banana");
//        list1.add("poppy");
//
//        int iter = 0;
//        for(String realList : list1){
//            System.out.println(list1.get(iter));
//            iter++;
//        }
//
//        list1.remove(iter - 2);
//
//        System.out.println("remove List index" + list1);
//        System.out.println("size List " + list1.size());
//        System.out.println("indexOf List " + list1.indexOf("poppy"));
//        System.out.println(""+ list1.contains("poppy"));
//
//
//
//        List<Rental> rentals = new ArrayList<>();
//
//        rentals.add(new Rental("rental1", "book1", LocalDate.now().minusDays(3)));
//
//        System.out.println(rentals);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("안녕하세여 적으세요 : ");
        bw.flush(); // 출력
        String s = br.readLine();

        System.out.println(s);




    }
}




