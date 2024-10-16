package aerodrom;

public class Avion {
	//pravimo obelezja
	private String kompanija;
	private int brojPutnika;
	private double maxTezina;//u kg
	private String naziv;
	
	public Avion() {//prazan konstruktor
		
	}
	
	public Avion(String kompanija, double maxTezina,int brojPutnika,String naziv) {//pun konstruktor
		this.kompanija=kompanija;
		this.maxTezina=maxTezina;
		this.brojPutnika=brojPutnika;
		this.naziv=naziv;
	}

	public String getNaziv() {//getter
		return naziv;
	}

	public void setNaziv(String naziv) {//setter
		this.naziv = naziv;
	}

	public String getKompanija() {
		return kompanija;
	}

	public void setKompanija(String kompanija) {
		this.kompanija = kompanija;
	}

	public int getBrojPutnika() {
		return brojPutnika;
	}

	public void setBrojPutnika(int brojPutnika) {
		this.brojPutnika = brojPutnika;
	}

	public double getMaxTezina() {
		return maxTezina;
	}

	public void setMaxTezina(double maxTezina) {
		this.maxTezina = maxTezina;
	}

	
}
