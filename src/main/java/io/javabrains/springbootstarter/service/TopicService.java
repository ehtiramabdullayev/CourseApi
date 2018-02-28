package io.javabrains.springbootstarter.service;

import io.javabrains.springbootstarter.bean.Topic;
import io.javabrains.springbootstarter.repository.TopicRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Master
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> innerTopic = new ArrayList<>();
        Iterator<Topic> iterator = topicRepository.findAll().iterator();
        while (iterator.hasNext()) {
            Topic t = iterator.next();
            innerTopic.add(t);
        }
        return innerTopic;
    }

    public Topic getGivenTopic(String id) {
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.delete(id);
    }

}
