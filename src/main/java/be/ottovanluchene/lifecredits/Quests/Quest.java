package be.ottovanluchene.lifecredits.Quests;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Quest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int userId;

    private String title;
    private String description;
    private int categoryId;
    private int projectId;
    private String link;
    private int priority;
    
    private LocalDate creationDate;
    private LocalDate dueDate;

}
