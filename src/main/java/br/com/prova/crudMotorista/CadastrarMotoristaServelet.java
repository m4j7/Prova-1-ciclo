package br.com.prova.crudMotorista;

import java.io.IOException;
import java.sql.Date;

import br.com.prova.crudMotorista.Motorista;
import br.com.prova.crudMotorista.MotoristaDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(
		name = "salvarMotorista",
		urlPatterns = "/salvarMotorista"
)

public class CadastrarMotoristaServelet extends HttpServlet{
	
private static final long serialVersionUID = 1L;
	
	
	public void doPost(
			HttpServletRequest httpServletRequest, 
			HttpServletResponse httpServletResponse
	) throws IOException {
		
	 Motorista motorista = new Motorista();
     MotoristaDAO motoristaDAO = new  MotoristaDAO();
		
		
		int index = -1;
		
		if (httpServletRequest.getParameter("index") != null) {
			index = Integer.valueOf(httpServletRequest.getParameter("index"));
		}
		
	
		motorista.setNome(httpServletRequest.getParameter("nome"));
		motorista.setNrCpf(httpServletRequest.getParameter("nrCpf"));
		motorista.setNrTelefone(httpServletRequest.getParameter("nrTelefone"));
		motorista.setNrCep(httpServletRequest.getParameter("nrCep"));
		motorista.setDsLagradouro(httpServletRequest.getParameter("dsLagradouro"));
		motorista.setNrCasa(Integer.valueOf(httpServletRequest.getParameter("nrCasa")));
		motorista.setCidade(httpServletRequest.getParameter("cidade"));
		motorista.setNacionalidade(httpServletRequest.getParameter("nacionalidade"));
		motorista.setDtNascimento(Date.valueOf(httpServletRequest.getParameter("dtNascimento")));
		
		if (index >= 0 ) {
			//MotoristaDao.atualizar(index, );	
		}
		else {
			motoristaDAO.cadastrar(motorista);
		}
		
		
		httpServletResponse.sendRedirect("listarMotorista.jsp");

}
}
