/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeswithattributes;

/**
 *
 * @author CASPER
 */
public class Product {
    
    //constructor
    public Product(){
        System.out.println("yapıcı blok yani constructor çalıştı");
    }
    
      // attribute veya field
    String _name;
    private int _id;
    private String _description;
    private double _price;
    private int _stockAmount;
        
    public int getId(){ //id yi sadece okuyabilir değiştiremez
        return _id;
    }
    public void setId(int id){
        //this.id bu classtaki id demek
        this._id=id;
    }

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void setName(String _name) {
        this._name = _name;
    }

    /**
     * @return the _description
     */
    public String getDescription() {
        return _description;
    }

    /**
     * @param _description the _description to set
     */
    public void setDescription(String _description) {
        this._description = _description;
    }

    /**
     * @return the _price
     */
    public double getPrice() {
        return _price;
    }

    /**
     * @param _price the _price to set
     */
    public void setPrice(double _price) {
        this._price = _price;
    }

    /**
     * @return the _stockAmount
     */
    public int getStockAmount() {
        return _stockAmount;
    }

    /**
     * @param _stockAmount the _stockAmount to set
     */
    public void setStockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }
    
    
}
