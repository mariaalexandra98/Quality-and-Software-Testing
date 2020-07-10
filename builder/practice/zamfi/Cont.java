package practice.builder.practice.zamfi;

public class Cont {
    private boolean esteContSalariu;
    private boolean areCardAtasat;
    private boolean areInternetBanking;
    private String titular;

    public Cont(boolean esteContSalariu, boolean areCardAtasat, boolean areInternetBanking, String titular) {
        this.esteContSalariu = esteContSalariu;
        this.areCardAtasat = areCardAtasat;
        this.areInternetBanking = areInternetBanking;
        this.titular = titular;
    }

    public Cont() {
    }

    public boolean isEsteContSalariu() {
        return esteContSalariu;
    }

    public void setEsteContSalariu(boolean esteContSalariu) {
        this.esteContSalariu = esteContSalariu;
    }

    public boolean isAreCardAtasat() {
        return areCardAtasat;
    }

    public void setAreCardAtasat(boolean areCardAtasat) {
        this.areCardAtasat = areCardAtasat;
    }

    public boolean isAreInternetBanking() {
        return areInternetBanking;
    }

    public void setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "esteContSalariu=" + esteContSalariu +
                ", areCardAtasat=" + areCardAtasat +
                ", areInternetBanking=" + areInternetBanking +
                ", titular='" + titular + '\'' +
                '}';
    }
}
