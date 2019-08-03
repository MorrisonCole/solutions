package com.morrison.hacker_rank.skills.java.datastructures.priorityqueue;

import java.util.*;

class Student implements Comparable<Student> {
    private final String name;
    private final double cgpa;
    private final int id;

    public Student(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        return Comparator
                .comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getName)
                .thenComparing(Student::getId)
                .compare(this, o);
    }
}

class Priorities {

    private static final PriorityQueue<Student> students = new PriorityQueue<Student>();

    public List<Student> getStudents(List<String> events) {
        for (String event : events) {
            String[] args = event.split(" ");
            switch (args[0]) {
                case "SERVED":
                    students.poll();
                    break;
                case "ENTER":
                    students.add(new Student(args[1], Double.valueOf(args[2]), Integer.valueOf(args[3])));
                    break;
            }
        }

        ArrayList<Student> output = new ArrayList<>();
        while (!students.isEmpty()) {
            output.add(students.poll());
        }
        return output;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}