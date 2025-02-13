// Generated from C:/Users/bguzm/Desktop/UNI/3º/2º cuatri/PL/Entrega Practica Complementaria/Practica Complementaria/src/HinojarGuzman.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HinojarGuzmanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HinojarGuzmanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HinojarGuzmanParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(HinojarGuzmanParser.RContext ctx);
}