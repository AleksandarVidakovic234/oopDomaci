package aerodrom;

public class Destinacija {
	//pravimo obelezja
	private String grad;
	private String drzava;
	private int brojStanovnika;
	private String nazivAerodroma;
	public Destinacija() {//prazan konstruktor
	}
	
	public Destinacija(String grad, String drzava, int brojStanovnika, String nazivAerodroma) {//pun konstruktor
		this.grad = grad;
		this.drzava = drzava;
		this.brojStanovnika = brojStanovnika;
		this.nazivAerodroma = nazivAerodroma;
	}
	public String getGrad() {//getter
		return grad;
	}
	public void setGrad(String grad) {//setter
		this.grad = grad;
	}
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}
	public int getBrojStanovnika() {
		return brojStanovnika;
	}
	public void setBrojStanovnika(int brojStanovnika) {
		this.brojStanovnika = brojStanovnika;
	}
	public String getNazivAerodroma() {
		return nazivAerodroma;
	}
	public void setNazivAerodroma(String nazivAerodroma) {
		this.nazivAerodroma = nazivAerodroma;
	}
	
	
}
