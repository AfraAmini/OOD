import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee extends SystemUser{
    private Integer idNumber;

    public Employee() {
    }

    public Employee(Integer idNumber) {
        this.idNumber = idNumber;
    }

    @Id
    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }
}