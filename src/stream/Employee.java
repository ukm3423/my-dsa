package stream;

public class Employee {
    private String empId; 
    private String name; 
    private String email;
    private Long phone; 
    private Double salary;
    private String address;
    private Boolean isActive; 


    public Employee() {
    }

    public Employee(String empId, String name, String email, Long phone, Double salary, String address, Boolean isActive) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.address = address;
        this.isActive = isActive;
    }


    public String getEmpId() {
        return this.empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return this.phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean isIsActive() {
        return this.isActive;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }


    @Override
    public String toString() {
        return "{" +
            " empId='" + getEmpId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", phone='" + getPhone() + "'" +
            ", salary='" + getSalary() + "'" +
            ", address='" + getAddress() + "'" +
            ", isActive='" + isIsActive() + "'" +
            "}";
    }


    
}
