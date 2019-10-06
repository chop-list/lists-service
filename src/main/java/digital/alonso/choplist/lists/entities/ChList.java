package digital.alonso.choplist.lists.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ChList {

    @Id
    public Long id;

    private String name;

    private String description;

//    private LocalDateTime created;

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
