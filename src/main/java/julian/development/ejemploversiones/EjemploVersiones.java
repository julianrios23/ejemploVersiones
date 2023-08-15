package julian.development.ejemploversiones;

import entidades.Clientes;

/**
 *
 * @author Julian Development
 */
public class EjemploVersiones {

    public static void main(String[] args) {

        Clientes c1 = new Clientes("Juan Perez", 40, "Av San Martin 1514", "San Luis");

        System.out.println("El cliente "+c1.getName()+" de "+c1.getAge()+" años, tiene domicilio en: "+c1.getAddress()
        +" de "+c1.getCity());
    }
}
