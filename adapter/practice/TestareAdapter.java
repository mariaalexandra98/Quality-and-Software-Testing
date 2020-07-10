package practice.adapter.practice;

public class TestareAdapter {
    public static void main(String[] args) {
        ComandaBucatarieSoftExistent bucatarie = new ComandaBucatarieSoftExistent(145);
        bucatarie.solicitaBon();

        SoftAchizitionatComandaBar bar = new SoftAchizitionatComandaBar(100);
        AdapterDeObiecteComandaBar comandaBar = new AdapterDeObiecteComandaBar(bar);
        comandaBar.solicitaBon();

        AdapterDeClaseComandaBar adapterDeClaseComandaBar = new AdapterDeClaseComandaBar(140);
        adapterDeClaseComandaBar.solicitaBon();
    }
}
