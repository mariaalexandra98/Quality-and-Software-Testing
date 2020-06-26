package command.practice;

public class Medic implements IMedic{
   private String nume;
   private String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }


    @Override
    public void internare(String numePacient) {
        System.out.println("Medicul " + nume + " cu specializarea " + specializare + " interneaza pacienul " + numePacient);
    }

    @Override
    public void tratareImediata(String numePacient) {
        System.out.println("Medicul " + nume + " cu specializarea " + specializare + " cere tratarea imediata a pacientului " + numePacient);
    }
}
