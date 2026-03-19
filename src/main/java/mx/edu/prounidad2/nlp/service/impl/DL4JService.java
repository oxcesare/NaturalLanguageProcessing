package mx.edu.prounidad2.nlp.service.impl;

import mx.edu.prounidad2.nlp.service.AnalizadorTexto;
import org.deeplearning4j.text.tokenization.tokenizerfactory.DefaultTokenizerFactory;
import org.deeplearning4j.text.tokenization.tokenizer.Tokenizer;
import java.util.ArrayList;
import java.util.List;

public class DL4JService implements AnalizadorTexto {

    @Override
    public List<String> extraerTokens(String texto) {

        DefaultTokenizerFactory t = new DefaultTokenizerFactory();
        Tokenizer tokenizer = t.create(texto);
        List<String> tokens = new ArrayList<>();

        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }
        return tokens;
    }

    @Override
    public String obtenerNombreMotor() {
        return "Eclipse DL4J Engine";
    }
}