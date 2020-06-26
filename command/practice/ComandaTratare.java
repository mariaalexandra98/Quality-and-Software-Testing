package command.practice;

public class ComandaTratare implements IComanda{
    private IMedic medic;
    private String numePacient;

    public ComandaTratare(IMedic medic, String numePacient) {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void executa() {
        this.medic.tratareImediata(numePacient);
    }
}
