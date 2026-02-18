package org.yourcompany.yourproject;
import java.util.ArrayList;

public class Test {
    
    ArrayList<Pregunta> preguntes = new ArrayList<>();
    
    int respostes [];

    int numPregunta = 0;

    public Test(ArrayList<Pregunta> preguntes) {

        this.preguntes = preguntes;

    } 
    
    public String getEnunciatPreguntaActual(){

        String preg = preguntes.get(numPregunta).getEnunciat();

        return preg;
    }

    public String[] getRespostesPreguntaActual(){

        String[] res = new String[3];

        return res; 
    }

    public int getNumeroPregunta(){

        return numPregunta;
    }

    public void respondre(int resposta){
       
    }

    public boolean anarEndavant(){

        return true;
    }

    public boolean anarEndarrera(){
        
        return true;
    }

    public double solucionarTest(){

        return 0.0;
    }

}
