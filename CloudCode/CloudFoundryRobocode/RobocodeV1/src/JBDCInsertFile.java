

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JBDCInsertFile {


	public static void main(String[] args) throws FileNotFoundException {
		String url = "jdbc:mysql://10.244.0.143:32768/robocode";
		String user = "5ryvs9z2xq0aojmn";
		String password = "z4o8fpvpv2sdfl75";

		String filePath2 = "C:/robocode/robots/sample/Interactive.java";

		try {
			Connection conn = DriverManager.getConnection(url, user, password);

		String sql="ALTER TABLE robot CHANGE file filedata LONGBLOB";
			//String sql = "UPDATE robot SET file=? where robotID='Interactive'";
			//String sql2="DROP TABLE robot";
			PreparedStatement statement = conn.prepareStatement(sql);
			File file=new File(filePath2);
			InputStream inputStream = new FileInputStream(file);
			//statement.setBinaryStream(1,inputStream,(int)file.length());
			

			int row = statement.executeUpdate();
			if (row > 0) {
				System.out.println("A contact was inserted with photo image.");
			}
			conn.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}