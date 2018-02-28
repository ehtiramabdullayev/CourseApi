/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabrains.springbootstarter.controller;

import io.javabrains.springbootstarter.bean.Course;
import io.javabrains.springbootstarter.bean.Topic;
import io.javabrains.springbootstarter.service.CourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Master
 */
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/topics/{topicId}/courses", method = RequestMethod.GET)
    public List<Course> getAllCourses(@PathVariable String topicId) {
        return courseService.getAllCourses(topicId);
    }
    
    @RequestMapping("topics/{topicId}/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return courseService.getGivenCourse(courseId);
    }

    @RequestMapping(path = "topics/{topicId}/courses", method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    @RequestMapping(path = "topics/{topicId}/courses/{courseId}", method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course,
            @PathVariable String topicId,
            @PathVariable String courseId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(path = "/topics/{topicId}/courses/{courseId}", method = RequestMethod.DELETE)
    public void deleteCourse(@RequestBody Course course, @PathVariable String courseId) {
        courseService.deleteCourse(courseId);
    }
}
