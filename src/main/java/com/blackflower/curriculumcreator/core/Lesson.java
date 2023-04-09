
package com.blackflower.curriculumcreator.core;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Lesson {

    // --------------- VARIABLE DECLERATIONS ------------------
    private String lessonName;
    private final String[] topics = new String[14];
    private Instructor instructor;
    private int lessonCount;

    public Lesson(String lessonName, Instructor instructor, int lessonCount) {
        this.lessonName = lessonName;
        this.instructor = instructor;
        this.lessonCount = lessonCount;
    }
    
    // --------------- VARIABLE DECLERATIONS END ------------------
    
     // --------------- ENCAPSULATE FIELDS ------------------
    public String getLessonName() { return lessonName; }
    public void setLessonName(String lessonName) { this.lessonName = lessonName; }
    
    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }
    
    public int getLessonCount(){ return lessonCount; }
    public void setLessonCount(int lessonCount){ this.lessonCount = lessonCount; }
    
    public String[] getTopics() { return topics; }
    
     // --------------- ENCAPSULATE FIELDS END ------------------
    
    
    public void addTopic(String topicName, int topicIndex){
        topics[topicIndex] = topicName;
    }    
    
    public void removeTopic(int topicIndex){
        topics[topicIndex] = "";
    }
    
    public ArrayList<Class> lessonClasses(){
        ArrayList<Class> result = new ArrayList<>();
        
        for (Class classe : Database.getClasses()) {
            if (classe.getLessons().contains(this)) {
                result.add(classe);
            }
        }
        return result;
    }
    
    @Override
    public String toString() {
        return getLessonName();
    }
    
    
}
