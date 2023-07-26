package com.walker.ui;



import com.walker.model.Exam;
import com.walker.repository.ExamRepository;
import com.walker.repository.ExamRepositoryImpl;

import java.util.List;

public class GetExamsUi {

    private final ExamRepository examRepository;

    public GetExamsUi() {
        examRepository = ExamRepositoryImpl.getInstance();
    }

    public void showExams() {
        List<Exam> exams = examRepository.getExams();

        if (exams.isEmpty()) {
            System.out.println("No exams in the database.");
        }

        for (Exam exam : exams) {
            System.out.println(exam);
        }
    }

}
