package com.taehobpm.practice.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    private static TopicService ourInstance = new TopicService();

    private List<Topic> topics = new ArrayList<>(
                Arrays.asList(
                    new Topic("spring", "Spring Framework", "Spring Framework Description"),
                    new Topic("java", "Core Java", "Core Java Description"),
                    new Topic("javascript", "Javascript", "Javascript Description"))
    );


    public static TopicService getInstance() {
        return ourInstance;
    }

    private TopicService() {
    }

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        Iterator<Topic> iter = topicRepository.findAll().iterator();
        while(iter.hasNext()) {
            topics.add(iter.next());
        }
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void removeTopic(String id) {
        topicRepository.delete(id);
    }

}
