public class Reguler extends KamarKost {
    boolean ac,tv,airpanas;
    int tambahan,harga=1500000;
    public String ukuran() {
        return "3 X 3";
    }

    public String lemari() {
        return "- Lemari";
    }

    public String kasur() {
        return "- Kasur";
    }

    public String meja() {
        return "- Meja & Kursi";
    }

    public String wifi() {
        return "- Free Wifi";
    }

    public String kmdalam() {
        return "";
    }

    public String kmluar() {
        return "- Kamar Mandi Luar";
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isAirpanas() {
        return airpanas;
    }

    public void setAirpanas(boolean airpanas) {
        this.airpanas = airpanas;
    }
    
    public int harga() {
        return harga+tambahan;
    }
    public int tambahan() {
        if(isTv()==true){
            tambahan+=300000;
        }
        if(isAc()==true){
            tambahan+=600000;
        }
        return tambahan;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
