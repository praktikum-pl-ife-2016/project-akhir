package pajak1;
public class SepedaMotor extends Kendaraan {

    public SepedaMotor(String nama, String nmrTnkb, String alamat, String merk, String jenis, String tahun, String nmrRangka, String warna, String bahanBakar, String warnaTnkb, int pajak, int tahunBayar) {
        super(nama, nmrTnkb, alamat, merk, jenis, tahun, nmrRangka, warna, bahanBakar, warnaTnkb, pajak, tahunBayar);
    }

    
    @Override
    public double getDenda() {
        return ((2016-getTahunBayar()))*(getPajakPokok()*0.25);
    }
}
