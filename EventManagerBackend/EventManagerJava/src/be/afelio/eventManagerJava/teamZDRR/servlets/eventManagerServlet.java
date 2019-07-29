package be.afelio.eventManagerJava.teamZDRR.servlets;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.afelio.eventManagerJava.teamZDRR.impl.implementEventMangerRepository;

@WebServlet("/*")
public class eventManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected implementEventMangerRepository repository;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		try {
			Class.forName("org.postgresql.Driver"); // charger la class (driver) postgres
			String path = getServletContext().getRealPath("/WEB-INF/database.properties"); // je demande le chemin au
																							// contexte / il crée le
																							// chemin vers le fichier
			Properties properties = new Properties(); // properties clé et valeurs sont des string, il est capable de
														// lire les fichier qui ont un format adapté
			try ( // le fichier pourrait être absent try() = closable
					java.io.InputStream in = new FileInputStream(path); // objet capable de lire le fichier
			) {
				properties.load(in); // va aller chercher le contenu du fichier pour remplir
			}
			String url = properties.getProperty("database.url");
			String user = properties.getProperty("database.user");
			String password = properties.getProperty("database.password");

			repository = new implementEventMangerRepository(user, password, url);
		} catch (Exception e) {
			throw new ServletException(e);
		} 
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@Override
	protected void doOptions(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // est ce que le client a le droit de faire un post
		super.doOptions(request, response);
		setHeaders(response);
	}

	private void setHeaders(HttpServletResponse response) {
		response.addHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		response.addHeader("Access-Control-Allow-Methods", "*");
		response.addHeader("Access-Control-Allow-Credentials", "true");
		response.addHeader("Access-Control-Allow-Headers", "content-type"); // pour que ca soit accepté par tous les
																			// browser content-type pour le headers
	}

}
