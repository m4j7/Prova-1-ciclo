package br.com.prova.crudMotorista;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
		name = "excuirMotorista",
		urlPatterns = "/excluirMotorista"
	)

public class ExcluirMotoristaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	public void doPost(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse
	) throws IOException {
		
		long index = Long.valueOf(httpServletRequest.getParameter("index"));
		
		MotoristaDAO MD = new MotoristaDAO();
		MD.disableMotorista(index);
		
		httpServletResponse.sendRedirect("listarMotorista.jsp");
	}
}
