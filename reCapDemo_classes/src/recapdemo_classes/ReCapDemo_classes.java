package recapdemo_classes;

public class ReCapDemo_classes {

// dört islem yapan hesap makinesi
    public static void main(String[] args) {
        // TODO code application logic here
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(3,5);
        System.out.println(sonuc);
    }
    
}
