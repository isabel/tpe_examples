/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.maps;

public class Personalnummer {
    private String nummer;

    @Override
    public String toString() {
        return "Personalnummer [" + nummer + "]";
    }

    public Personalnummer(String nummer) {
        super();
        this.nummer = nummer;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nummer == null) ? 0 : nummer.hashCode());
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
        Personalnummer other = (Personalnummer) obj;
        if (nummer == null) {
            if (other.nummer != null)
                return false;
        } else if (!nummer.equals(other.nummer))
            return false;
        return true;
    }


}
