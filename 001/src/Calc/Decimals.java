package Calc;

import java.text.DecimalFormat;

class Decimals {
    public static void main(String[] args) {
        float f = 125.0f;
        DecimalFormat form = new DecimalFormat("0.00");
        System.out.println(form.format(f));
    }
}
