/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author S525796
 */
@Entity
@Table(name = "CUSTOMER_HCI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerHci.findAll", query = "SELECT c FROM CustomerHci c"),
    @NamedQuery(name = "CustomerHci.findByCustomerId", query = "SELECT c FROM CustomerHci c WHERE c.customerId = :customerId"),
    @NamedQuery(name = "CustomerHci.findByPassword", query = "SELECT c FROM CustomerHci c WHERE c.password = :password"),
    @NamedQuery(name = "CustomerHci.findByLogin", query = "SELECT c FROM CustomerHci c WHERE c.customerId = :customerId AND c.password = :password")})

public class CustomerHci implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CUSTOMER_ID")
    private String customerId;
    @Size(max = 50)
    @Column(name = "PASSWORD")
    private String password;

    public CustomerHci() {
    }

    public CustomerHci(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerHci)) {
            return false;
        }
        CustomerHci other = (CustomerHci) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sample.CustomerHci[ customerId=" + customerId + " ]";
    }
    
}
