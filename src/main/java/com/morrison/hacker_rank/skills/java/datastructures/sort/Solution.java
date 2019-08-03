package com.morrison.hacker_rank.skills.java.datastructures.sort;

import java.util.*;

class Student implements Comparable<Student> {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        int comparedCgpa = Double.compare(o.getCgpa(), cgpa);
        if (comparedCgpa == 0) {
            int comparedNames = fname.compareTo(o.getFname());
            if (comparedNames == 0) {
                return Integer.compare(o.getId(), id);
            }
            return comparedNames;
        }
        return comparedCgpa;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(Comparator.naturalOrder());

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}