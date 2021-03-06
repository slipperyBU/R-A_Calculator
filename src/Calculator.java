public class Calculator extends Search {
    static int num1, num2, result;

    public static int calculate(int num1, char operator, int num2) throws CalculatorException {

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break ;
            case '-':
                result = num1 - num2;
            break;
            case '*':
                result = num1 * num2;
            break;
            case '/':
                try {
                    result = num1 / num2;
                } catch (ArithmeticException e) {
                    System.out.println("Exception " + e);
                    break;
                }
                break;
            default:
                throw new CalculatorException("Operator is not found.");
        }
        return result;
    }

    public static String intToRoman (int number) throws CalculatorException {
        StringBuilder romanVal = new StringBuilder();
        for (RomanNumerals rs: RomanNumerals.values()){
            while(number >= rs.getValue()) {
                romanVal.append(rs.toString());
                number -= rs.getValue();
            }
        }
        return romanVal.toString();
    }

        public static void basic() throws CalculatorException {
            String valueCh = String.valueOf(charArray);
            String[] blocks = valueCh.split("[+-/*]");

            if (blocks.length > 2) {
                throw new CalculatorException("Too much characters");
            }
            String op1 = blocks[0];
            String op2 = blocks[1];
            String op3 = op2.trim();

            if (isNumeric(op1) && isNumeric(op3)) {
                num1 = Integer.parseInt(op1);
                num2 = Integer.parseInt(op3);
                if ((num1 <= 10 && num1 >= 1) && (num2 <= 10 && num2 >= 1)) {
                    result = calculate(num1, operation, num2);
                    System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
                } else{
                    throw new CalculatorException("Input is invalid. Try again.");
                }
            } else {
                num1 = RomanNumerals.romanToNumber(op1);
                num2 = RomanNumerals.romanToNumber(op3);

                if ((num1 <= 10 && num1 >= 1) && (num2 <= 10 && num2 >= 1))  {
                    result = calculate(num1, operation, num2);
                    if(result < 0) {
                        throw new CalculatorException("There are no negative numbers in Roman Numeral System.");
                    }
                    String resultRoman =intToRoman(result);
                    String romanNum1 = intToRoman(num1);
                    String romanNum2= intToRoman(num2);
                    System.out.println(romanNum1 + " " + operation + " " + romanNum2 + " = " + resultRoman);
                } else{
                    throw new CalculatorException("Input is invalid. Try again.");
                }
            }

        }
    private static boolean isNumeric(String str) {
        try {
            int k = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}

