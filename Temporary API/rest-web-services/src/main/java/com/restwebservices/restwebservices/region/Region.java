package com.restwebservices.restwebservices.region;

public class Region {

    private Integer id;
    private String name;
 //   private LocalDate birthdate;
    private double lattitude;

    public Region(Integer id, String name, double lattitude) {
        super();
        this.id = id;
        this.name = name;
        this.lattitude= lattitude;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getlattitude() {
        return lattitude;
    }

    public void setlattitude(double lattitude) {
        this.lattitude = lattitude;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lattitude=" + lattitude +
                '}';
    }
}
