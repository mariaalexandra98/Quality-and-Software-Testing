package practice.strategy.s3;

public class TestareStrategy {
    public static void main(String[] args) {
        IStudent metoda = new ExamenOral();
        Student student = new Student("Popescu Andrei", 20, metoda);
        student.executaStrategieSustinereExamen("cts");
        student.setModalitateSustinereExamen(new TestGrila());
        student.executaStrategieSustinereExamen("android");
    }
}
