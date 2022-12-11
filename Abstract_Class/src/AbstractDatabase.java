
public abstract class AbstractDatabase {
	
	public void Add() { 
		System.out.println("-> Yenilik Eklendi ");
	}
	public void Delete() {
		System.out.println("-> Eski Kayýt Silindi ");
	}
	
	abstract void Get();
	abstract void Update();

}
