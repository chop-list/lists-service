package digital.alonso.choplist.lists.repositories;

import digital.alonso.choplist.lists.entities.ChList;

import java.math.BigDecimal;
import java.util.List;

public interface ChListRepository {

    List<ChList> getLists();

    ChList getChList(Long id);

    int getNumberOfChLists();

    Long createChList(String name);

    int deleteChList(Long id);

    void updateChList(ChList chlist);
}
