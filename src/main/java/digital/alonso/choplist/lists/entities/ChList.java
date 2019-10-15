package digital.alonso.choplist.lists.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
public class ChList {

    @Id @Basic
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;

    @Basic
    @NotNull(message="Name is a mandatory field.")
    @NotEmpty(message = "Name is a mandatory field.")
    private String name;

    @Basic
    private String description;

    @Basic @UpdateTimestamp
    private LocalDateTime last_updated;

    @Basic @CreationTimestamp
    private LocalDateTime created;

    public ChList() {

    }

    public ChList(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("List(id:%d, name:%s)", id, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChList list = (ChList) o;

        return !(id != null ? !id.equals(list.id) : list.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
