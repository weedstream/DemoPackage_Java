package DemoPaket;

public class CD {
    String ukuran;
    long hargaCD;
    public CD(String ukuran,long hargaCD)
    {
        this.ukuran=ukuran;
        this.hargaCD=hargaCD;
    }
    public long getHargaCD()
    {
        return hargaCD;
    }
    public void cetakCD()
    {
        System.out.println("Ukuran CD : "+ukuran);
        System.out.println("Harga CD : Rp "+hargaCD);
        System.out.println();
    }
}
