import com.google.gson.Gson;
import controller.APIController;
import controller.DecipherController;
import kong.unirest.Unirest;
import model.AnswerModel;

public class Main {

    public static void main(String[] args) {

        /*
         {"numero_casas":7,"token":"dd50927d18d9f6511a5a72ce5b850e60c9879a55",
         "cifrado":"aol ilza wlymvythujl ptwyvcltlua pz aol ayhuzpapvu myvt aol uvudvyrpun zahal av aol dvyrpun zahal. qvou vbzalyovba",
         "decifrado":"",
         "resumo_criptografico":""}
         */

        int caseNumber;
        AnswerModel answerModel;
        String encipheredText, deciphered;
        DecipherController decipherController = new DecipherController();

        APIController apiController = new APIController(new AnswerModel());

        answerModel = apiController.requestAPIData("dd50927d18d9f6511a5a72ce5b850e60c9879a55");

        encipheredText = answerModel.getCifrado();

        caseNumber = answerModel.getNumero_casas();

        deciphered = decipherController.decipheText(encipheredText, caseNumber);


        answerModel.setDecifrado(deciphered);



    }


}
