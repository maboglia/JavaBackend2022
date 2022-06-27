package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CaricaDati {

	
	private final String HOST = "jdbc:mysql://localhost:3306/java_2022";
	private final String USER = "root";
	private final String PASS = "V3cch10n3_!";
	
	private Connection conn = null;
	
	private Statement stat;//contenitore per le query
	private PreparedStatement ps;
	
	private void connetti() {
		try {
			
			this.conn = DriverManager.getConnection(HOST, USER, PASS);
			System.out.println("connesso");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		CaricaDati cd = new CaricaDati();
		cd.connetti();
		
		cd.leggiFile("files/wimbledon.txt");
		//cd.creaTabella();
		
	}


	private  void creaTabella() {

		String query = "drop table if exists wimbledon; CREATE TABLE `java_2022`.`wimbledon` ( `id` INT NOT NULL AUTO_INCREMENT, `anno` VARCHAR(10) NULL, `tennista` VARCHAR(45) NULL, `nazionalita` VARCHAR(3) NULL, `wimbledoncol` VARCHAR(45) NULL, PRIMARY KEY (`id`));";
		
		try {
			stat = this.conn.createStatement();
			boolean liscio = stat.execute(query);
			if (liscio)
				System.out.println("tabella creata");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	private  void leggiFile(String string) {

		try {
			Scanner sc = new Scanner(new File(string));
			
			while(sc.hasNextLine()) {
				
				String riga = sc.nextLine();
				
				String[] parolePerRiga = riga.split(",");
				
				String anno = parolePerRiga[0];
				String nazionalita = parolePerRiga[1];
				String tennista = parolePerRiga[2];
				
				stat = this.conn.createStatement();
				String query = "insert into wimbledon (anno, tennista, nazionalita)"
						+ " values ('"+anno+"', '"+tennista+"', '"+nazionalita.substring(0, 3)+"')";
				
				stat.execute(query);
				
				System.out.format("Nell'anno %s il trofeo di Wimbledon è stato vinto da %n%s di nazionalità %s", anno, tennista, nazionalita);
				
			}
			
			
			
		} catch (FileNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
