package LandTract;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephensmac
 */
public class LandTract {
    private double length;
    private double width;
    private double area;
    
    public LandTract(double len, double wid) {
        this.length = len; 
        this.width = wid;
    }

    public LandTract(LandTract ltract) {
        this.length = ltract.getLength();
        this.width = ltract.getWidth();
    }


    //Length and Width
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    //Area
    public double getArea(){
        this.area = this.getLength() * this.getWidth();
        return area;
    }
    //Equals
    public boolean equals(LandTract ltract) {
            if (this.length == ltract.getLength() && this.width == ltract.getWidth()) {
                return true;
            } else {
                return false;
            }
        }

}