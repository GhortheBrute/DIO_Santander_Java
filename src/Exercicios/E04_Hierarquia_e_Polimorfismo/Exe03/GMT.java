package Exercicios.E04_Hierarquia_e_Polimorfismo.Exe03;

public enum GMT {
    GMT_MENOS_12(-12),
    GMT_MENOS_11(-11),
    GMT_MENOS_10(-10),
    GMT_MENOS_9(-9),
    GMT_MENOS_8(-8),
    GMT_MENOS_7(-7),
    GMT_MENOS_6(-6),
    GMT_MENOS_5(-5),
    GMT_MENOS_4(-4),
    GMT_MENOS_3(-3),
    GMT_MENOS_2(-2),
    GMT_MENOS_1(-1),
    GMT_0(0),
    GMT_MAIS_1(1),
    GMT_MAIS_2(2),
    GMT_MAIS_3(3),
    GMT_MAIS_4(4),
    GMT_MAIS_5(5),
    GMT_MAIS_6(6),
    GMT_MAIS_7(7),
    GMT_MAIS_8(8),
    GMT_MAIS_9(9),
    GMT_MAIS_10(10),
    GMT_MAIS_11(11),
    GMT_MAIS_12(12);

    private int offset;

    GMT(int offset) {
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    @Override
    public String toString() {
        return "GMT" + (offset >= 0 ? "+" : "") + offset;
    }
}
