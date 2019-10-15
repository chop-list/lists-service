package digital.alonso.choplist.lists.repositories;

import digital.alonso.choplist.lists.entities.ChList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChListRepository extends JpaRepository<ChList,Long> {
}
