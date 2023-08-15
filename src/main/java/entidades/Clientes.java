
package entidades;

/**
 
 * @author Julian Development
 */
public class Clientes {
    private String name;
    private int age;
    private String address;
    private String city;

    public Clientes() {
    }

    public Clientes(String name, int age, String address, String city) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Clientes{" + "name=" + name + ", age=" + age + ", address=" + address + ", city=" + city + '}';
    }

    
    
    

}
