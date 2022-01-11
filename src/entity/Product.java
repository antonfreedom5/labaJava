package entity;

public class Product {
    private Long id;
    private String name;
    private String type;
    private Storage availability;
    private Long costPerDay;
    private String quality;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Storage getAvailability() {
        return availability;
    }

    public void setAvailability(Storage availability) {
        this.availability = availability;
    }

    public Long getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Long costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
