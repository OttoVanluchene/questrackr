package be.ottovanluchene.questrackr.questrackr.Quests;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class QuestService {

    private final QuestRepository questRepository;

    public QuestService(QuestRepository questRepository) {
        this.questRepository = questRepository;
    }
    
    public Optional<Quest> getQuest(int id) {
        return questRepository.findById(id);
    }

    
    public List<Quest> getAllQuests() {
        return questRepository.findAll();
    }


    public Quest createQuest(Quest quest) {
        return questRepository.save(quest);
    }


    public Optional<Quest> updateQuest(Quest quest) {
        questRepository.save(quest);
        return Optional.of(quest);
    }

    public boolean deleteQuest(int id) {
        try {
            questRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
