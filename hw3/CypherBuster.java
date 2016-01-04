import java.util.Arrays;
import java.util.Hashtable;

public class CypherBuster {
    public static final int NUMOFLETTERSINALPHABET = 26;

    public static void main(String[] args) {
        String cypherText = "UIQLDEVORHIWLTQTOKMQMWROUOQQMQLKIQWQVIEWRDQTLEQMWRWXFTWHTOADMRDQIOKWXMAOHMRMRHQVOQWLTAOMRQODPMDQWMRDQTLEQOEWAFLQITBVOQQWKWUIQLDEWREIRQTOQITOQVITWRIJFUOMRMRHQWVLAORSIMRHDBVOQBIBORQOEWAFLQITQWKW";
        String alphabetLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Hashtable<Character,CypherNode> letterFrequencies = getFrequencies(cypherText, alphabetLetters);

        Hashtable<String,Integer> bifidCounts = new Hashtable<String,Integer>();

        for (int i = 0;i < NUMOFLETTERSINALPHABET;i++ ) {
            int appearances = letterFrequencies.get(alphabetLetters.charAt(i)).returnAppearances();
            float percentageOfCypher = letterFrequencies.get(alphabetLetters.charAt(i)).returnPercentage();
            //add backslash and percent sign to format for latex
            System.out.println("" + alphabetLetters.charAt(i) + ": " + appearances + ", " + percentageOfCypher + "\\%\\newline");
        }
        System.out.println(cypherText + "\n");
        cypherText = replaceLetters(cypherText, 'Q', 't');
        cypherText = replaceLetters(cypherText, 'U', 'l');
        cypherText = replaceLetters(cypherText, 'I', 'e');
        cypherText = replaceLetters(cypherText, 'L', 'u');
        cypherText = replaceLetters(cypherText, 'D', 's');  
        cypherText = replaceLetters(cypherText, 'R', 'n'); 
        cypherText = replaceLetters(cypherText, 'X', 'f');
        cypherText = replaceLetters(cypherText, 'E', 'c');
        cypherText = replaceLetters(cypherText, 'V', 'h');
        cypherText = replaceLetters(cypherText, 'O', 'a');
        cypherText = replaceLetters(cypherText, 'H', 'g');
        cypherText = replaceLetters(cypherText, 'W', 'o');
        cypherText = replaceLetters(cypherText, 'T', 'r');
        cypherText = replaceLetters(cypherText, 'K', 'd');
        cypherText = replaceLetters(cypherText, 'M', 'i');
        cypherText = replaceLetters(cypherText, 'F', 'p');
        cypherText = replaceLetters(cypherText, 'A', 'm');
        cypherText = replaceLetters(cypherText, 'P', 'k');
        cypherText = replaceLetters(cypherText, 'B', 'w');
        cypherText = replaceLetters(cypherText, 'J', 'x');
        cypherText = replaceLetters(cypherText, 'S', 'b');
        }

    public static Hashtable<Character,CypherNode> getFrequencies(String cypherText, String alphabetLetters) {
        int lengthOfCypher = cypherText.length();
        
        Hashtable<Character,CypherNode> frequencies = new Hashtable<Character,CypherNode>();
        
        for (int i = 0; i < NUMOFLETTERSINALPHABET; i++) {
            int total = 0;
            char currentLetter = alphabetLetters.charAt(i);
            for (int j = 0; j < lengthOfCypher ;j++ ) {
                if (cypherText.charAt(j) == currentLetter) {
                    total += 1;
                }

                frequencies.put(currentLetter, new CypherNode(total));
                frequencies.get(currentLetter).updatePercentage((float)total / lengthOfCypher * 100);
            }
        }

        return frequencies;
    }

    public static String replaceLetters(String cypherText, char oldLetter, char newLetter) {
        String newString = "";

        for (int i = 0; i < cypherText.length(); i++) {
            if (cypherText.charAt(i) == oldLetter) {
                newString += newLetter;
            } else {
                newString += cypherText.charAt(i);
            }
        }

        System.out.println(newString + "\n");
        return newString;
    }
/**
    public static HashTable<String, Integer> getBigramFrequencies(String cypherText) {
        HashTable<String, Integer> frequencies = new HashTable<String, Integer>();
        for (int i = 0;i <  ; ) {
            
        }
    }
*/
}