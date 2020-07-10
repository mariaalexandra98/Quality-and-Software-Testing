package practice.strategy.s11;

public class CaleElecronica implements IPublicareAnunt {
    @Override
    public void publicaAnunt(String denumireAsociatie) {
        System.out.println("Anuntul a fost publicat prin cale electronica de catre " + denumireAsociatie);
    }
}
