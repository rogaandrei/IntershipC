package Exercitii_din_fisierul_text.Curs6.Ex1;

class USB {

    public void transferPCToDevice(PC pc, Device device){

        String data;

        data = pc.load();

        device.store(data);

        System.out.println("PC -> Device " + data);

    }

    public void transferDeviceToPC(PC pc, Device device){

        String data;

        data = device.load();

        pc.store(data);

        System.out.println("Device -> PC " + data);

    }

}