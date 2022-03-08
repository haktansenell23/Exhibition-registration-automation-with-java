package Ana;

public class Sergi {
private int id,eser_sirasi;
private String eser_adi,eser_konusu;
public Sergi() {}
public Sergi(String eser_konusu,String eser_adi,int eser_sirasi,int id)
{
	this.eser_adi=eser_adi;
	this.eser_sirasi=eser_sirasi;
	this.id=id;
	this.eser_konusu=eser_konusu;
}
public String geteser_konusu() {
	return eser_konusu;
}
public void seteser_konusu(String eser_konusu) {
	this.eser_konusu =eser_konusu;
}

	

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getEser_adi() {
	return eser_adi;
}
public void setEser_adi(String eser_adi) {
	this.eser_adi = eser_adi;
}
public int getEser_sirasi() {
	return eser_sirasi;
}
public void setEser_sirasi(int eser_sirasi) {
	this.eser_sirasi = eser_sirasi;
}

	

	

}
