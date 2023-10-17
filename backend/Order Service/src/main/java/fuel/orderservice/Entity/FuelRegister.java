package fuel.orderservice.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "fuel_station")
public class FuelRegister {

    @Id
    @Column(name = "st_id")
    private int stId;

    @Column(name = "st_name")
    private String stName;

    @Column(name = "st_number")
    private int stNumber;

    @Column(name = "st_email")
    private String stEmail;

    @Column(name = "st_address")
    private String stAddress;

    @Column(name = "st_province")
    private String stProvince;

    @Column(name = "st_city")
    private String city;

    @Column(name = "is_registered")
    private int isRegistered;

    @Column(name = "st_create_date")
    @Temporal(TemporalType.DATE)
    private Date stStartDate;

    @PrePersist
    private void onCreate(){
        stStartDate=new Date();
    }

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getStNumber() {
        return stNumber;
    }

    public void setStNumber(int stNumber) {
        this.stNumber = stNumber;
    }

    public String getStEmail() {
        return stEmail;
    }

    public void setStEmail(String stEmail) {
        this.stEmail = stEmail;
    }

    public String getStAddress() {
        return stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress;
    }

    public String getStProvince() {
        return stProvince;
    }

    public void setStProvince(String stProvince) {
        this.stProvince = stProvince;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getIsRegistered() {
        return isRegistered;
    }

    public void setIsRegistered(int isRegistered) {
        this.isRegistered = isRegistered;
    }

    public Date getStStartDate() {
        return stStartDate;
    }

    public void setStStartDate(Date stStartDate) {
        this.stStartDate = stStartDate;
    }

    @Override
    public String toString() {
        return "FuelRegister{" +
                "stId=" + stId +
                ", stName='" + stName + '\'' +
                ", stNumber=" + stNumber +
                ", stEmail='" + stEmail + '\'' +
                ", stAddress='" + stAddress + '\'' +
                ", stProvince='" + stProvince + '\'' +
                ", city='" + city + '\'' +
                ", isRegistered=" + isRegistered +
                ", stStartDate=" + stStartDate +
                '}';
    }
}

