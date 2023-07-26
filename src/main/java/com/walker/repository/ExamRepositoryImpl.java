package com.walker.repository;


import com.walker.model.Exam;

import java.util.ArrayList;
import java.util.List;

public class ExamRepositoryImpl implements ExamRepository {
    // Private static instance variable
    private static ExamRepositoryImpl instance ;
    private final List<Exam> exams = new ArrayList<>();

    // Private constructor to prevent external instantiation
    private ExamRepositoryImpl (){
    }

    public static ExamRepositoryImpl getInstance() {
        if (instance == null) {
            synchronized (ExamRepositoryImpl.class) {
                if (instance == null) {
                    instance = new ExamRepositoryImpl();
                }
            }
        }
        return instance;
    }

    public void addExam(Exam exam) {
        exams.add(exam);
    }

    public List<Exam> getExams() {
        return exams;
    }

}
