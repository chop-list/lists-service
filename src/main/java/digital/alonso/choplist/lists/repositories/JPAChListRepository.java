package digital.alonso.choplist.lists.repositories;

import digital.alonso.choplist.lists.entities.ChList;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class JPAChListRepository implements ChListRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ChList> getLists() {
        return entityManager.createQuery("select a from ChList a", ChList.class)
                .getResultList();
    }

    @Override
    public ChList getChList(Long id) {
        return null;
    }

    @Override
    public int getNumberOfChLists() {
        return 0;
    }

    @Override
    public Long createChList(String name) {
        return null;
    }

    @Override
    public int deleteChList(Long id) {
        return 0;
    }

    @Override
    public void updateChList(ChList chlist) {

    }
}
