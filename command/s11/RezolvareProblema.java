package command.s11;

public class RezolvareProblema extends SolicitareRezolvareProblema{
    private String nrBloc;
    private int nrApartament;
    private String problema;
    private IReparatie meserias;

    public RezolvareProblema(String numeMeserias, String nrBloc, int nrApartament, String problema, IReparatie meserias) {
        super(numeMeserias);
        this.nrBloc = nrBloc;
        this.nrApartament = nrApartament;
        this.problema = problema;
        this.meserias = meserias;
    }

    @Override
    public void reparaProblemaInBloc(String numarBloc, int numarApartament, String problema) {
        this.meserias.executaReparatie();
    }
}
