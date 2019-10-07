package digital.alonso.choplist.lists.controller;

import digital.alonso.choplist.lists.entities.ChList;
import digital.alonso.choplist.lists.repositories.ChListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChLists {

    @Autowired
    private ChListRepository chListRepository;

    @GetMapping(path="/lists")
    public List<ChList> getLists() {
        return chListRepository.getLists();
    }

    @GetMapping(path="/lists/{id}")
    public ChList getLists(@PathVariable Long id) {
        return chListRepository.getChList(id);
    }

    @PostMapping(path="/lists")
    public Long postLists(@RequestBody ChList chList) {

        return chListRepository.createChList(chList);
    }

    @PatchMapping(path="/lists")
    public void patchLists(@RequestBody ChList chList) {

        chListRepository.updateChList(chList);
    }


}
