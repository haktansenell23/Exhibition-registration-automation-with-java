package Ana;

public class User {
	
	String eseradi,advesoyad,eposta,sifre;
	int sira_no,id;
	

	public User() {
		
	}

	public User(String eseradi, String advesoyad, String eposta, String sifre,  int sira_no,int id) {
		super();
		this.eseradi = eseradi;
		this.advesoyad = advesoyad;
		this.eposta = eposta;
		this.sifre = sifre;
		
		this.sira_no = sira_no;
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEseradi() {
		return eseradi;
	}
	public void setEseradi(String eseradi) {
		this.eseradi = eseradi;
	}
	public String getAdvesoyad() {
		return advesoyad;
	}
	public void setAdvesoyad(String advesoyad) {
		this.advesoyad = advesoyad;
	}
	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public int getsira_no() {
		return sira_no;
	}
	public void setsira_no(int sira_no) {
		this.sira_no = sira_no;
	}
	
}
