
public class MySQLDatabase implements IDatabase {

	@Override
	public void Add() {
		System.out.println("-> MySQL Ekleme" );
		
	}

	@Override
	public void Delete() {
		System.out.println("-> MySQL Silme " );
		
	}

	@Override
	public void Update() {
		System.out.println("-> MySQL Güncelleme" );
		
	}

	@Override
	public void Get() {
		System.out.println("-> MySQL Atamak" );
		
	}

}
