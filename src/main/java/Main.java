import ru.netology.sqr.SqrService;

public class Main {
    public static void main(String[] args) {
        SqrService service = new SqrService();
        int count = service.calcSqr(200, 300);
        System.out.println(count);
    }
}
