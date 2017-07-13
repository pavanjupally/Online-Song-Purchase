package login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

/**
 *
 * @author S525796
 */
@Named(value = "loginbean")
@SessionScoped
public class loginbean implements Serializable {

    @PersistenceUnit(unitName = "HCIFinalPU")
    private EntityManagerFactory emf = null;

    /**
     * Creates a new instance of loginbean
     */
    public loginbean() {
    }
    private String username;
    private String password;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String validatelogin() {
        EntityManager em = emf.createEntityManager();
        Query queryForLogin = em.createNamedQuery("CustomerHci.findByCustomerId");
        queryForLogin.setParameter("customerId", username);

        List<CustomerHci> loginlist = queryForLogin.getResultList();

        for (CustomerHci login : loginlist) {
            if (login.getCustomerId().equalsIgnoreCase(username) && login.getPassword().equalsIgnoreCase(password) && login != null) {
                msg = "login successfull";
                return "Payment";
            } else {
                msg = "Invalid Credentials";
                return "LogIn";
            }
        }
        msg = "Invalid Credentials";
        return "LogIn";
    }
}
