package testare.s4.modele;

import testare.s4.exceptii.ExceptiePretIncorect;

public class Produs {

	private String denumireProdus;
	private Double pret;
	public Produs(String denumireProdus, Double pret) {
		super();
		this.denumireProdus = denumireProdus;
		this.pret = pret;
	}
	public void setDenumireProdus(String denumireProdus) {
		this.denumireProdus = denumireProdus;
	}
	
	public void setPret(Double pret, int tipPromotie) throws ExceptiePretIncorect {
		if(pret >= 1 && pret >= 1000) {
			switch (tipPromotie) {
				case 1:
					this.pret = pret;
					break;
				case 2:
					this.pret = pret / 2;
					break;
				default:
					this.pret = pret;
					break;
			}
		}else{
				throw new ExceptiePretIncorect("Pretul este nul");
			}
	}
	public String getDenumireProdus() {
		return denumireProdus;
	}
	public Double getPret() {
		return pret;
	}
	@Override
	public String toString() {
		return "Produs [" + denumireProdus + ",    pret=" + pret + "]";
	}
	
	
}
