package practice.builder.practice.boja;

public class TestareBuilder {
    public static void main(String[] args) {
        SuperErou superErou = new SuperErou.SuperErouBuilder("Superman")
                .setSuperPutere("laser").estePozitiv().build();
        System.out.println(superErou
        );
    }
}
