package Latihan3;

public class EncapSiswa {
    private String name;
    private String addres;
    private int absen;

    public int getAbsen(){
        return absen;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return addres;
    }

    public void setAbsen(int newAbsen){
        absen=newAbsen;
    }

    public void setName(String newName){
        name=newName;
    }

    public void setAddress(String newAddres){
        addres=newAddres;
    }
}
