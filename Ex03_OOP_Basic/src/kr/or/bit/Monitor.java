package kr.or.bit;


public class Monitor {
    // 액정, 거치대, 브랜드, 버튼(의 개수)
    private String display;
    private String stand;
    private String brand;
    private int button;
    
    public Monitor(String display, String stand, String brand,
            int button) {
        this.display = display;
        this.stand = stand;
        this.brand = brand;
        this.button = button;
                
        
    }
    
    public String getDisplay() {
        return display;
    }
    public void setDisplay(String display) {
        this.display = display;
    }
    public String getStand() {
        return stand;
    }
    public void setStand(String stand) {
        this.stand = stand;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getButton() {
        return button;
    }
    public void setButton(int button) {
        this.button = button;
    }
    
    
    
}