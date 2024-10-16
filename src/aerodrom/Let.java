package aerodrom;

public class Let {
	//obelezja
	private String polaz;
	private String dolaz;
	private int trajanje;//u minutima
	private String vremePolaska;
	public Let() {//prazan konstruktor
		
	}
	public Let(String polaz, String dolaz, int trajanje, String vremePolaska) {//pun konstruktor
		this.polaz = polaz;
		this.dolaz = dolaz;
		this.trajanje = trajanje;
		this.vremePolaska = vremePolaska;
	}
	public String getPolaz() {//getter
		return polaz;
	}
	public void setPolaz(String polaz) {//setter
		this.polaz = polaz;
	}
	public String getDolaz() {
		return dolaz;
	}
	public void setDolaz(String dolaz) {
		this.dolaz = dolaz;
	}
	public int getTrajanje() {
		return trajanje;
	}
	public void setTrajanje(int trajanje) {
		this.trajanje = trajanje;
	}
	public String getVremePolaska() {
		return vremePolaska;
	}
	public void setVremePolaska(String vremePolaska) {
		this.vremePolaska = vremePolaska;
	}
	
	
}
