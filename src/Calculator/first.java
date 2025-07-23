package Calculator;
import java.util.Scanner;


public class first {
    static String Validate_Input(Scanner scanner)
    {
        String input = scanner.nextLine().replaceAll("\\s+", "");
        if (!input.matches("^[0-9+\\-*\\/.]+$")) {
            System.out.println("Ошибка: в строке есть недопустимые символы!");
            System.out.println("Повторите ввод используя допустимые символы!");
            input = Validate_Input(scanner);
        }
        return input;
    }
    public static void main(String[] args) {
        System.out.println("                      калькулятор");
        System.out.println("");
        System.out.println("              Допустимые операции: + - * /");
        System.out.println(" Введите выражение которое необходимо рассчитать");

        Scanner scanner = new Scanner(System.in);
        String input = Validate_Input(scanner);

        int input_ln = input.length();
        int operands = 0;
        int arg_buf = 0;
        int buffer []=new int[operands+1];
        char[] input_ch = input.toCharArray();
        for (char ch : input_ch) {
            if (ch == '*' || ch == '/' || ch == '+' || ch == '-') {
                operands++;
            }else{
                buffer[arg_buf]=(int)ch;
            }
        }

        for (char ch : input_ch) {
        int
        }
    }
}


