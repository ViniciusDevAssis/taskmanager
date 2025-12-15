package com.viniciusdevassis.taskmanager.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_task_tags")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TaskTag {

    @EmbeddedId
    @EqualsAndHashCode.Include
    private TaskTagId id;

    @ManyToOne
    @MapsId("taskId")
    @JoinColumn(name = "task_id")
    private Task task;

    @ManyToOne
    @MapsId("tagId")
    @JoinColumn(name = "tag_id")
    private Tag tag;
}
