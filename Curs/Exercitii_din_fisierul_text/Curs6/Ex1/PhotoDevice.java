package Exercitii_din_fisierul_text.Curs6.Ex1;

class PhotoDevice extends Device{

    public PhotoDevice(String information){

        super(information);

    }

    public void takePicture(){

        System.out.println("TakePicture");



    }

    public  String getDevice(Device device){

        String result="PhotoDevice";

        return result;

    }

    @Override
    public String toString () {
        return "PhotoDevice{}";
    }
}