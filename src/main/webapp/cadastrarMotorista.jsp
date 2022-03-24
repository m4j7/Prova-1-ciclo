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
						
				<h1 style="text-align: center; color: #009a84;">Cadastar Motorista</h1>

				<hr> <br />
			
				<label style="color: #009a84">Nome: </label><br />
				<input type="text" name="nome" style="width: 100%">
				
				<br /><br />
				
				<label style="color: #009a84">Numero do CPF: </label> <br />
				<input type="text" name="nrCpf" style="width: 100%">
				
				<hr> <br />
			
				<label style="color: #009a84">Telefone: </label><br />
				<input type="text" name="nrTelefone" style="width: 100%">
				
				<hr> <br />
			
				<label style="color: #009a84">Data de Nascimento: </label><br />
				<input type="date" name="dtNascimento" style="width: 100%">
				
				<hr> <br />
			
				<label style="color: #009a84">Cep: </label><br />
				<input type="text" name="nrCep" style="width: 100%">
				
				<hr> <br />
			
				<label style="color: #009a84">Lagradouro: </label><br />
				<input type="text" name="dsLagradouro" style="width: 100%">
				
				<hr> <br />
			
				<label style="color: #009a84">Numero: </label><br />
				<input type="text" name="nrCasa" style="width: 100%">
				
				<hr> <br />
				
				<label style="color: #009a84">Cidade: </label><br />
				<input type="text" name="cidade" style="width: 100%">
				
				<hr> <br />
			
				<label style="color: #009a84">Nacionalidade: </label><br />
				<input type="text" name="nacionalidade" style="width: 100%">
							
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
							Listar Motorista
						</a>
						
					</div>
					<div style="width: 50%; float: right;">
						<input type="submit" value="Cadastrar"
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