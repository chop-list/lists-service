package digital.alonso.choplist.lists.controller;

import digital.alonso.choplist.lists.entities.ChList;
import digital.alonso.choplist.lists.repositories.ChListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChLists {

    @Autowired
    private ChListRepository chListRepository;

    @GetMapping(path="/lists")
    public List<ChList> getLists() {
        return chListRepository.getLists();
    }
}
