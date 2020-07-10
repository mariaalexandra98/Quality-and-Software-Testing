package practice.adapter.practice;

public class AdapterDeClaseComandaBar extends SoftAchizitionatComandaBar implements IComandaBucatarieSoftExistent{

    public AdapterDeClaseComandaBar(float sumaPlataBar) {
        super(sumaPlataBar);
    }

    @Override
    public void solicitaBon() {
        super.emiteBon();
    }
}
