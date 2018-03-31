package com.taehobpm.practice.courseapidata.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    private static CourseService ourInstance = new CourseService();
    private List<Course> courses;

    public static CourseService getInstance() {
        return ourInstance;
    }

    private CourseService() {
    }

    public List<Course> getAllCourses(String topicId) {
        return courseRepository.findCourseByTopicId(topicId);
    }

    public Course getCourse(String courseid) {
        return courseRepository.findOne(courseid);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(String coureseid, Course course) {
        courseRepository.save(course);
    }

    public void removeCourse(String courseid) {
        courseRepository.delete(courseid);
    }

}
