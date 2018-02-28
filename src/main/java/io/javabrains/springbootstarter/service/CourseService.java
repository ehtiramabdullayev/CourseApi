package io.javabrains.springbootstarter.service;

import io.javabrains.springbootstarter.bean.Course;
import io.javabrains.springbootstarter.repository.CourseRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Master
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> innerCourse = new ArrayList<>();
        Iterator<Course> iterator = courseRepository.findByTopicId(topicId).iterator();
        while (iterator.hasNext()) {
            Course t = iterator.next();
            innerCourse.add(t);
        }
        return innerCourse;
    }

    public Course getGivenCourse(String id) {
        return courseRepository.findOne(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.delete(id);
    }

}
