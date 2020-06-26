package command.s11;

public abstract class SolicitareRezolvareProblema {
	
	private String numeMeserias;

	public SolicitareRezolvareProblema(String numeMeserias) {
		this.numeMeserias = numeMeserias;
	}

	public abstract void reparaProblemaInBloc(String numarBloc, int numarApartament, String problema);
}
