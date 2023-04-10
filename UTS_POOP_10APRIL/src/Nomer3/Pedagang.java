package Nomer3;

public class Pedagang extends Penduduk{
    public Pedagang(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    // method pajak
    public double pajak(){
        return super.pendapatan * 0.12;
    }

    // method bayar
    public double bayar(){
        return super.pendapatan + this.pajak();
    }

    // method toString

    @Override
    public String toString() {
        return "Pedagang bernama '"+ super.nama+ "' harus bayar pajak sebanyak " +
                this.pajak() + " dari pendapatan sebanyak " + super.pendapatan;
    }
}
