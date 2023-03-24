import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NBook {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("HP", 8, "Windows10", 17));
        set.add(new Notebook("Asus", 16, "Windows10", 13));
        set.add(new Notebook("Lenovo", 32, "linux", 15));
        set.add(new Notebook("Apple", 64, "MacOS", 13));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}