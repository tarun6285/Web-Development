/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demohibernatecomponent;

/**
 *
 * @author admin
 */
public class CEmp {

    private int id;
    private String name;
    private CAddress address;

    public CAddress getAddress() {
        return address;
    }

    public void setAddress(CAddress address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
