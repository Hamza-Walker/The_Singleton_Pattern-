package com.walker.repository;


import com.walker.model.Exam;

import java.util.List;

public interface ExamRepository {

    void addExam(Exam exam);

    List<Exam> getExams();
}
