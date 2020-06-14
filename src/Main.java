import BmiService.BmiService;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BodyMass = service.calculate(95 , 1.93);
        System.out.println("Ваш индекс массы тела = " + (int)BodyMass);
    }
}