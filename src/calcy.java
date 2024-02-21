import input.Input;
import operations.Operations;
import java.util.Scanner;

public class calcy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Operations op = new Operations();
        Input in = new Input();
        System.out.println("Enter 1 number: ");
        int aa = sc.nextInt();
        System.out.println("ENter 2 number: ");
        int bb = sc.nextInt();

        in.setA(aa);
        in.setB(bb);

        int sum = op.add(in.getA(),in.getB());
        System.out.println("Addition is : "+ sum);

        int sub = op.sub(in.getA(),in.getB());
        System.out.println("Subtraction is : "+ sub);

    }
}

