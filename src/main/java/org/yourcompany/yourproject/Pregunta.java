package org.yourcompany.yourproject;
public class Pregunta {

    private String enunciat;
    private String[] respostes;
    private int correcta;


    public Pregunta(String enunciat, String[] respostes, int correcta) {
        this.enunciat = enunciat;
        this.respostes = respostes;
        this.correcta = correcta;
    }


    public String getEnunciat() {
        return enunciat;
    }


    public String[] getRespostes() {
        return respostes;
    }


    public int getCorrecta() {
        return correcta;
    }


    public void setEnunciat(String enunciat) {
        this.enunciat = enunciat;
    }


    public void setRespostes(String[] respostes) {
        this.respostes = respostes;
    }


    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }
}
