package Nomer3;

public class Ksatria extends Penduduk{
    // constructor

    public Ksatria(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    // method pajak
    public double pajak(){
        return super.pendapatan * 0.18;
    }

    // method bayar
    public double bayar(){
        return super.pendapatan + this.pajak();
    }

    // method toString

    @Override
    public String toString() {
        return "Ksatria bernama '"+ super.nama+ "' harus bayar pajak sebanyak " +
                this.pajak() + " dari pendapatan sebanyak " + super.pendapatan;
    }
}
