package testare.s6.cazuri;

import testare.s6.exceptii.EroatePunctajMaxim;
import testare.s6.exceptii.ExceptiePunctajNul;

import java.util.ArrayList;
import java.util.Arrays;

public class TestGrila {
	String denumire;		//minim 5 caractere, maxim 50
	int punctajMaxim;		//cuprins in intervalul [10, 90]
	int dificultate;		//cuprinsa in intervalul [1, 5]
	
	ArrayList<String> intrebari;
	ArrayList<Integer> punctajeIntrebari;
	
	
	public TestGrila(String denumire, int punctajMaxim, int dificultate) {
		super();
		this.denumire = denumire;
		this.punctajMaxim = punctajMaxim;
		this.dificultate = dificultate;
	}
	
	public void setIntrebari(String[] intrebari, int[] punctaje) throws ExceptiePunctajNul {
		if(intrebari == null && punctaje == null) {
			throw new ExceptiePunctajNul("Intrebari nule");
		}
		this.punctajeIntrebari = new ArrayList<>();
		this.intrebari = new ArrayList<>();
		for(int puncte : punctaje)
			this.punctajeIntrebari.add(puncte);
		for(String intrebare : intrebari)
			this.intrebari.add(intrebare);
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public ArrayList<String> getIntrebari() {
		return intrebari;
	}

	public int getDificultate() {
		return dificultate;
	}

	public void setDificultate(String dificultate) {
		if(dificultate.equals("usor"))
			this.dificultate = 1;
		else if(dificultate.equals("dificil"))
			this.dificultate = 2;
		else if(dificultate.equals("pro"))
			this.dificultate = 3;
		else throw new UnsupportedOperationException();
	}
	
	
	
	public int getPunctajMaxim() {
		return punctajMaxim;
	}

	public void setPunctajMaxim(int punctajMaxim) throws EroatePunctajMaxim {
		if(punctajMaxim >= 10 && punctajMaxim <= 90) {
			this.punctajMaxim = punctajMaxim;
		} else{
			throw new EroatePunctajMaxim("Punctajul nu e conform limitelor 10-90");
		}
	}

	//calculeaza suma punctelor tuturor intrebarilor din test
	public int calculTotalPuncte(){
		int total = 0;
		for(int punctaj : this.punctajeIntrebari)
			total += punctaj;
		
		switch(this.dificultate) {
		case 1:
			return total;
		case 2: 
			return total * 2;
		default:
			throw new UnsupportedOperationException();
		}
		
	}
	
	public float calculPunctajPerIntrebare() {
		return this.punctajMaxim / this.intrebari.size();
	}
	
}
