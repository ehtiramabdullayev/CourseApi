package io.javabrains.springbootstarter.repository;

import io.javabrains.springbootstarter.bean.Course;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Master
 */

public interface CourseRepository extends CrudRepository<Course, String>{

    public List<Course> findByName(String name);
    public List<Course> findByDescription(String description);
    public List<Course> findByTopicId(String topicId);


}
