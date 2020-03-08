import controller.APIController;
import controller.CryptographyController;
import model.AnswerModel;

import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        /*
         {"numero_casas":7,"token":"dd50927d18d9f6511a5a72ce5b850e60c9879a55",
         "cifrado":"aol ilza wlymvythujl ptwyvcltlua pz aol ayhuzpapvu myvt aol uvudvyrpun zahal av aol dvyrpun zahal. qvou vbzalyovba",
         "decifrado":"",
         "resumo_criptografico":""}
         */

        int caseNumber;
        AnswerModel answerModel;
        String textEncryptedWithCaesarCipher, decrypted, textEncryptedWithSHA1;

        CryptographyController cryptographyController = new CryptographyController();
        APIController apiController = new APIController(new AnswerModel());

        answerModel = apiController.requestAPIData("dd50927d18d9f6511a5a72ce5b850e60c9879a55");

        textEncryptedWithCaesarCipher = answerModel.getCifrado();
        caseNumber = answerModel.getNumero_casas();

        decrypted = cryptographyController.decryptTextFromCaesarCipher(textEncryptedWithCaesarCipher, caseNumber);
        textEncryptedWithSHA1 = cryptographyController.encryptTextToSHA1(decrypted);

        answerModel.setDecifrado(decrypted);
        answerModel.setResumo_criptografico(textEncryptedWithSHA1);





    }


}
