package Uber.DTO;

public class DriverDAO {

    private String name;
    private String email;
    private String vehicleNo;
    private String licenseNo;

    public DriverDAO(String name, String email, String vehicleNo, String licenseNo) {
        this.name = name;
        this.email = email;
        this.vehicleNo = vehicleNo;
        this.licenseNo = licenseNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
}
