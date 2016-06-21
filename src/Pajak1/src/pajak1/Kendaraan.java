package pajak1;

public abstract class Kendaraan {

    private String Nama = null;
    private String nmrTNKB = null;
    private String Alamat = null;
    private String Merk = null;
    private String Jenis = null;
    private String Tahun = null;
    private String NmrRangka = null;
    private String Warna = null;
    private String BahanBakar = null;
    private String WarnaTNKB = null;
    private int PajakPokok = 0, TahunBayar = 0;

    Kendaraan(String nama, String nmrTnkb, String alamat, String merk, String jenis, String tahun, String nmrRangka, String warna, String bahanBakar, String warnaTnkb, int pajak, int tahunBayar) {
        this.Nama = nama;
        this.nmrTNKB = nmrTnkb;
        this.Alamat = alamat;
        this.Merk = merk;
        this.Jenis = jenis;
        this.Tahun = tahun;
        this.NmrRangka = nmrRangka;
        this.Warna = warna;
        this.BahanBakar = bahanBakar;
        this.WarnaTNKB = warnaTnkb;
        this.PajakPokok = pajak;
        this.TahunBayar = tahunBayar;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void setNmrTnkb(String tnkb) {
        this.nmrTNKB = tnkb;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }

    public void setMerk(String merk) {
        this.Merk = merk;
    }

    public void setJenis(String jenis) {
        this.Jenis = jenis;
    }

    public void setTahun(String tahun) {
        this.Tahun = tahun;
    }

    public void setNmrRangka(String nmrRangka) {
        this.NmrRangka = nmrRangka;
    }

    public void setWarna(String warna) {
        this.Warna = warna;
    }

    public void setBahanBakar(String bahanBakar) {
        this.BahanBakar = bahanBakar;
    }

    public void setWarnaTnkb(String warnaTnkb) {
        this.WarnaTNKB = warnaTnkb;
    }

    public void setPajakPokok(int pajak) {
        this.PajakPokok = pajak;
    }

    public void setTahunBayar(int thnBayar) {
        this.TahunBayar = thnBayar;
    }

    public String getNama() {
        return Nama;
    }

    public String getNomorTnkb() {
        return nmrTNKB;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getMerk() {
        return Merk;
    }

    public String getJenis() {
        return Jenis;
    }

    public String getTahun() {
        return Tahun;
    }

    public String getNmrRangka() {
        return NmrRangka;
    }

    public String getWarna() {
        return Warna;
    }

    public String getBahanBakar() {
        return BahanBakar;
    }

    public String getWarnaTnkb() {
        return WarnaTNKB;
    }

    public int getTahunBayar() {
        return TahunBayar;
    }

    public int getPajakPokok() {
        return PajakPokok;
    }

    public abstract double getDenda();

    public double getTotalBayar() {
        return ((2016 - TahunBayar) * PajakPokok) + getDenda();
    }

    public String displayMessage() {
        return "\t         DATA PEMILIK KENDARAAN\n=============================================================\nNama\t: " + Nama
                + "\nNomor TNKB\t: " + nmrTNKB
                + "\nAlama\t: " + Alamat
                + "\nMerk\t: " + Merk
                + "\nJenis\t: " + Jenis
                + "\nTahun\t: " + Tahun
                + "\nNomor Rangka : " + NmrRangka
                + "\nWarna\t: " + Warna
                + "\nBahan Bakar\t: " + BahanBakar
                + "\nWarna TNKB\t: " + WarnaTNKB
                + "\n=============================================================\n\t                  DATA PAJAK\n=============================================================\nTahun pembayaran terakhir : " + TahunBayar
                + "\nPajak pokok\t: Rp " + PajakPokok
                + "\nDenda\t: Rp " + getDenda()
                + "\nTotal bayar\t: Rp " + getTotalBayar()
                + "\n=============================================================";
    }
}