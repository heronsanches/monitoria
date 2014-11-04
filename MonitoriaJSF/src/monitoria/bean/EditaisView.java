package monitoria.bean;

import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import monitoria.model.Edital;
import monitoria.model.Inscricao;
import monitoria.model.Projeto;
import monitoria.model.persistence.DBFacade;

public class EditaisView {
	
	private List<Projeto> projetos;
	private int projeto_cod;
	private Inscricao i;
	
	
	public List<Projeto> getProjetos(){
		return projetos;
	}
	
	
	public int getProjeto_cod(){
		return projeto_cod;
	}
	
	
	public Inscricao getInscricao(){
		return i;
	}
	
	
	public void chooseProjetos(Edital edital){
		
		if(projetos != null)
			projetos.clear();

		projetos = DBFacade.getProjetosByEdital(edital);
		RequestContext.getCurrentInstance().openDialog("selecione_projeto");

	}
    
    
	public void selectProjetoFromDialog(Projeto projeto) {
        RequestContext.getCurrentInstance().closeDialog(projeto);
    }
    
    
    public void onProjetoChosen(SelectEvent event) {
    	
        Projeto p = (Projeto) event.getObject();
        projeto_cod = p.getCod();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Projeto selecionado com sucesso!",
        		"Código Projeto:" + projeto_cod
        		+"\nCódigo Edital:" +p.getEdital_cod());
        
        FacesContext.getCurrentInstance().addMessage(null, message);
        
    }
    
    
    public void realizarInscricao(){
    	    	
		Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext()
    			.getRequestParameterMap();
		
    	if( (i = DBFacade.realizarInscricao(params.get("user"), projeto_cod)) != null){
    		
    		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Inscrição", ""
    				+ "Inscrição realizada com sucesso.");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
                		
    	}else{
    		
    		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Inscrição",
    				"Inscrição não realizada.");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
                		
    	}
    	
    }
	
	
	public List<Edital> getEditais(){
		return DBFacade.getOpenedEditais();
	}
	
	
    public void getInformacoes() {
    	
    	Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext()
    			.getRequestParameterMap(); 
    	
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Informações",
        		params.get("informacoes_adicionais"));
        
        RequestContext.getCurrentInstance().showMessageInDialog(message);
        
    }

}
