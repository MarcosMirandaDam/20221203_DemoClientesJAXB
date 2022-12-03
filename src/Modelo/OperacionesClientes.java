
package Modelo;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import jaxb.clientes.Clientes;

/**
 * 
 * @author sssoc
 */
public class OperacionesClientes {
    
   /**
    * Metodo unmarshal (leer) para poder leer el fichero xml y hacer las operaciones pedidas
    * @param ficheroXML
    * @return
    * @throws JAXBException 
    */ 
    public JAXBElement unmarshalizar(File ficheroXML) throws JAXBException{
       //Creamos una instancia de JAXBContext para manipular las clases generadas en jaxb.albaran
       JAXBContext jaxbContext=JAXBContext.newInstance("jaxb.clentes");
       //Objeto Unmarshall para
       Unmarshaller unmarshall=jaxbContext.createUnmarshaller();
       //
       JAXBElement jaxbElement=unmarshall.unmarshal(new StreamSource(ficheroXML), Clientes.class);
        return jaxbElement;
    }
    
    /**
     * metodo marshal (escribir) para aplicar los cambios al documeento XML
     * @param jaxbElement
     * @param ficheroXMLSalida
     * @throws JAXBException 
     */
    public void marshalizar(JAXBElement jaxbElement,File ficheroXMLSalida) throws JAXBException{
        JAXBContext jaxbContext=JAXBContext.newInstance("jaxb.Clientes");
        Marshaller m=jaxbContext.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(jaxbElement, ficheroXMLSalida);
    }
    
}
