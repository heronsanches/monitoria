package monitoria.model.persistence;

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
	

}
