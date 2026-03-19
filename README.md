# Natural Language Processing with Java

Proyecto académico para explorar librerías de **Procesamiento de Lenguaje Natural (NLP)** en Java y, al mismo tiempo, practicar conceptos clave de **Programación Orientada a Objetos (POO)**.

## Objetivo del proyecto

- Revisar y comparar librerías NLP en Java.
- Entender cómo aplicar POO con una arquitectura extensible.
- Implementar una base simple para agregar nuevos motores de análisis de texto.

## Conceptos de POO aplicados

- **Abstracción**: `AnalizadorTexto` define el contrato común.
- **Polimorfismo**: `Main` usa una lista de `AnalizadorTexto` para ejecutar motores distintos con el mismo flujo.
- **Encapsulamiento**: cada implementación resuelve su lógica interna de tokenización.
- **Extensibilidad**: se pueden agregar nuevas implementaciones sin modificar el contrato.

## Estructura principal

- `src/main/java/mx/edu/prounidad2/nlp/Main.java`: punto de entrada y ejecución de motores.
- `src/main/java/mx/edu/prounidad2/nlp/service/AnalizadorTexto.java`: interfaz del analizador.
- `src/main/java/mx/edu/prounidad2/nlp/service/impl/StanfordNLPService.java`: implementación con Stanford CoreNLP.
- `src/main/java/mx/edu/prounidad2/nlp/service/impl/DL4JService.java`: implementación con DeepLearning4J.

## Librerías incluidas (Maven)

- Apache OpenNLP (`org.apache.opennlp:opennlp-tools`)
- Stanford CoreNLP (`edu.stanford.nlp:stanford-corenlp` + modelos)
- LangChain4j Hugging Face (`dev.langchain4j:langchain4j-hugging-face`)
- DeepLearning4J (`org.deeplearning4j:deeplearning4j-core`, `deeplearning4j-nlp`)

## Requisitos

- Java 17
- Maven 3.8+

## Ejecución rápida

1. Compilar:

```bash
mvn compile
```

2. Ejecutar la clase principal:

```bash
mvn exec:java -Dexec.mainClass="mx.edu.prounidad2.nlp.Main"
```

> Si no tienes configurado el plugin `exec-maven-plugin`, también puedes ejecutar desde tu IDE (`Main.java`).

## Resultado esperado

Al ejecutar, se imprime el nombre del motor y los tokens obtenidos para un texto de prueba. Esto permite comparar rápidamente el comportamiento de cada librería.

## Cómo agregar un nuevo motor NLP

1. Crear una clase en `service/impl` que implemente `AnalizadorTexto`.
2. Implementar `extraerTokens(String texto)` y `obtenerNombreMotor()`.
3. Registrar la nueva implementación en la lista de motores de `Main`.

## Propósito académico

Este repositorio está orientado al aprendizaje: más que optimizar producción, busca comprender el diseño orientado a objetos aplicado a herramientas NLP reales en Java.

