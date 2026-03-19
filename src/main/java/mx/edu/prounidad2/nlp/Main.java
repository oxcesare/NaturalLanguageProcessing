package mx.edu.prounidad2.nlp;

import mx.edu.prounidad2.nlp.service.AnalizadorTexto;
import mx.edu.prounidad2.nlp.service.impl.DL4JService;
import mx.edu.prounidad2.nlp.service.impl.StanfordNLPService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista polimórfica: Guardamos diferentes motores bajo la misma interface
        List<AnalizadorTexto> motores = new ArrayList<>();
        motores.add(new StanfordNLPService());
        motores.add(new DL4JService());



        String textoPrueba = "La inteligencia artificial transformará la ingeniería.";

        for (AnalizadorTexto motor : motores) {
            System.out.println("Ejecutando: " + motor.obtenerNombreMotor());
            System.out.println("Tokens: " + motor.extraerTokens(textoPrueba));
        }
    }
}