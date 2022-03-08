package Ana;

public class Seramik extends Sergi{
	
	public Seramik() {}
	public Seramik(String eser_konusu,String eser_adi,int eser_sirasi,int id)
	{
		super(eser_konusu,eser_adi,eser_sirasi,id);
	}
	
	public Boolean taban_alani(int taban_alani)
	{
		if(taban_alani>3)
		{
			return false;
		}
		else {
	return true;
		}
	}
	
	
	
	
}
