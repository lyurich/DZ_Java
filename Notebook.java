import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private String model;

    private int amountRAM;
    private String os;
    private int diagonal;


    public Notebook(String model, int amountRAM, String os, int diagonal) {
        this.model = model;
        this.amountRAM = amountRAM;
        this.os = os;
        this.diagonal = diagonal;

    }

    public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("model");
        list.add("amountRAM");
        list.add("os");
        list.add("diagonal");


        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + model + "): " +
                "количество опретивной памяти:" + amountRAM +
                ", операционная система: " + os + '\'' +
                ", диагональ экрана: " + diagonal;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int price) {
        this.diagonal = diagonal;
    }


}