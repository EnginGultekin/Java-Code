
public class OracleDatabase implements IDatabase {
	
	@Override
	public void Add() {
		System.out.println("-> Oracle Ekleme" );
		
	}

	@Override
	public void Delete() {
		System.out.println("-> Oracle Silme " );
		
	}

	@Override
	public void Update() {
		System.out.println("-> Oracle G�ncelleme" );
		
	}

	@Override
	public void Get() {
		System.out.println("-> Oracle Atamak" );
		
	}

}
