/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.unittest;

public class KomplexeZahl {

    /**
     * Realanteil.
     */
    private double re;

    /**
     * Imaginäranteil.
     */
    private double im;

    /**
     * Erzeugt eine neue Komplexe Zahl.
     *
     * @param re Realanteil
     * @param im Imaginaeranteil
     */
    public KomplexeZahl(double re, double im) {
       this.re = re;
       this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public KomplexeZahl addiere(KomplexeZahl z) {
        return new KomplexeZahl(re + z.re, im + z.im);
    }

    public KomplexeZahl subtrahiere(KomplexeZahl z) {
        return new KomplexeZahl(re - z.re, im - z.im);
    }

    public KomplexeZahl multipliziere(KomplexeZahl z) {
        return new KomplexeZahl(re * z.re - im * z.im, re * z.im + im * z.re);
    }

    public KomplexeZahl dividiere(KomplexeZahl z) {
        return new KomplexeZahl(
                (re * z.re + im * z.im) / (z.re * z.re + z.im * z.im),
                (im * z.re - re * z.im) / (z.re * z.re + z.im * z.im));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(im);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(re);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        KomplexeZahl other = (KomplexeZahl) obj;
        if (Double.doubleToLongBits(im) != Double.doubleToLongBits(other.im))
            return false;
        if (Double.doubleToLongBits(re) != Double.doubleToLongBits(other.re))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("(%f, %fi)", re, im);
    }
}
