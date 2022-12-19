package projectuap;
import db.DBHelper;

public class ProjectUAP {

    public static void main(String[] args) {
//        Barang brg = new Barang("Abc123", "2022-10", "Minyak", 100000, 20, 2000, "Sembako");
//        BarangModel bm = new BarangModel();
//        bm.addBarang(brg);
        
        Makanan mkn = new Makanan(1, "Mie Goreng", 3400, 4, 800, 90);
        MakananModel mm = new MakananModel();
        mm.addMakanan(mkn);
    }
    
}
