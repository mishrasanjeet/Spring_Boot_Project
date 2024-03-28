package TODO.Management.Project.TODO.Management.Project.ENTITY;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.batch.BatchDataSource;

import java.time.LocalDate;

@Entity
@Data
@RequiredArgsConstructor
public class Todo {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private int id;
    private String userName;
    private String Description;
    private LocalDate targateDate;
    private boolean isDone;

    public Todo(int id, String userName, String description, LocalDate targateDate, boolean isDone) {
        this.id = id;
        this.userName = userName;
        Description = description;
        this.targateDate = targateDate;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalDate getTargateDate() {
        return targateDate;
    }

    public void setTargateDate(LocalDate targateDate) {
        this.targateDate = targateDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
