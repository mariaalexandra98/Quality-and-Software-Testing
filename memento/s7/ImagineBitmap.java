package practice.memento.s7;

public abstract class ImagineBitmap {
	protected int latime;
	protected int lungime;
	protected String schemaCulori;
	protected float dimensiune;
	//adauga inca un atribut la alegere
	
	public abstract void redimensionare(int nouaLatime, int nouaLungime);
	public abstract void modificaSchemaCulori(String schemaCulori);
	public abstract void redenumesteFisier();
	public abstract void adaugaText();

	//adauga inca 2 metode la alegere (poti verifica ce poti face in Paint ca sursa de inspiratie)
	
	public abstract void afisareImagine();

	public ImagineBitmap(int latime, int lungime, String schemaCulori, float dimensiune) {
		this.latime = latime;
		this.lungime = lungime;
		this.schemaCulori = schemaCulori;
		this.dimensiune = dimensiune;
	}

	public int getLatime() {
		return latime;
	}

	public void setLatime(int latime) {
		this.latime = latime;
	}

	public int getLungime() {
		return lungime;
	}

	public void setLungime(int lungime) {
		this.lungime = lungime;
	}

	public String getSchemaCulori() {
		return schemaCulori;
	}

	public void setSchemaCulori(String schemaCulori) {
		this.schemaCulori = schemaCulori;
	}

	public float getDimensiune() {
		return dimensiune;
	}

	public void setDimensiune(float dimensiune) {
		this.dimensiune = dimensiune;
	}
}
