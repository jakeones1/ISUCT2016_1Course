/**
 * Created by jakeones on 22.05.2017.
 */

import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public Double calc (double x) {
        double d1 = Math.pow(x, 2);
        double d2 = d1 - 2.5;
        double d3 = Math.abs(d2);
        double d4 = Math.pow(d3, 1.0 / 4.0);

        double d5 = Math.log10(d1);
        double d6 = Math.pow(d5, 1.0 / 3.0);

        double d7 = d4 + d6;
        return d7;
    }

    public ArrayList<Double> calc (double xn, double xk, double xd) {
        ArrayList<Double> yRes = new ArrayList<Double>();
        for(double x = xn; x<= xk; x+=xd){
            double y = calc(x);
            yRes.add(y);
        }
        return yRes;
    }
}
