
public class VVIP extends KamarKost {
    boolean ac,tv,airpanas;
    int tambahan,harga=3600000;
    public String ac(){
        return "- AC";
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
    public String ukuran() {
        return "4 X 4";
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
        return "- Wifi";
    }

    public String kmdalam() {
        return "- Kamar mandi dalam";
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

    @Override
    public String kmluar() {
        return"";
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    
}
