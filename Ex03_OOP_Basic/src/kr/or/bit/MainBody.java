package kr.or.bit;

public class MainBody {
    // 가격, 브랜드, 시리얼넘버, 씨피유개수, 메모리용량
    private int price;
    private String brand;
    private int serialNumber;
    private int cpuNumber;
    private int memory;

    private boolean power;
    
    public MainBody(int price, String brand, int serialNumber, int cpuNUmber, int memory, boolean power) {
    	this.price = price;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.cpuNumber = cpuNumber;
        this.memory = memory;      
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getCpuNumber() {
        return cpuNumber;
    }

    public void setCpuNumber(int cpuNumber) {
        this.cpuNumber = cpuNumber;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
    
}
