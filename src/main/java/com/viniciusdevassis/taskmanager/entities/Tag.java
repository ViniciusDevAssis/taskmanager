package com.viniciusdevassis.taskmanager.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_tags")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Tag {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false, unique = true, updatable = false)
    private String name;
}
