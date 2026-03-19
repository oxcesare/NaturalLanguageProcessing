package mx.edu.prounidad2.nlp.service;

import java.util.List;

public interface AnalizadorTexto {

    // Método abstracto que todas las librerías deben implementar
    List<String> extraerTokens(String texto);

    String obtenerNombreMotor();
}
