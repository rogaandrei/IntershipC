package Exercitii_din_fisierul_text.Curs6.Ex1;



abstract class Device{

    private String information;

    public Device(){

        information = "";

    }

    public Device(String information){

        this.information = information;

    }

    public void store(String information){

        this.information = information;

    }

    public String load(){

        return information;

    }

    public abstract  String getDevice(Device device);

}