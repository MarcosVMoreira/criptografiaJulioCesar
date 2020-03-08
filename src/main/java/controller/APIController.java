package controller;

import com.google.gson.Gson;
import kong.unirest.Unirest;
import model.AnswerModel;

import java.io.File;

//trabalha apenas com a API
public class APIController {

    private AnswerModel answerModel;

    public APIController(AnswerModel answerModel) {
        this.answerModel = answerModel;
    }

    public AnswerModel requestAPIData(String token) {

        Gson gson = new Gson();

        String jsonResponse = Unirest.get("https://api.codenation.dev/v1/challenge/dev-ps/generate-data?token=" + token).asString().getBody();

        this.answerModel = gson.fromJson(jsonResponse, AnswerModel.class);

        return this.answerModel;

    }

    public void sendPOSTToAPI(String token) {
        Unirest.post("https://api.codenation.dev/v1/challenge/dev-ps/submit-solution?token="+token)
                .field("answer", new File("answer.json"))
                .asEmpty();
    }


}
