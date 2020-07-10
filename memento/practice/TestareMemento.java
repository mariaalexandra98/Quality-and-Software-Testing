package practice.memento.practice;

public class TestareMemento {
    public static void main(String[] args) {
        Spital spital = new Spital("tbc", 10, 20);
        ManageriStariSpital manageriStariSpital = new ManageriStariSpital();

        manageriStariSpital.addBackup(spital.salveazaStare());
        spital.setNrMedici(9000);
        spital.setNrPacienti(2000);
        System.out.println(spital);

        manageriStariSpital.addBackup(spital.salveazaStare());
        spital.recuperareStare(manageriStariSpital.getMemento(0));
        System.out.println(spital);
    }
}
