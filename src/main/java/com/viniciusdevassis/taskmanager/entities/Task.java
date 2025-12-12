package com.viniciusdevassis.taskmanager.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.viniciusdevassis.taskmanager.enums.TaskStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_tasks")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Task {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private String description;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @Column(nullable = false, updatable = false)
    private LocalDate createdAt = LocalDate.now();

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate deadline;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate completedAt;

    @Enumerated(EnumType.STRING)
    private TaskStatus status = TaskStatus.PENDING;

    @JoinColumn(name = "task_id")
    @OneToMany
    @JsonIgnore
    private List<Tag> tags = new ArrayList<>();
}
