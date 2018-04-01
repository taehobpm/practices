package com.taehobpm.practice.courseapidata.topic;

import org.springframework.data.repository.CrudRepository;

// This is the repository interface.
// This will be AUTO IMPLEMENTED by Spring into a Bean called topicRepository
// CRUD refers Create, Read, Update, Delete
public interface TopicRepository extends CrudRepository<Topic, String> {

}
