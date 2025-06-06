package org.example.web.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.constants.TaskStatus;

@Getter
@Setter
@ToString
public class TaskRequest {
    private String title;
    private String description;
    private String dueDate;
    private TaskStatus status;
}

