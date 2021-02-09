// 키보드 설계도

package kr.or.bit;

public class Keyboard {
    // 버튼(을 어떻게 눌렀는지), led색상, 브랜드
    private String button;
    private String led;
    private String brand;
    
    public Keyboard(String button, String led, String brand) {
        this.button = button;
        this.led = led;
        this.brand = brand;
        
    }


	public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getLed() {
        return led;
    }

    public void setLed(String led) {
        this.led = led;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}