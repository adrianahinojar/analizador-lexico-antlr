# Twitter Text Formatter con ANTLR

Este proyecto utiliza **ANTLR** para analizar y dar formato a textos similares a los de Twitter. El código implementa un **analizador léxico y sintáctico** en Java que reconoce menciones, hashtags y enlaces, resaltándolos en un documento **HTML de salida**.

## 🛠 Características

-  **Lexer y Parser con ANTLR** para procesar texto.
-  **Colorea menciones (@usuario), hashtags (#tema) y URLs** en el HTML generado.
-  **Límite de 140 caracteres**, resaltando el texto sobrante en rojo.
-  **Salida automática en formato HTML** con etiquetas `<SPAN>` para cada elemento.

##  Uso

1. Compila el código fuente.
2. Ejecuta el programa pasándole un archivo de texto como entrada.
3. Revisa el archivo `salida.html` generado.

##  Archivos principales

-  `HinojarGuzman.g4` → Definición de la gramática en ANTLR.
-  `HinojarGuzman.java` → Lógica principal en Java para el procesamiento y generación de HTML.

---

 *Ideal para procesar y visualizar textos al estilo Twitter con resaltado automático.* 

