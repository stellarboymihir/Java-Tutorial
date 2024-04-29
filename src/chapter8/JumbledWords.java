package chapter8;

public class JumbledWords {
    public static void main(String[] args) {
        addSpaces("HeyWorld!It'sMeMihir");
    }

    /**
     * Adds spaces before each uppercase letter
     * @param text Jumbled text
     */
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++){
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i,  " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
