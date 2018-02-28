package io.javabrains.springbootstarter.repository;
import  io.javabrains.springbootstarter.bean.Topic;
import  org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Master
 */

public interface TopicRepository extends CrudRepository<Topic, String>{
    //CrudRepository
}
