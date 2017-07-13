/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author S525754
 */
@Named(value = "maari")
@Dependent
public class Maari {

    /**
     * Creates a new instance of Maari
     */
    public Maari() {
    }
    public void downloadFile() throws IOException{
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        File file = new File("C:\\Users\\S525754\\Documents\\NetBeansProjects\\HciProject1\\03 - MAARI - Donu Donu Donu [Maango.me].mp3");
        HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();
        response.setHeader("Content-Disposition", "attachment;filename=file.mp3");
        response.setContentLength((int) file.length());
        FileInputStream input = null;
        try {
            int i = 0;
            input = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            while ((i = input.read(buffer)) != -1) {
                response.getOutputStream().write(buffer);
                response.getOutputStream().flush();
            }
            facesContext.responseComplete();
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
    
}
