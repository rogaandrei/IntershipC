package Exercitii_din_fisierul_text.Curs6.Ex1;

class VideoDevice extends Device{

    private String producer;

    public VideoDevice(String information, String producer){

        super(information);

        this.producer = producer;

    }

    public void film(){

        System.out.println("Film");


    }

    public String getDevice(Device device){

        String result="VideoDevice";

        return result;

    }

}