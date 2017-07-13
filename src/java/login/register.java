/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

/**
 *
 * @author S525796
 */
@Named(value = "register")
@SessionScoped
public class register implements Serializable {
@PersistenceUnit(unitName = "HCIFinalPU")
    private EntityManagerFactory emf = null;
    private String username;

    private String password;
    private String fname;
    private String lname;
    private String email;
    private String mobileno;

    private String msg;

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

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Creates a new instance of register
     */
    public register() {
    }

    public void register() throws ClassNotFoundException, SQLException {
//        JDBC DERBY CONNECTION
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url="jdbc:derby://localhost:1527/sample;create=true;user=app;password=app";
        Connection con=DriverManager.getConnection(url);
        PreparedStatement ps=con.prepareStatement("Insert into CUSTOMER_HCI values('"+lname+fname+"','"+password+"','"+fname+"','"+lname+"','"+email+"','"+mobileno+"')");
        int a=ps.executeUpdate();
        if(a==1){
        msg = "succesfull";
        }else{
        msg = "failed";
        }
        
//        EntityManager em = emf.createEntityManager();
//       int x = em.executeUpdate("Insert into CUSTOMER_HCI values('"+lname+fname+"','"+password+"','"+fname+"','"+lname+"','"+email+"','"+mobileno+"')");
//        //queryForLogin.setParameter("customerId", username);
//            
//       if(x>0){
//           msg = "succesfull";
//       }
//       else{
//           msg = "fail";
//       }

    }
}
