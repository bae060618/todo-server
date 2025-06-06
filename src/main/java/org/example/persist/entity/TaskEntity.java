package org.example.persist.entity;

import lombok.*;
import org.example.constants.TaskStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@DynamicInsert
@DynamicUpdate
@Entity(name = "TASK")
@NoArgsConstructor
@AllArgsConstructor
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Enumerated(value = EnumType.STRING)
    private TaskStatus status;
}

