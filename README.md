# Natural Language Processing with Java

Repositorio académico orientado al estudio de bibliotecas de **Procesamiento de Lenguaje Natural (NLP)** en Java, con énfasis en la aplicación de principios de **Programación Orientada a Objetos (POO)**.

## Objetivo general

Este proyecto tiene como finalidad analizar y comparar bibliotecas de NLP en el ecosistema Java, así como evidenciar una implementación modular basada en POO que facilite la incorporación de nuevos motores de análisis de texto.

## Objetivos específicos

- Examinar el comportamiento de distintas bibliotecas de NLP a partir de una tarea común de tokenización.
- Aplicar principios de diseño orientado a objetos en una arquitectura simple y extensible.
- Establecer una base de trabajo reutilizable para prácticas y ejercicios posteriores de la asignatura.

## Fundamentos de POO implementados

- **Abstracción:** la interfaz `AnalizadorTexto` define el contrato funcional común.
- **Polimorfismo:** `Main` opera sobre una colección de tipo `AnalizadorTexto`, independientemente de la implementación concreta.
- **Encapsulamiento:** cada servicio implementa internamente su estrategia de tokenización.
- **Extensibilidad:** la arquitectura permite agregar nuevas implementaciones sin modificar el contrato principal.

## Estructura del proyecto

- `src/main/java/mx/edu/prounidad2/nlp/Main.java`: clase principal para la ejecución y comparación de motores.
- `src/main/java/mx/edu/prounidad2/nlp/service/AnalizadorTexto.java`: interfaz base del analizador.
- `src/main/java/mx/edu/prounidad2/nlp/service/impl/StanfordNLPService.java`: implementación con Stanford CoreNLP.
- `src/main/java/mx/edu/prounidad2/nlp/service/impl/DL4JService.java`: implementación con DeepLearning4J.

## Dependencias principales (Maven)

- Apache OpenNLP (`org.apache.opennlp:opennlp-tools`)
- Stanford CoreNLP (`edu.stanford.nlp:stanford-corenlp` y modelos)
- LangChain4j Hugging Face (`dev.langchain4j:langchain4j-hugging-face`)
- DeepLearning4J (`org.deeplearning4j:deeplearning4j-core`, `org.deeplearning4j:deeplearning4j-nlp`)

## Requisitos

- Java 17
- Maven 3.8 o superior

## Ejecución

1. Compilar el proyecto:

```bash
mvn compile
```

2. Ejecutar la clase principal:

```bash
mvn exec:java -Dexec.mainClass="mx.edu.prounidad2.nlp.Main"
```

> En caso de no contar con `exec-maven-plugin` configurado, la clase `Main.java` puede ejecutarse directamente desde el IDE.

## Resultado esperado

La salida en consola presenta, para cada motor, su nombre y la lista de tokens generada a partir del texto de prueba. Este resultado facilita una comparación preliminar del comportamiento de cada biblioteca.

## Extensión del proyecto

Para incorporar un nuevo motor NLP:

1. Crear una clase en `service/impl` que implemente `AnalizadorTexto`.
2. Implementar los métodos `extraerTokens(String texto)` y `obtenerNombreMotor()`.
3. Registrar la nueva implementación en la lista de motores de `Main`.

## Alcance académico

El repositorio tiene un propósito formativo. Su enfoque principal es el análisis de diseño orientado a objetos aplicado a bibliotecas reales de NLP en Java, por encima de criterios de optimización para entornos de producción.

