package bai_22.thuc_hanh.trien_khai_adapter;

public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String path){
        long size = fileCalculator.calculateSize(path);
        System.out.println("Size: " + size);
    }
}