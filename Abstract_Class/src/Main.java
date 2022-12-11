
public class Main {
	
	public static void main(String[] args) {
		
	//	AbstractDatabase abst1 = new AbstractDatabase();   !!!! Oluþmaz

		AbstractDatabase abst1 = new MySQLDatabase();
		AbstractDatabase abst2 = new MongoDatabase();
		
		abst1.Add();
		abst2.Delete();
		abst1.Get();
		abst2.Update();
		
		
		MySQLDatabase abst3 = new MySQLDatabase();
		MongoDatabase abst4 = new MongoDatabase();
		
		abst3.Add();
		abst4.Delete();
		abst3.Get();
		abst4.Update();
		
	}

}
