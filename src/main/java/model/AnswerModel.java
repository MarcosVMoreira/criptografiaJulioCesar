package model;

public class AnswerModel {

    private int numero_casas;
    private String token;
    private String cifrado;
    private String decifrado;
    private String resumo_criptografico;

    public int getNumero_casas () {
        return numero_casas;
    }

    public String getCifrado () {
        return cifrado;
    }

    public void setResumo_criptografico (String resumo_criptografico) {
        this.resumo_criptografico = resumo_criptografico;
    }

    public void setDecifrado (String decifrado) {
        this.decifrado = decifrado;
    }

}
