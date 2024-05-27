
package AParcialFinal;

import java.util.ArrayList;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar
 */
public interface IFabricadeTrajes {
    void añadirComponentesAAlmacen(Componentes componentes) throws IdException;
    void listarComponentes();
    void añadirTrajeAAlmacen(String nombre, ArrayList<Componentes> piezas);
    void listarTrajes();
    void activarDesactivarRebajas();
    void crearEnvio();
    void consultarEnvio();
}
