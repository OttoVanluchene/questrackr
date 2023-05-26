package be.ottovanluchene.questrackr.questrackr.Quests;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



/*
 * This is the controller for the Quests REST service with all the CRUD operations.
 * URL mapping: /quests
 */

@RestController
@RequestMapping("/quests")
public class QuestController {

    private final QuestService questService;

    public QuestController(QuestService questService) {
        this.questService = questService;
    }
   
    @GetMapping("/{id}")
    public ResponseEntity<Quest> getQuestById(@PathVariable int id) {
        Optional<Quest> quest = questService.getQuest(id);
        return quest.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Quest>> getAllQuests() {
        List<Quest> quests = questService.getAllQuests();
        return ResponseEntity.ok(quests);
    }

    @PostMapping
    public ResponseEntity<Quest> createQuest(@RequestBody Quest quest) {
        Quest createdQuest = questService.createQuest(quest);
        return ResponseEntity.created(URI.create("/quests/" + createdQuest.getId())).body(createdQuest);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Quest> updateQuest(@RequestBody Quest quest) {
        Optional<Quest> updatedQuest = questService.updateQuest(quest);
        return updatedQuest.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuest(@PathVariable int id) {
        boolean deleted = questService.deleteQuest(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    } 
    
}
