package aerodrom;

public class Kompanija {
	//pravimo obelezja
	private int godinaOsnivanja;
	private int brojAviona;
	private String naziv;
	private String drzavaPorekla;
	public Kompanija() {//prazan konstruktor

	}
	public Kompanija(int godinaOsnivanja, int brojAviona, String naziv, String drzavaPorekla) {//pun konstruktor
		this.godinaOsnivanja = godinaOsnivanja;
		this.brojAviona = brojAviona;
		this.naziv = naziv;
		this.drzavaPorekla = drzavaPorekla;
	}
	public int getGodinaOsnivanja() {//getter
		return godinaOsnivanja;
	}
	public void setGodinaOsnivanja(int godinaOsnivanja) {//setter
		this.godinaOsnivanja = godinaOsnivanja;
	}
	public int getBrojAviona() {
		return brojAviona;
	}
	public void setBrojAviona(int brojAviona) {
		this.brojAviona = brojAviona;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getDrzavaPorekla() {
		return drzavaPorekla;
	}
	public void setDrzavaPorekla(String drzavaPorekla) {
		this.drzavaPorekla = drzavaPorekla;
	}
	
	
}
