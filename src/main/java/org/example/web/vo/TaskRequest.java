package org.example.web.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.constants.TaskStatus;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class TaskRequest {
    private String title;
    private String description;
    private LocalDate dueDate;
    private TaskStatus status;
}

