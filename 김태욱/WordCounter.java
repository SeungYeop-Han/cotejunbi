import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    /*
     * 1단계: 주어진 문자열에서 각 단어의 빈도를 계산하는 프로그램을 작성하세요.
     * 2단계: 문자열에서 대소문자를 구분하지 않고 단어의 빈도를 계산하도록 프로그램을 수정하세요.
     * 3단계: 입력 문자열에 구두점이 포함될 수 있으므로, 이를 처리하여 단어의 빈도를 계산하세요.
     */

    public static void main(String[] args) {
        String text = "world world world hello";
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split(" "); // " " 기준으로 단어들을 끊어낸다.
        
        for (String word : words) { // 끝날 때 까지 반복 - EOF End Of Final

            // getOrDefault : 키가 존재할 경우 그 키에 매핑된 값을 반환한다.
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); 

            // wordCount.put - Map에 넣는 과정이다. 
            // 그래서, wordCount.getOrDefault를 통해서 값이 있는 지 없는 지 검사하는 것. 
            // 있으면, 키에 매핑된 값을 반환, 없으면 defalutValue를 반환
            // hashMap 자료구조가 key와 Value로 이루어 졌기 때문에
        }
        
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(wordCount.entrySet());
            System.out.println(entry.getKey() + ": " + entry.getValue()); 
        }
    }
}
