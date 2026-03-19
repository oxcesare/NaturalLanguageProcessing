package mx.edu.prounidad2.nlp.service.impl;

import edu.stanford.nlp.pipeline.*;
import mx.edu.prounidad2.nlp.service.AnalizadorTexto;

import java.util.*;
import java.util.stream.Collectors;

public class StanfordNLPService implements AnalizadorTexto {
    private StanfordCoreNLP pipeline;

    public StanfordNLPService() {
        // Configuramos el motor para que solo haga tokenización (rápido)
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit");
        this.pipeline = new StanfordCoreNLP(props);
    }

    @Override
    public List<String> extraerTokens(String texto) {
        CoreDocument doc = new CoreDocument(texto);
        pipeline.annotate(doc);
        // Convertimos los CoreLabel a una lista de Strings simple
        return doc.tokens().stream()
                .map(t -> t.word())
                .collect(Collectors.toList());
    }

    @Override
    public String obtenerNombreMotor() {
        return "Stanford CoreNLP Engine";
    }
}