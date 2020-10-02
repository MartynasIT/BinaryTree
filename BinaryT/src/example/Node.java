/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author mage3633
 */
public class Node {

    private Object value;   // pagal nutylejima priskiriama reiksme null
    private Node smaller;   // pagal nutylejima priskiriama reiksme null
    private Node larger;    // pagal nutylejima priskiriama reiksme null

    public Node() {
    }
    
  

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


    public Node getSmaller() {
        return smaller;
    }

    public void setSmaller(Node smaller) {
        this.smaller = smaller;
    }

    public Node getLarger() {
        return larger;
    }


    public void setLarger(Node larger) {
        this.larger = larger;
    }

}
