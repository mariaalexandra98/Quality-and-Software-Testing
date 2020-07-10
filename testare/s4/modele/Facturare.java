package testare.s4.modele;

import testare.s4.exceptii.ExceptieFacturaFaraProduseS4;

import java.util.ArrayList;
import java.util.List;

public class Facturare {
	List<Produs> produse;

	public Facturare() {
		produse = new ArrayList<Produs>();
	}
	
	public void adaugaProdusPeFactura(Produs produs) {
		produse.add(produs);
	}
	
	public Double calculValoareProduseFaraTVA() {
		double sumaTotala=0;
		for(Produs produs:produse) {
			sumaTotala+=produs.getPret();
		}
		return new Double(sumaTotala);
	}
	
	public void printareBonDeCasa() {
		System.out.println("BON FISCAL");
		for(Produs produs:produse) {
			System.out.println(produs.toString());
		}
		
		System.out.println("Total: "+ calculValoareProduseFaraTVA());
	}
	
	//pentru un TVA de 19% valoare primita trebuie sa fie 0.19
	public Double calculValoareTVA(Double valoareFaraTVA, Double valoareTVA) throws ExceptieFacturaFaraProduseS4 {
		if (valoareFaraTVA != null && valoareTVA != null) {
			return new Double(valoareFaraTVA * valoareTVA / 100);
		} else {
			throw new ExceptieFacturaFaraProduseS4("Valori nule bossulike");
		}
	}
	
	public void printareFactura() throws ExceptieFacturaFaraProduseS4 {

		System.out.println("FACTURA");
		for(Produs produs:produse) {
			System.out.println(produs.toString());
		}
		Double sumaFactura= calculValoareProduseFaraTVA();
		System.out.println("Total factura fara TVA: "+ sumaFactura);
		System.out.println("TVA:"+(calculValoareTVA(sumaFactura, 0.19)));
	}

}