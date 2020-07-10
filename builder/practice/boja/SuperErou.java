package practice.builder.practice.boja;

public class SuperErou {
    private String nume;
    private boolean estePozitiv;
    private String superPutere;
    private String superSuperPutere;
    private IArma armaManaStanga;
    private IArma armaManaDreapta;

    private SuperErou(String nume, boolean estePozitiv, String superPutere, String superSuperPutere, IArma armaManaStanga, IArma armaManaDreapta) {
        this.nume = nume;
        this.estePozitiv = estePozitiv;
        this.superPutere = superPutere;
        this.superSuperPutere = superSuperPutere;
        this.armaManaStanga = armaManaStanga;
        this.armaManaDreapta = armaManaDreapta;
    }

    private SuperErou() {

    }

    private void setNume(String nume) {
        this.nume = nume;
    }

    private void setEstePozitiv(boolean estePozitiv) {
        this.estePozitiv = estePozitiv;
    }

    private void setSuperPutere(String superPutere) {
        this.superPutere = superPutere;
    }

    private void setSuperSuperPutere(String superSuperPutere) {
        this.superSuperPutere = superSuperPutere;
    }

    private void setArmaManaStanga(IArma armaManaStanga) {
        this.armaManaStanga = armaManaStanga;
    }

    private void setArmaManaDreapta(IArma armaManaDreapta) {
        this.armaManaDreapta = armaManaDreapta;
    }

    @Override
    public String toString() {
        return "SuperErou{" +
                "nume='" + nume + '\'' +
                ", estePozitiv=" + estePozitiv +
                ", superPutere='" + superPutere + '\'' +
                ", superSuperPutere='" + superSuperPutere + '\'' +
                ", armaManaStanga=" + armaManaStanga +
                ", armaManaDreapta=" + armaManaDreapta +
                '}';
    }

    public static class SuperErouBuilder {
        private SuperErou superErou;

        public SuperErouBuilder(String nume) {
            this.superErou = new SuperErou();
            this.superErou.setNume(nume);
        }

        public SuperErouBuilder estePozitiv() {
            this.superErou.setEstePozitiv(true);
            return this;
        }

        public SuperErouBuilder esteNegativ() {
            this.superErou.setEstePozitiv(false);
            return this;
        }

        public SuperErouBuilder setSuperPutere(String putere) {
            this.superErou.setSuperSuperPutere(putere);
            return this;
        }

        public SuperErouBuilder setSuperSuperPutere(String superSuperPutere) {
            this.superErou.setSuperSuperPutere(superSuperPutere);
            return this;
        }

        public SuperErouBuilder setArmaManaStanga(IArma arma) {
            this.superErou.setArmaManaStanga(arma);
            return this;
        }

        public SuperErouBuilder setArmaManaDreapta(IArma arma) {
            this.superErou.setArmaManaDreapta(arma);
            return this;
        }

        public SuperErou build() {
            return this.superErou;
        }
    }
}
