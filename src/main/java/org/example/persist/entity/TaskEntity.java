package org.example.persist.entity;

import jakarta.persistence.Entity;
import lombok.*;
import org.example.constants.TaskStatus;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import jakarta.persistence.*;
import java.sql.Date;
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

    private Date dueDate;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Enumerated(value = EnumType.STRING)
    private TaskStatus status;
}

