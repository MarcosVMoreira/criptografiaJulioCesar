package controller;

public class DecipherController {

    public String decipheText (String text, int caseNumber) {
        String decipheredMessage = new String();
        char decipheredChar, currentChar;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            currentChar = text.charAt(i);
            decipheredChar = '0';

            if (currentChar >= 'a' && currentChar <= 'z') {

                decipheredChar = (char) (currentChar - caseNumber);

                if (decipheredChar < 'a') {
                    decipheredChar = (char) (decipheredChar + 26);
                }

                decipheredMessage = decipheredMessage.concat(Character.toString(decipheredChar));

            } else {
                decipheredMessage = decipheredMessage.concat(Character.toString(currentChar));
            }

        }

        return decipheredMessage;
    }


}
