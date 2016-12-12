package com.sulaimanms.dicoding3fragementtab;

/**
 * Created by Sulaiman MS on 12/12/2016.
 */

public class Tabung extends Lingkaran {
    double tinggi;

    public Tabung(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
    }


    @Override
    public double hitungLuas() {
        return (2 * 3.14 * r * (r + tinggi));
    }
}
