package Study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Stu_String {

    public static void main(String[] args) {
        String str = " test Str";
        String str2 = "test Str ";
        String str3 = "TEST STRING API DOCUMENTS";

        char [] strArray = {'j', 'a', 'v', 'a'};
        char [] strArray2 = {'j', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};


        System.out.println("str.charAt(1) = " + str.charAt(1)); // str
        System.out.println("str.contains(\"str\") = " + str.contains("str")); // boolean
        System.out.println("str.toString() = " + str.toString());
        System.out.println("str.length() = " + str.length());
        System.out.println("str.equalsIgnoreCase(\"test str\") = " + str.equalsIgnoreCase("test str"));
        System.out.println("str.equals(\"test str\") = " + str.equals("test str"));
        System.out.println("str.compareTo(\"aest str\") = " + str.compareTo("aest str"));
        System.out.println("str.compareToIgnoreCase(\"test STR\") = " + str.compareToIgnoreCase("test STR"));
        System.out.println("str.toLowerCase(Locale.ROOT) = " + str.toLowerCase());
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str.concat(\"123\") = " + str.concat("123"));
        System.out.println("str.repeat(2) = " + str.repeat(2));
        System.out.println("str.intern() = " + str.intern());
        System.out.println("str.codePointAt(1) = " + str.codePointAt(1));

        System.out.println("str.copyValueOf() = " + String.copyValueOf(strArray));

        try{
            System.out.println("str.copyValueOf() = " + String.copyValueOf(strArray2, 4,7));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Caught Error : " + e);
        }

        System.out.println("str.strip() = " + str.strip());
        System.out.println("str.strip().equals(str2) = " + str.strip().equals(str2));

        // 완전 대박비교
        if(str.stripLeading().equalsIgnoreCase(str2.stripTrailing())){
            System.out.println("두 문자열은 서로 같습니다.");
        } else {
            System.out.println("같지 않습니다.");
            System.out.println("str = " + str);
            System.out.println("str2 = " + str2);
        }

        System.out.println("str3 = " + str3.toLowerCase());
        System.out.println("str3 = " + str3.toUpperCase());
        System.out.println("str3.valueOf(false) = " + str3.valueOf(false));

        // 특정 조건을 만족하는 문자열 반환
        // 문제: 문자열 배열이 주어졌을 때,
        // 각 문자열의 길이가 3 이상인 문자열만을 추출하여 공백으로 구분된 하나의 문자열로 결합하여 반환하는 함수를 작성하세요.

        String[] arr = {"apple", "hi", "banana", "ok", "cherry"};
        System.out.println("arr = " + filterlenString(arr));




    }

    public static String filterlenString(String[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        List<String> realArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() == 3){
                realArr.add(arr[i]);
            }
        }

        if(realArr.isEmpty()){
            return "3글자 이상의 단어가 없습니다.";
        }

        return realArr.toString();
    }
}
