package digital.alonso.choplist.lists.repositories;

import digital.alonso.choplist.lists.entities.ChList;

import java.util.List;

public interface ChListRepository {

    List<ChList> getLists();

    ChList getChList(Long id);

    int getNumberOfChLists();

    Long createChList(ChList chList);

    int deleteChList(Long id);

    ChList updateChList(ChList chlist);
}
