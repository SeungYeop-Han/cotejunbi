class Solution {
    public static int solution(String[] babbling) {
        int iter = 0;
        int sameCnt = 0;
        String [] words = {"aya", "ye", "woo", "ma"}; // 할 수 있는 단어들

        // 일단 검사를 한다. -> 5개 중에 할 수 있는 단어가 있는가
        for(int j = 0; j < babbling.length; j++){
            for(int i = 0; i < words.length; i++){
                if(babbling[j].equals(words[i])){
                    sameCnt++;
                }
            }
        }

        String str = "Sss";



        for(int j = 0; j < babbling.length; j++){
            for(int i = 0; i < words.length; i++) {
                if (babbling[j].contains(words[i])){
                    
                }
            }
        }


        return sameCnt;
    }

    public static void main(String[] args){
        String[] possibleStr = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(possibleStr));
    }


}