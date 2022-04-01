public enum RomanNumerals {
    M(1000),CM(900),D(500),CD(400),C(100),XC(90),L(50),
    XL(40),X(10),IX(9),V(5),IV(4),I(1),II(2),III(3),
    VI(6), VII(7),VIII(8);

    private Integer value;

    RomanNumerals(int value) {this.value = value;}

    public Integer getValue() {return  this.value;}
}
