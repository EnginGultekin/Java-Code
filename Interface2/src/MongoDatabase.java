
public class MongoDatabase implements IDatabase {

	@Override
	public void Add() {
		System.out.println("-> MongoDb Ekleme" );
		
	}

	@Override
	public void Delete() {
		System.out.println("-> MongoDb Silme " );
		
	}

	@Override
	public void Update() {
		System.out.println("-> MongoDb GŁncelleme" );
		
	}

	@Override
	public void Get() {
		System.out.println("-> MongoDb Atamak" );
		
	}
	
}
