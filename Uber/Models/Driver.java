package Uber.Models;

public class Driver {

    private String name;
    private String driverId;
    private String email;
    private String licenseNo;
    private String vehicleNo;
    private Boolean isAvailable;
    private Coordinates location;
    private Bookings currentBooking;

    public Driver() {
        this.isAvailable = true;
        this.currentBooking = null;
    }

    public Bookings getCurrentBooking() {
        return currentBooking;
    }

    public void setCurrentBooking(Bookings currentBooking) {
        this.currentBooking = currentBooking;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Coordinates getLocation() {
        return location;
    }

    public void setLocation(Coordinates location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

}
