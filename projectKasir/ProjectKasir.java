package projectuap;
import db.DBHelper;

public class ProjectUAP {

    public static void main(String[] args) {
        Barang brg = new Barang("Abc123", "2022-10", "Minyak", 100000, 20, 2000, "Sembako");
        BarangModel bm = new BarangModel();
        bm.addBarang(brg);
    }
    
}
