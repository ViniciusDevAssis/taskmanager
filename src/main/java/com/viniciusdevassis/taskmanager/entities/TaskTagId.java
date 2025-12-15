package com.viniciusdevassis.taskmanager.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class TaskTagId {

    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "tag_id")
    private Long tagId;
}

