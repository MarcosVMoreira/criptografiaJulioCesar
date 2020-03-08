package model;

public class AnswerModel {

    private int numero_casas;
    private String token;
    private String cifrado;
    private String decifrado;

    public int getNumero_casas() {
        return numero_casas;
    }

    public void setNumero_casas(int numero_casas) {
        this.numero_casas = numero_casas;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCifrado() {
        return cifrado;
    }

    public void setCifrado(String cifrado) {
        this.cifrado = cifrado;
    }

    public String getDecifrado() {
        return decifrado;
    }

    public void setDecifrado(String decifrado) {
        this.decifrado = decifrado;
    }
}
