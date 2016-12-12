package com.sulaimanms.dicoding3fragementtab;

/**
 * Created by Sulaiman MS on 12/12/2016.
 */

public class Lingkaran {
    double r;

    public Lingkaran(double radius) {
        this.r = radius;
    }

    public Lingkaran() {
        this.r = getRadius();
    }

    public double hitungLuas() {
        return (3.14 * r);
    }
    double getRadius() {
        return r;
    }

}
