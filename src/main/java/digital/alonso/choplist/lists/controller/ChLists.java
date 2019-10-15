package digital.alonso.choplist.lists.controller;

import digital.alonso.choplist.lists.entities.ChList;
import digital.alonso.choplist.lists.repositories.ChListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class ChLists {

    @Autowired
    private ChListRepository chListRepository;

    @GetMapping(path="/lists")
    public List<ChList> getLists() {
        return chListRepository.findAll();
    }

    @GetMapping(path="/lists/{id}")
    public ChList getLists(@PathVariable Long id) {
        Optional<ChList> retrieve = chListRepository.findById(id);
        if(retrieve.isPresent()) {
            return retrieve.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path="/lists")
    @ResponseStatus(HttpStatus.CREATED)
    public ChList postLists(@RequestBody ChList chList) {
        return chListRepository.save(chList);
    }

    @PutMapping(path="/lists/{id}")
    public ChList postLists(@PathVariable Long id, @RequestBody ChList chList) {
        Optional<ChList> optionalChList = chListRepository.findById(id);
        if(optionalChList.isPresent()) {
            ChList savedChList = optionalChList.get();
            savedChList.setName(chList.getName());
            savedChList.setDescription(chList.getDescription());
            return chListRepository.save(savedChList);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping(path="/lists/{id}")
    public ChList patchLists(@PathVariable Long id, @RequestBody ChList chList) {
        Optional<ChList> optionalChList = chListRepository.findById(id);
        if(optionalChList.isPresent()) {
            ChList savedChList = optionalChList.get();
            if(chList.getName() != null)
                savedChList.setName(chList.getName());
            if(chList.getDescription() != null)
                savedChList.setDescription(chList.getDescription());
            return chListRepository.save(savedChList);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }


}
