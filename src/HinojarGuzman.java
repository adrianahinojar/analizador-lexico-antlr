import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


import java.io.*;

public class HinojarGuzman {
    public static void main(String[] args) {
        try{
            // Crear el archivo HTML de salida
            File outputFile = new File("salida.html");

            // Crear un PrintStream para redirigir la salida estándar al archivo
            PrintStream ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(outputFile)));

            // Redirigir System.out al archivo
            System.setOut(ps);

            // Comienza a escribir el HTML
            System.out.println("<!DOCTYPE html>");
            System.out.println("<html>");
            System.out.println("<head>");
            System.out.println("<title>Twitter format</title>");
            System.out.println("<style>");
            System.out.println(".usr {color:rgb(19,189,72);}");
            System.out.println(".link {color:rgb(55,40,244);}");
            System.out.println(".hashtag {color:rgb(107,103,189);}");
            System.out.println(".auth-title {color:rgb(0,0,0);font-weight:bold;}");
            System.out.println(".auth-usr {color:rgb(147,145,147);}");
            System.out.println(".sobrante {color:rgb(255,0,0);}");//para colocar en rojo el resto del texto que sobrepase el limite de 140 caracteres
            System.out.println("</style>");
            System.out.println("</head>");
            System.out.println("<body>");
            System.out.println("<p>");

            // Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream input = CharStreams.fromFileName(args[0]);
            // Crear el objeto correspondiente al analizador léxico con el fichero de entrada
            HinojarGuzmanLexer analex = new HinojarGuzmanLexer(input);
            // Identificar al analizador léxico como fuente de tokens para el sintáctico
            CommonTokenStream tokens = new CommonTokenStream(analex);
            // Crear el objeto correspondiente al analizador sintáctico
            HinojarGuzmanParser anasint = new HinojarGuzmanParser(tokens);

            // Comienza el análisis llamando al axioma de la gramática
            anasint.r();  // Esto ejecutará la gramática y generará el HTML

            // Cerrar las etiquetas HTML
            System.out.println("</p>");
            System.out.println("</body>");
            System.out.println("</html>");

            // Cerrar el PrintStream
            ps.close();


        } catch (org.antlr.v4.runtime.RecognitionException e) {
            //Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
            //Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
            //Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}
