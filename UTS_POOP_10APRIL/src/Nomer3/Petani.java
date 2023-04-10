package Nomer3;

public class Petani extends Penduduk{
    public Petani(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    // method pajak
    public double pajak(){
        return super.pendapatan * 0.03;
    }

    // method bayar
    public double bayar(){
        return super.pendapatan + this.pajak();
    }

    // method toString

    @Override
    public String toString() {
        return "Petani bernama '"+ super.nama+ "' harus bayar pajak sebanyak " +
                this.pajak() + " dari pendapatan sebanyak " + super.pendapatan;
    }
}
