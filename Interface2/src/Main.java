class DatabaseManager{
	
	public void AddDatabase(IDatabase database) {
		database.Add();	
	}
	
	public void DeleteDatabase(IDatabase database) {
		database.Delete();
	}
	public void GetDatabase(IDatabase database) {
		database.Get();
	}
	public void UpdateDatabase(IDatabase database) {
		database.Update();
	}	
		
}


public class Main {
	
	public static void main(String[] args) {
		
	  
		DatabaseManager manager = new DatabaseManager();
		
		manager.AddDatabase(new MySQLDatabase());
		manager.AddDatabase(new MongoDatabase());
		manager.AddDatabase(new OracleDatabase());
		System.out.println();
		
		manager.GetDatabase(new OracleDatabase());
		manager.DeleteDatabase(new MySQLDatabase());
		manager.UpdateDatabase(new MongoDatabase());
		
		
	}

}
