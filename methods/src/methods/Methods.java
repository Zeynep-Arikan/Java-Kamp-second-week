package methods;

public class Methods {

    public static void main(String[] args) {
        sayiBulmaca();
        
        
    }
    
    public static void sayiBulmaca(){
        int[] sayilar= new int[]{1,2,5,8,0,9};
        int aranacak = 2;
        boolean varMı=false;
        
        for(int sayi:sayilar){
            if(sayi==aranacak){
            varMı=true;
            break;}
        }
        String mesaj= "sayi mevcuttur"+aranacak;
        if(varMı){
            mesajVer(mesaj);
        }
        else{
            mesajVer("sayi mevcut değildir"+aranacak);
        }

    private static void mesajVer(String mesaj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

