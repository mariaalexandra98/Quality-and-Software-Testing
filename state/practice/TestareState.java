package practice.state.practice;

public class TestareState {
    public static void main(String[] args) {
        Masa masa = new Masa(new StareLibera(), 100);
        masa.elibereaza();

        masa.ocupa();
        masa.ocupa();
        masa.elibereaza();
        masa.ocupa();

    }
}
