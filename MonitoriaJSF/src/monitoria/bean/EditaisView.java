package monitoria.bean;

import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import monitoria.model.Edital;
import monitoria.model.Projeto;
import monitoria.model.persistence.DBFacade;

public class EditaisView {
	
	private List<Projeto> projetos;
	private int projeto_cod;
	
	
	public List<Projeto> getProjetos(){
		return projetos;
	}
	
	
	public int getProjeto_cod(){
		return projeto_cod;
	}
	
	
	public void chooseProjetos(Edital edital){
		
		if(projetos != null)
			projetos.clear();
		System.out.println(edital.getCod());
		projetos = DBFacade.getProjetosByEdital(edital);
		//System.out.println(projetos.get(0).getDescricao());
		RequestContext.getCurrentInstance().openDialog("selecione_projeto");

	}
    
    
	public void selectProjetoFromDialog(Projeto projeto) {
		System.out.println(projeto.getDescricao()+"de selectProjetoFromDialog");
        RequestContext.getCurrentInstance().closeDialog(projeto);
    }
    
    
    public void onProjetoChosen(SelectEvent event) {
    	
        Projeto p = (Projeto) event.getObject();
        projeto_cod = p.getCod();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Projeto Selecionado",
        		"Código:" + projeto_cod);
        
        FacesContext.getCurrentInstance().addMessage(null, message);
        
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
