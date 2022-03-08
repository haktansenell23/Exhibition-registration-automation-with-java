package Ana;

public class Heykel extends Sergi{
	
	public Heykel() {}
	public Heykel(String eser_konusu,String eser_adi,int eser_sirasi,int id)
	{
		super(eser_konusu,eser_adi,eser_sirasi,id);
	}
	
	
	   public boolean taban_alani(int taban_alani)
	    {
	        if(taban_alani>5)
	        {
	           return false;
	        }
	        else {
	            return true;
	        }
	        
	    }

}

