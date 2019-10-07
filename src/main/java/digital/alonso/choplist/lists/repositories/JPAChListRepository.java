package digital.alonso.choplist.lists.repositories;

import digital.alonso.choplist.lists.entities.ChList;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository @Transactional
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
        return entityManager.find(ChList.class, id);
    }

    @Override
    public int getNumberOfChLists() {
        Long result = (Long) entityManager.createQuery("select count(a.id) from ChList a").getSingleResult();
        return result.intValue();
    }

    @Override
    public Long createChList(ChList chList) {
        entityManager.persist(chList);
        return chList.getId();
    }

    @Override
    public int deleteChList(Long id) {
        return 0;
    }

    @Override
    public ChList updateChList(ChList chList) {
        entityManager.merge(chList);
        return chList;
    }
}
