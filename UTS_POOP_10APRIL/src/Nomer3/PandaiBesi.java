package Nomer3;

public class PandaiBesi extends Penduduk{
    public PandaiBesi(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    // method pajak
    public double pajak(){
        return super.pendapatan * 0.06;
    }

    // method bayar
    public double bayar(){
        return super.pendapatan + this.pajak();
    }

    // method toString

    @Override
    public String toString() {
        return "Pandai besi bernama '"+ super.nama+ "' harus bayar pajak sebanyak " +
                this.pajak() + " dari pendapatan sebanyak " + super.pendapatan;
    }
}
