package Nomer1;

public class Item{
    private int harga;
    private String nama;
    private String rank;
    int quantity;

    // constructor

    public Item(int harga, String nama, String rank, int quantity) {
        this.harga = harga;
        this.nama = nama;
        this.rank = rank;
        this.quantity = quantity;
    }
    // getter and setter

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // method see allitems
    static Item[] arrItems;
    static int index = 0;
//    static void seeAllItems(){
//        arrItems[index] =
//        for (int i = 0; i < ; i++) {
//
//        }
//    }

}
