package monitoria.model.persistence;

import java.util.Date;
import java.util.List;

import monitoria.model.Edital;
import monitoria.model.Inscricao;
import monitoria.model.Projeto;
import monitoria.model.Usuario;

public class DBFacade {

	private static  AlunoDAO alunoDAO = new AlunoDAO();
	private static  BolsaDAO bolsaDAO = new BolsaDAO();
	private static  BolsistaDAO bolsistaDAO = new BolsistaDAO();
	private static  DepartamentoDAO departamentoDAO = new DepartamentoDAO();
	private static  DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
	private static  EditalDAO editalDAO = new EditalDAO();
	private static  HorarioDAO horarioDAO = new HorarioDAO();
	private static  InscricaoDAO inscricaoDAO = new InscricaoDAO();
	private static  ProfessorDAO professorDAO = new ProfessorDAO();
	private static  ProfessorLecionaTurmaDAO professorLecionaTurmaDAO =  new ProfessorLecionaTurmaDAO();
	private static  ProjetoDAO projetoDAO = new ProjetoDAO();
	private static  RelatorioDAO relatorioDAO = new RelatorioDAO();
	private static  SemestreDAO semestreDAO = new SemestreDAO();
	private static  TurmaDAO turmaDAO = new TurmaDAO();
	private static  TurmaPossuiHorarioDAO turmaPossuiHorarioDAO = new TurmaPossuiHorarioDAO();
	private static  VoluntarioDAO voluntarioDAO = new VoluntarioDAO();
	private static  VoluntarioProjetoDAO voluntarioProjetoDAO = new VoluntarioProjetoDAO();
	private static  UsuarioDAO usuarioDAO = new UsuarioDAO();

	private  DBFacade(){ }
	
	
	//***********facade para Usuario ***********//
	public static Usuario getOneuUsuario(Usuario u){
		return usuarioDAO.getOne(u);
	}
	
	
	//***********facade para Edital ***********//
	public static List<Edital> getOpenedEditais(){
		return editalDAO.getOpened();
	}
	
	
	//***********facade para Projeto ***********//
	public static List<Projeto> getProjetosByEdital(Edital e){
		return projetoDAO.getProjetosByEdital(e.getCod());		
	}
	
	
	//***********facade para Inscricao ***********//
	public static Inscricao realizarInscricao(String cpfUsuario, int projeto_cod){
		
		Inscricao i = new Inscricao();
		i.setAluno_matricula(alunoDAO.getAlunoByCpf(cpfUsuario).getMatricula());
		i.setProjeto_cod(projeto_cod);
		i.setData_inscricao(new Date());
		
		if(!inscricaoDAO.isAlunoInscricaoToProjeto(i))
			return inscricaoDAO.insert(i);
		
		return null;
		
	}
	
}
