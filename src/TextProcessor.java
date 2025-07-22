public class TextProcessor {

    public static int countWords(String sentence) {

        if (sentence == null)
            return  0;

        String[] words = sentence.trim().split(" ");
        return words.length;

    }

    public static String replaceWord(String text, String oldWord, String newWord){
        return text.replace(oldWord,newWord);

    }

    public static void main(String[] args) {
        String input = "Java is fun and Java is powerful";

        int count = countWords(input);

        System.out.println("wordCount: "+count);

        String upd = replaceWord(input,"Java","Programming");
        System.out.println("After replacing: "+ upd);

    }
}