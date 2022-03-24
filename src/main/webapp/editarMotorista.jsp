<%@page import="br.com.prova.crudMotorista.MotoristaDAO"%>
<%@page import="br.com.prova.crudMotorista.Motorista"%>
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
		
			<form action="salvarMotorista" method="post" 
					style="width: 300px; 
						border: 1px solid #009a84;
						padding: 15px;
						border-radius: 10px 10px 10px 10px;">
						
				<h1 style="text-align: center; color: #009a84;">Editar Motorista</h1>
				
				<hr> <br />
				
				<% MotoristaDAO motoristaDao = new MotoristaDAO(); %>
				<% Motorista motorista = motoristaDao.findById(MotoristaDAO.index); %>
			

				<label style="color: #009a84">Nome: </label><br />
				<input type="text" name="nome" value = "<%= motorista.getNome() %>"style="width: 100%">
				
				<br /><br />
				
				<label style="color: #009a84">Numero do CPF: </label> <br />
				<input type="text" name="nrCpf" value = "<%= motorista.getNrCpf() %>" style="width: 100%">
				
				<hr> <br />
			
				<label style="color: #009a84">Telefone: </label><br />
				<input type="text" name="nrTelefone" value="<%= motorista.getNrTelefone() %>" style="width: 100%">
				
				<hr> <br />
			
				<label style="color: #009a84">Data de Nascimento: </label><br />
				<input type="date" name="dtNascimento" value= "<%= motorista.getDtNascimento() %>" style="width: 100%">
				
				<hr> <br />
			
				<label style="color: #009a84">Cep: </label><br />
				<input type="text" name="nrCep" value= "<%= motorista.getNrCep() %>" style="width: 100%">
				
				<hr> <br />
			
				<label style="color: #009a84">Lagradouro: </label><br />
				<input type="text" name="dsLagradouro" value= "<%= motorista.getDsLagradouro() %>" style="width: 100%">
				
				<hr> <br />
			
				<label style="color: #009a84">Numero: </label><br />
				<input type="text" name="nrCasa" value= "<%= motorista.getNrCasa() %>" style="width: 100%">
				
				<hr> <br />
				
				<label style="color: #009a84">Cidade: </label><br />
				<input type="text" name="cidade" value= "<%= motorista.getCidade() %>" style="width: 100%">
				
				<hr> <br />
			
				<label style="color: #009a84">Nacionalidade: </label><br />
				<input type="text" name="nacionalidade" value= "<%= motorista.getNacionalidade() %>" style="width: 100%">
							
				<br /><br /><br />
							
				
				<div style="width: 100%;">
					<div style="width: 50%; float: left;">
						
						<a href="listarMotorista.jsp" style="
								background: #009a84;
							    font-size: 16px;
							    color: white;
							    width: 100%;
							    text-align: center;
							    padding: 10px 10px 10px 10px;
							    text-decoration: auto;
							    border-radius: 10px 10px 10px 10px;"> 
							Listar Motoristas
						</a>
						
					</div>
					<div style="width: 50%; float: right;">
						<input type="submit" value="Editar"
							style="
							    background: #009a84;
							    font-size: 16px;
							    color: white;
							    width: 100%;
							    text-align: center;
							    padding: 8px 10px 8px 10px;
							    text-decoration: auto;
							    border-radius: 10px 10px 10px 10px;
							    margin-top: -10px;">
					</div>	
				</div>
				
			</form>
		</div>
</body>
</html>