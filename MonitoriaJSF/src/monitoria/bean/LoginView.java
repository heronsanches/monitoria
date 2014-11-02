package monitoria.bean;
 

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import monitoria.model.Usuario;
import monitoria.model.persistence.DBFacade;
 

public class LoginView {
     
    private String user;
    private String password;
 
    public String getUser() {
        return user;
    }
 
    public void setUser(String user) {
        this.user = user;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String login() {

    	Usuario u = new Usuario();
    	u.setCpf(user);
    	u.setSenha(password);
    	
    	if(DBFacade.getOneuUsuario(u) != null)
    		return "home?faces-redirect=true";
    	else{
    		
    		logout();
    		FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("usuario e/ou senha não reconhecidos"));
    		return "#";
    		
    	}
    }
    
    
    public String logout(){
    	FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    	return "login?faces-redirect=true";
    }
}