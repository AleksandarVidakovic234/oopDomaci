package aerodrom;

public class Test {

	public static void main(String[] args) {
		Avion a=new Avion();
		a.setBrojPutnika(180);
		a.setKompanija("Boeing");
		a.setMaxTezina(2000);
		a.setNaziv("737");
		System.out.println("Avion: "+a.getNaziv()+"; Kompanija: " +a.getKompanija()+"; Ima kapacitet: " +a.getBrojPutnika() + "; Maksimalna tezina je: " + a.getMaxTezina());
		Let l=new Let();
		l.setPolaz("Beograd");
		l.setDolaz("Berlin");
		l.setTrajanje(100);
		l.setVremePolaska("14:00");
		System.out.println("Polazni grad: "+l.getPolaz()+"; Dolazni grad: " +l.getDolaz()+"; Vreme polaska: " +l.getVremePolaska() + "; Trajanje leta: " + l.getTrajanje());
		Destinacija d=new Destinacija();
		d.setDrzava("Nemacka");
		d.setGrad("Berlin");
		d.setNazivAerodroma("Willy Brandt");
		d.setBrojStanovnika(3850000);
		System.out.println("Naziv aerodroma: "+d.getNazivAerodroma()+"; Grad: " +d.getGrad()+"; Drzava: " +d.getDrzava() + "; Populacija: " + d.getBrojStanovnika());
		Kompanija k=new Kompanija();
		k.setNaziv("Boeing");
		k.setDrzavaPorekla("SAD");
		k.setGodinaOsnivanja(1916);
		k.setBrojAviona(10000);
		System.out.println("Naziv kompanije: "+k.getNaziv()+"; Drzava porekla: " +k.getDrzavaPorekla()+"; Godina osnivanja: " +k.getGodinaOsnivanja() + "; Broj aviona: " + k.getBrojAviona());
	}

}
