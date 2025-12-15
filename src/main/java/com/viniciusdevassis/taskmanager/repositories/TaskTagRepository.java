package com.viniciusdevassis.taskmanager.repositories;

import com.viniciusdevassis.taskmanager.entities.TaskTag;
import com.viniciusdevassis.taskmanager.entities.TaskTagId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskTagRepository extends JpaRepository<TaskTag, TaskTagId> {
}
