
package pkg20221203_democlientesjaxb;

import Modelo.OperacionesClientes;
import java.util.List;
import jaxb.clientes.Clientes;
import jaxb.clientes.ObjectFactory;

/**
 * Hacemos un bind, de un xsd hacemos y creamos clases
 * Tambien unmarshalizar, creamos objetos a traves del documento
 * y al reves, a traves de los objetos marshalizamos a documento
 * @author Marcos Miranda
 */
public class Main {

    public static void main(String[] args) {
        
        ObjectFactory objectFactory = new ObjectFactory();                  // 1º - instanciamos objeto 
        Clientes clientes = objectFactory.createClientes();                 
        List<Clientes.Cliente> listaClientes = clientes.getCliente();       //creamos lista de clientes
        
        OperacionesClientes siri=new OperacionesClientes();
        
    }
    
}

