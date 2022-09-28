package classes;
public class Classes {

    public static void main(String[] args) {
        // sınıflar referans tiptir
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        CustomerManager.delete();
        
        int sayi1 = 15;
        int sayi2 = 20;
        sayi2=sayi1;
        sayi1 =30;
        System.out.println(sayi2);
        
        //diziler referans tiptir
        int[] sayilar1 ={1,2,3};
        int [] sayilar2 = {7,8,9};
        sayilar2=sayilar1;
        sayilar1[0]= 35;
        System.out.println(sayilar2[0]);
    }
    
    
}
