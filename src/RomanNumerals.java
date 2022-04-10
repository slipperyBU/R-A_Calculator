public enum RomanNumerals {
    M(1000),CM(900),D(500),CD(400),C(100),XC(90),L(50),
    XL(40),X(10),IX(9),V(5),IV(4),I(1),II(2),III(3),
    VI(6), VII(7),VIII(8);

    private final Integer value;

    RomanNumerals(int value) {
        this.value = value;
    }

    public Integer getValue() {return this.value;}

    static int romanToNumber(String roman) throws CalculatorException {
        switch (roman) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                throw new CalculatorException("Illegal Roman number");
        }
    }
}
