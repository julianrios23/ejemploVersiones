
package entidades;

/**
 
 * @author Julian Development
 */
public class Clientes {
    private String name;
    private int age;
    private String address;
    private String country;

    public Clientes() {
    }

    public Clientes(String name, int age, String address, String country) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Clientes{" + "name=" + name + ", age=" + age + ", address=" + address + ", country=" + country + '}';
    }
    
    
    

}
