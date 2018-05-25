import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class SystemUser {
    private Integer idNumber;

    public SystemUser() {
    }

    public SystemUser(Integer idNumber) {
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

