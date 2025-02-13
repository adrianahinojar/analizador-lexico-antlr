grammar HinojarGuzman;

@lexer::members {
    int contadorChar = 0;
    final int LIMITE = 140;

    void imprimirTexto(String texto, boolean esEtiqueta) {
        if (esEtiqueta) {
            System.out.print(texto); // No cuenta etiquetas en el límite y lo imprima directamente
        } else {
            int correcto = LIMITE - contadorChar;
            if (correcto > 0) {
                if (texto.length() <= correcto) {
                    System.out.print(texto);
                    contadorChar += texto.length();
                } else {
                    System.out.print(texto.substring(0, correcto));
                    System.out.print("<SPAN CLASS=\"sobrante\">" + texto.substring(correcto) + "</SPAN>");
                    contadorChar = LIMITE;
                }
            } else {
                System.out.print("<SPAN CLASS=\"sobrante\">" + texto + "</SPAN>");
            }
        }
    }

    void imprimirConEtiqueta(String etiquetaInicio, String texto, String etiquetaFin) {
        imprimirTexto(etiquetaInicio, true);//lo que es span a true
        imprimirTexto(texto, false); //lo que no lo es a false
        imprimirTexto(etiquetaFin, true);
    }
}

r : (HASHTAG | USER | URL | TEXT | WS)* FIN;

HASHTAG : '#' [a-zA-Z0-9]+ { imprimirConEtiqueta("<SPAN CLASS=\"hashtag\">", getText(), "</SPAN>"); };
USER : '@' [a-zA-Z0-9]+ { imprimirConEtiqueta("<SPAN CLASS=\"usr\">", getText(), "</SPAN>"); };
URL : 'http' 's'? '://' ( 'www.' )? [a-zA-Z0-9.-]+ '.' [a-zA-Z0-9./:?&=_%+-]+ { imprimirConEtiqueta("<SPAN CLASS=\"link\">", getText(), "</SPAN>"); };
TEXT : .+? { imprimirTexto(getText(), false); };
WS : [ \n\r\t]+ { imprimirTexto(getText(), false); };

FIN : '#FIN@';