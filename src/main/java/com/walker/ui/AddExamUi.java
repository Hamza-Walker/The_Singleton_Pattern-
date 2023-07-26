package com.walker.ui;



import com.walker.model.Exam;
import com.walker.model.Grade;
import com.walker.repository.ExamRepository;
import com.walker.repository.ExamRepositoryImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class AddExamUi {

    private final ExamRepository examRepository;

    public AddExamUi() {
        examRepository = ExamRepositoryImpl.getInstance();
    }

    public void addExam() {
        LocalDate examDate = getExamDate();
        String studentName = getStudentName();
        String examName = getExamName();
        Grade examGrade = getExamGrade();

        examRepository.addExam(new Exam(examDate, studentName, examName, examGrade));

        System.out.println("Exam added.");
    }

    private LocalDate getExamDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Exam date: ");
        String input = scanner.nextLine();
        return LocalDate.parse(input);
    }

    private String getStudentName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student name: ");
        return scanner.nextLine();
    }

    private String getExamName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Exam name: ");
        return scanner.nextLine();
    }

    private Grade getExamGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Exam grade: ");
        String input = scanner.nextLine();
        return Grade.valueOf(input);
    }

}
