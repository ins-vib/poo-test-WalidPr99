package org.yourcompany.yourproject;
import java.util.ArrayList;

public class Test {
    
    ArrayList<Pregunta> preguntes = new ArrayList<>();

    int respostes [];

    int numPregunta = 0;

    public Test(ArrayList<Pregunta> preguntes) {

        this.preguntes = preguntes;
        this.respostes = new int[preguntes.size()];

        for (int i = 0; i < this.respostes.length; i++) {
            this.respostes[i] = -1;
        }

    } 
    
    public String getEnunciatPreguntaActual(){

        String preg = preguntes.get(numPregunta).getEnunciat();

        return preg;
    }

    public String[] getRespostesPreguntaActual(){

        String[] res = preguntes.get(numPregunta).getRespostes();

        return res; 
    }

    public int getNumeroPregunta(){

        return numPregunta;
    }

    public void respondre(int resposta){

        this.respostes[this.numPregunta] = resposta;
       
    }

    public boolean anarEndavant(){

        if(numPregunta >= preguntes.size()-1) return false;
        numPregunta = numPregunta + 1;

        return true;
    }

    public boolean anarEndarrera(){

        if(numPregunta <= preguntes.size()) return false;
        numPregunta = numPregunta - 1;

        return true;
    }

    public double solucionarTest(){

        double notaFinal = 0.0;
        double valorCorrecta = 10.0 / preguntes.size(); 

        for (int i = 0; i < preguntes.size(); i++) {

            int usu = respostes[i]; 
            int corr = preguntes.get(i).getCorrecta();
            int ops = preguntes.get(i).getRespostes().length;
            
            double valorIncorrecta = valorCorrecta / ops;

            if (usu != -1) { 
                if (usu == corr) {

                    notaFinal = notaFinal + valorCorrecta;

                } else {

                    notaFinal = notaFinal - valorIncorrecta;

                }
            }
        }
        
        if (notaFinal < 0) {

            notaFinal = 0.0;

        }
        
        return notaFinal;

    }

}
