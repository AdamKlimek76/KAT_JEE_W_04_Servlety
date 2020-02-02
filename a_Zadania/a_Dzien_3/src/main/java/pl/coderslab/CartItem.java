package pl.coderslab;

public class CartItem {
    String nazwa;
    Integer ilosc;
    Double cena;

    public CartItem(String nazwa, Integer ilosc, Double cena) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getIlosc() {
        return ilosc;
    }

    public void setIlosc(Integer ilosc) {
        this.ilosc = ilosc;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "nazwa='" + nazwa + '\'' +
                ", ilosc=" + ilosc +
                ", cena=" + cena +
                '}';
    }
}
