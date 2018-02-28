/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabrains.springbootstarter.controller;

import io.javabrains.springbootstarter.bean.Topic;
import io.javabrains.springbootstarter.service.TopicService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Master
 */
@RestController
public class TopicController {
    
    @Autowired
    private TopicService topicService;
    
    
    
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }
    
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getGivenTopic(id);
    }
    
    @RequestMapping(path = "/topics" , method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }
    
    @RequestMapping(path = "/topics/{id}" , method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id,topic);
    }
    
    @RequestMapping(path = "/topics/{id}" , method = RequestMethod.DELETE)
    public void deleteTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.deleteTopic(id);
    }
}
