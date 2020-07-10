package practice.flyweight.S3;

import java.util.HashMap;

public class FlyweightDisciplina {
    public static HashMap<Integer, IDisciplina> listaDiscipline = new HashMap<>();

    public static IDisciplina sustineExamen(int nrCredit, String denumire) {
        IDisciplina disciplina = listaDiscipline.get(nrCredit);
        if(disciplina == null) {
           disciplina = new Disciplina(denumire, nrCredit);
        }
        return disciplina;
    }
}
