import java.util.Scanner;

public class ConverterNumero {

    public Integer converter() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero =  s.nextInt();
        return (Integer) numero;
    }
}
