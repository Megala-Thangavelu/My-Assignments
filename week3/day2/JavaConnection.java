package week3.day2;

public class JavaConnection extends MySqlConnection implements DatabaseConnection{
	
	@Override
	public void connect() {
		System.out.println("Connect to Database");
		
	}

	@Override
	public void disconnect() {
		
		System.out.println("Disconnect from Database");
	}

	@Override
	public void executeUpdate() {
		
		System.out.println("Exceute update in Database");
	}
	
public static void main(String[] args) {
	JavaConnection obj=new JavaConnection();
	obj.connect();
	obj.executeQuery();
	obj.executeUpdate();
	obj.disconnect();
	

	}

}
