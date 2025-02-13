// Generated from C:/Users/bguzm/Desktop/UNI/3º/2º cuatri/PL/Entrega Practica Complementaria/Practica Complementaria/src/HinojarGuzman.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link HinojarGuzmanVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class HinojarGuzmanBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements HinojarGuzmanVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitR(HinojarGuzmanParser.RContext ctx) { return visitChildren(ctx); }
}