package command.practice;

public class ComandaInternare implements IComanda{
    private IMedic medic;
    private String numePacient;

    public ComandaInternare(IMedic medic, String numePacient) {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void executa() {
        this.medic.internare(numePacient);
    }
}
