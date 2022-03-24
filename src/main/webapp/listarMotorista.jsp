<%@page import="br.com.prova.crudMotorista.Motorista"%>
<%@page import="br.com.prova.crudMotorista.MotoristaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div style="height: 100%; justify-content: center; display: flex;">
			<div style="width: 800px;">
				<h1 style="text-align: center; color: #009a84;"> Lista de Motoristas </h1>
		
				<a href="cadastrarMotorista.jsp" 
					 style="float: right; 
						 background: #009a84; 
						 font-size: 24px; 
						 color: white; 
						 text-align: center; 
						 padding: 5px 11px 5px 10px; 
						 text-decoration: auto; 
						 border-radius: 100px 100px 100px 100px; 
						 margin-top: -60px;"> 
					 Cadastrar Motorista
				 </a>
		
				<hr>
				
				<table border="1" style="width: 100%">
					<tr style="background: #009a84; color: white;">
						<th>ID</th>
						<th>nome</th>
						<th>nrCpf</th>
						<th>nrTelefone</th>
						<th>nrCep</th>
						<th>dsLagradouro</th>
						<th>cidade</th>
						<th>dtNascimento</th>
						<th>nacionalidade</th>
			       </tr>
		
		            <% MotoristaDAO motoristaDao = new MotoristaDAO(); %>
					<% ArrayList<Motorista> listaDeMotorista  = motoristaDao.findByAll(); %>
					
					<% for (int i = 1; i < listaDeMotorista.size(); i++) { %>
						
						
						<tr style="color: #009a84">
							<th> <%= i %> </th>
							<th> <%= listaDeMotorista.get(i).getNome() %> </th>
							<th> <%= listaDeMotorista.get(i).getNrCpf() %> </th>
							<th> <%= listaDeMotorista.get(i).getNrTelefone() %> </th>
							<th> <%= listaDeMotorista.get(i).getNrCep() %> </th>
							<th> <%= listaDeMotorista.get(i).getDsLagradouro() %> </th>
							<th> <%= listaDeMotorista.get(i).getCidade() %> </th>
							<th> <%= listaDeMotorista.get(i).getDtNascimento() %> </th>
							<th> <%= listaDeMotorista.get(i).getNacionalidade() %> </th>
							<th style="width: 150px">
						        
								<form action="editarMotorista" method="post" style="width: 50%; float: left;">
									<input type="hidden" name="index" value="<%= i %>">
									<input type="submit" value="Editar" style="background: #9a8400; color: white">
								</form>
						        
								<form action="excluirMotorista" method="post" style="width: 50%; float: right;">
									<input type="hidden" name="index" value="<%= i %>">
									<input type="submit" value="Excluir" style="background: #9a0016; color: white">
								</form>
						    
							</th>
						</tr>
					
					<% } %>
		
				</table>
				
				<a href="menu.jsp" style="
						background: #009a84;
					    font-size: 16px;
					    color: white;
					   	text-align: center;
					    padding: 10px 10px 10px 10px;
					    text-decoration: auto;
					    border-radius: 10px 10px 10px 10px;
					    margin-top: 20px;
					    position: absolute;"> 
					Voltar para o Menu
				</a>
			</div>
		</div>

</body>
</html>