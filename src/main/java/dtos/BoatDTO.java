package dtos;

import entities.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatDTO {
    private int id;
    private String brand;
    private String make;
    private String name;
    private String image;


    public BoatDTO(Boat rm) {
        this.id = rm.getId();
        this.brand = rm.getBrand();
        this.make = rm.getMake();
        this.name = rm.getName();
        this.image = rm.getImage();
    }

    public BoatDTO() {
    }

    public BoatDTO(BoatDTO boatDTO) {
        this.brand = brand;
        this.make = make;
        this.name = name;
        this.image = image;
    }

    public BoatDTO(String brand, String make, String name, String image) {
        this.brand = brand;
        this.make = make;
        this.name = name;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public static List<BoatDTO> getDtos(List<Boat> rms) {
        List<BoatDTO> rmdtos = new ArrayList();
        rms.forEach(rm -> rmdtos.add(new BoatDTO(rm)));
        return rmdtos;
    }
}
