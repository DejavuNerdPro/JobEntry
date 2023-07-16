package ace.jobFinder.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ace.jobFinder.Model.User;
import ace.jobFinder.Utility.DBUtility;

@Service("InternalBusinessLogic")
public class InternalBusinessDAO {

	Connection connection=DBUtility.getConnection();

	public InternalBusinessDAO(){}

	public void UserDataInsertion(User user){
		String query="insert into user(userId,name,email,password)values(?,?,?,?)";
		PreparedStatement statement=DBUtility.getPreparedStatement(connection, query);
		try {
			statement.setString(1,user.getUserId());
			statement.setString(2,user.getUsername());
			statement.setString(3,user.getEmail());
			statement.setString(4,user.getPassword());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
