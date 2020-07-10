package practice.adapter.practice;

public class SoftAchizitionatComandaBar {
    private float sumaPlataBar;

    public SoftAchizitionatComandaBar(float sumaPlataBar) {
        this.sumaPlataBar = sumaPlataBar;
    }

    public void emiteBon() {
        System.out.println("Aveti de plata " + sumaPlataBar);
    }
}
