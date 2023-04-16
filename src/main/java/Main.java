import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String input;

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!\nEnter a command:");

        int one = 0;
        int two = 0;
        boolean over = false;
        while(!over)
        {
            input = promptForInput(s);
            switch (input)
            {
                case "exit":
                    over = true;
                    break;
                case "help":
                    displayUseMe();
                    break;
                case "add":
                    System.out.println("num 1:");
                    one = promptForNum(s);
                    System.out.println("num 2:");
                    two = promptForNum(s);
                    System.out.println(calc.add(one, two));
                    break;
                case "subtract":
                    System.out.println("num 1:");
                    one = promptForNum(s);
                    System.out.println("num 2:");
                    two = promptForNum(s);
                    System.out.println(calc.subtract(one, two));
                    break;
                case "multiply":
                    System.out.println("num 1:");
                    one = promptForNum(s);
                    System.out.println("num 2:");
                    two = promptForNum(s);
                    System.out.println(calc.multiply(one, two));
                    break;
                case "divide":
                    System.out.println("num 1:");
                    one = promptForNum(s);
                    System.out.println("num 2:");
                    two = promptForNum(s);
                    System.out.println(calc.divide(one, two));
                    break;
                case "fib":
                    System.out.println("num 1:");
                    one = promptForNum(s);
                    System.out.println(calc.fibonacciNumberFinder(one));
                    break;
                case "bin":
                    System.out.println("num 1:");
                    one = promptForNum(s);
                    System.out.println(calc.intToBinaryNumber(one));
                    break;
                default:
                    System.out.println("Please enter a valid string");
                    displayUseMe();
            }
        }
        System.out.println("Congratulations! You graduated!");
    }

    public static void displayUseMe()
    {
        System.out.println("NO");
    }

    public static String promptForInput(Scanner s)
    {
        String input = s.nextLine();
        input = input.trim();
        return input;
    }

    public static int promptForNum(Scanner s)
    {
        String input = promptForInput(s);
        int number;

        try
        {
            number = Integer.parseInt(input);
        }
        catch (NumberFormatException e)
        {
            number = promptForNum(s);
        }

        return number;
    }


}
