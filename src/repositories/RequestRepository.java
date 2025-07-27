package repositories;

import javax.swing.JOptionPane;

/*
 * Repository class for managing requests.
 * 要求を管理するリポジトリクラス  
 * ようきゅう を かんり する りぽじとり くらす
 */

public class RequestRepository {

	public void insertRequest(entities.Request request) {
		// Code to insert the request into the database
		// でーたべーす に りくえすと を そうにゅう する こーど

		try {

			var factory = new factories.ConnectionFactory();

			var connection = factory.getConnection();
			
			var query = """
					INSERT INTO request (id, request_date, client_name, request_value, description, status)
					VALUES( ?, ?, ?, ?, ?, ?)
					""";
			
			var statement = connection.prepareStatement(query);
			
			statement.setObject(1, request.getId());
			statement.setObject(2, request.getDate());
			statement.setString(3, request.getClientName());
			statement.setDouble(4, request.getValueRequest());
			statement.setString(5, request.getDescription());
			statement.setString(6, request.getStatus().toString());
			
			statement.executeUpdate();

			statement.close();
			
			JOptionPane.showMessageDialog(null, "Request registered successfully!");

		} catch (Exception e) {
			System.out.println("Error inserting request into the database: ");
			e.printStackTrace();

		}

	}
}
