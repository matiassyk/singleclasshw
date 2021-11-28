package com.company;

public class Course {
    private String name;
    private String topic;
    private String teacherName;
    private int participantNumber;
    public boolean hasParticipants;

    public Course (String name, String topic, String teacherName, int participantNumber)
    {
        this.name = name;
        this.topic= topic;
        this.teacherName = teacherName;
        this.participantNumber = participantNumber;
        this.hasParticipants = hasParticipants;
    }
    public String toString()
    {
        return "student: " + name + ", topic: " + topic + ", teacher: " + teacherName + ", participants: " + participantNumber;
    }

    public void setHasParticipants (boolean hasParticipants ) {
        if (participantNumber > 0)
            this.hasParticipants = true;
        else
            this.hasParticipants = false;
    }
    public String getName()
    {
        return name;
    }
    public String getTopic()
    {
        return topic;
    }
    public String getTeacherName()
    {
        return teacherName;
    }
    public int getParticipantNumber()
    {
        return participantNumber;
    }
}
