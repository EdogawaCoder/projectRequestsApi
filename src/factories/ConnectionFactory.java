package factories;

import java.sql.Connection;
import java.sql.DriverManager;

//Class for creating connections to the database PostGReSQL  
//PostGReSQLのデータベースへの接続を作成するクラス  
//ぽすとぐれすきゅーえる の でーたべーす への せつぞく を さくせい する くらす

public class ConnectionFactory {

	public Connection getConnection() {

		try {
			return DriverManager.getConnection(
				"jdbc:postgresql://localhost:5434/requests_db", 
				"requests_user","requests_pass");}
		catch (Exception e) {
		
			System.out.println("Error connecting to the database: ");
			e.printStackTrace();
			return null;
		}
	}
}

