import java.util.Scanner;

public class TesteLeituraTecladoFloat {

    public static void main(String[] args) {
        float dadoFloatDigitado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dado do tipo float e aperte a tecla enter:");
        dadoFloatDigitado = scanner.nextFloat();

        System.out.printf("O dado do tipo float digitado foi: %f", dadoFloatDigitado);
    }
}
