package practice.strategy.s11;

public class Avizier implements IPublicareAnunt{
    @Override
    public void publicaAnunt(String denumireAsociatie) {
        System.out.println("A fost publicat la avizier anuntul de catre " + denumireAsociatie);
    }
}
