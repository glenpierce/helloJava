import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static Map<String, SomeData> map = new LinkedHashMap<>();

    public static void main(String[] args) {
        int n = 3480;
        int[] memo = new int[n + 1];
        long start = System.currentTimeMillis();
        int result = 0; //fib(n);
        long end = System.currentTimeMillis();
        System.out.println("fib=" + result);
        System.out.println("time=" + (end - start));
        System.out.println("n = " + n);

        start = System.currentTimeMillis();
        result = fibFast(n, memo);
        end = System.currentTimeMillis();
        System.out.println("fibFast=" + result);
        System.out.println("time=" + (end - start));
        System.out.println("n = " + n);

    }

    private static int fib(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    private static int fibFast(int n, int[] memo){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        if(memo[n] == 0){
            memo[n] = fibFast(n - 1, memo) + fibFast(n - 2, memo);
        }
        return memo[n];
    }

    @MyAnnotation(studentName = "Glen", stuAddress = "123 Main")
    private static void messWithString(String string){
        string = "I've been edited";
        doThingWithAnnotation();
    }

    private static void doThingWithAnnotation() {
        Method[] methods = Main.class.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
                System.out.println(myAnnotation.studentName());
            }
        }
    }
}
