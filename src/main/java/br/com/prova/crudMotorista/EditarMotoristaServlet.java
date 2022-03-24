package br.com.prova.crudMotorista;

import java.io.IOException;

import br.com.prova.crudMotorista.Motorista;
import br.com.prova.crudMotorista.MotoristaDAO;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
		name = "editarMotorista",
		urlPatterns = "/editarMotorista"
	)

public class EditarMotoristaServlet extends HttpServlet{

	
private static final long serialVersionUID = 1L;
	
	MotoristaDAO MotoristaDAO = new MotoristaDAO();
	
	
	public void doPost(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse
	) throws IOException {
		
		MotoristaDAO.index = Integer.valueOf(httpServletRequest.getParameter("index"));

		httpServletResponse.sendRedirect("editarMotorista.jsp");
	}
	
	
}
