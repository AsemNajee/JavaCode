  /**
  *   >> Github : AsemNajee .~
  *   << BY : Asem Al-Mekhlafi >>
  */

package asemlibrary;

/**
 * @author Asem Al-Mekhlafi
 */
public class Text {
    
    /**
     * get first word from text , 
     * first word is starts at the beginning of the text,
     * and end by space .
     * 
     * @param text the text that will get word from .
     * @return first word if {@code text} contains space ,
     *         {@code text} if there is no space in {@code text} .
     *         {@code text} if text is empty or null.
     */
    public static String firstWord(String text){
        if(text == null || text.length() == 0)
            return text;
        text = text.trim();
        int index = text.indexOf(' ');
        if(index == -1){
            return text;
        }else{
            return text.substring(0, index);
        }
    }
    
    /**
     * get last word from text , 
     * last word is start from last space in text,
     * and end by {@code text} end .
     * 
     * @param text the text that will get word from .
     * @return last word if {@code text} contains space ,
     *         {@code text} if there is no space in {@code text} .
     *         {@code text} if text is empty or null.
     */
    public static String lastWord(String text){
        if(text == null || text.length() == 0)
            return text;
        text = text.trim();
        int index = text.lastIndexOf(' ');
        if(index == -1){
            return text;
        }else{
            return text.substring(index , text.length()).trim();
        }
    }

    /**
     * count words in text .
     * @param text the text which will be count .
     * @return count words as int .
     *         {@code 0} if text is empty or null.
     */
    public static int countWords(String text){
        if(text == null || text.length() == 0)
            return 0;
        text = text.trim();
        return text.split(" +").length;
    }
    
    /**
     * get all words in the text as array of String.
     * @param text the text that will be split to array.
     * @return array of String that is words.
     *         {@code null} if text is empty. 
     */
    public static String[] getWords(String text){
        if(text == null || text.length() == 0)
            return null;
        text = text.trim();
        return text.split(" +");
    }
    
    /**
     * get word in the position {@param position}, its split words from spaces.
     * @param text text to get the word from it. 
     * @param position the position of word.
     * @return {@code null} if position less than 0 or greeter than words lenght.
     *         the word in position {@code index} .
     */
    public static String getWord(String text, int position){
        if(position < 0)
            return null;
        String[] words = getWords(text);
        if(words == null)
            return null;
        if(position >= words.length)
            return null;
        return words[position];
    }
    
    /**
     * this method will change all first letters of the words to upper case.
     * as "<em>asem</em> -> <b>Asem</b>", "<em>asem abdullah naji</em> -> <b>Asem Abdullah Naji</b>" .
     * @param name the name or text which will change.
     * @return name but with upper case in first letter of all words.
     */
    public static String asName(String name){
        if(name == null || name.length() == 0)
            return name;
        String[] word = name.split(" +");
        for (int i = 0; i < word.length; i++) {
            word[i] = word[i].substring(0,1).toUpperCase() + word[i].substring(1);
        }
        name = "";
        for(String temp: word){
            name += " ".concat(temp);
        }
        return name.trim();
    }
    
}
