package Ana;

public class Tablo extends Sergi {
	public Tablo() {}
	
	public Tablo(String eser_konusu,String eser_adi,int eser_sirasi,int id)
	{
		super(eser_konusu,eser_adi,eser_sirasi,id);
	}
	public  boolean boyut_kontrol(int x ,int y)
	{
	 if(x>500||y>500)   
	 {
	 
	    
	  return  true;  
	     
	 }
	 else {
		 return false;
	 }
}
	
	
	
	
	
	
	
}
