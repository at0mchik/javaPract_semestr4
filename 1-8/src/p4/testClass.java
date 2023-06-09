package p4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class testClass {
    public static void main(String[] args) {
        Callable<String> task = () -> Thread.currentThread().getName();
        newExecutorService service = new newExecutorService(2);
        for (int i = 0; i < 5; i++) {
            Future result = service.submit(task);
            try {
                System.out.println(result.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        service.shutdown();
    }
}
