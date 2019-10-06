package digital.alonso.choplist.lists.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class ChList {

    @Id @Basic
    public Long id;

    @Basic
    private String name;

    @Basic
    private String description;

    @Basic @UpdateTimestamp
    private LocalDateTime last_updated;

    @Basic @CreationTimestamp
    private LocalDateTime created;

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
