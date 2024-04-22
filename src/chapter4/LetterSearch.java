package chapter4;

import java.util.Scanner;

/*
* LOOP BREAK
* Search a String to determine if it contains the letter 'A'
* */
public class LetterSearch {
    public static void main(String[] args) {

//        Get text
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String text = sc.nextLine();
        sc.close();
        boolean letterFound = false;

//        Search for letter A
        for (int i = 0; i < text.length(); i++){
            char currentLetter = text.charAt(i);

            if (currentLetter == 'A' || currentLetter == 'a' ){
                letterFound = true;
                break;
            }
        }

        if (letterFound){
            System.out.println("This text contains the letter 'A' ");
        }else {
            System.out.println("This text does not contains the letter A");
        }
    }
}

// for int(i = 0; !letterFound && i < text.length(); i++){
// char currLetter = text.charAt(i);
// if(currLetter == 'A' || currLetter == 'a'){
// letterFound = true;
// }
// }