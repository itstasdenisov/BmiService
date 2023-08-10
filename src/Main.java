public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float index = service.calculate(98, 187);
        System.out.println(index);


    }
}