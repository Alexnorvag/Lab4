package by.norvag;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by norvag on 22.02.2016.
 * Построить модель программной системы.
 * Система Вступительные экзамены.
 * Абитуриент регистрируется на Факультет, сдает Экзамены.
 * Преподаватель выставляет Оценку.
 * Система подсчитывает средний балл и определяет Абитуриентов, зачисленных в учебное заведение.
 */
public class SoftwareModel {
    private String login;
    private String password;
    private String faculty;

    public SoftwareModel(BufferedReader reader) throws IOException {
        System.out.println("Select faculty:\n1)Biology faculty;\n2)Military faculty;\n" +
                "3)Faculty of geography;\n4)Mechanics and mathematics faculty;\n" +
                "5)Faculty of applied mathematics and computer science;");
        System.out.print("Select one of the faculties: ");
        int FacultyValue = Integer.parseInt(reader.readLine());
        while (FacultyValue < 1 || FacultyValue > 5)
        {
            System.out.println("The Faculty is not selected, try again: ");
            FacultyValue = Integer.parseInt(reader.readLine());
        }
        switch (FacultyValue)
        {
            case 1: faculty = "Biology faculty";
                break;
            case 2: faculty = "Military faculty";
                break;
            case 3: faculty = "Faculty of geography";
                break;
            case 4: faculty = "Mechanics and mathematics faculty";
                break;
            case 5: faculty = "Faculty of applied mathematics and computer science";
                break;
            default: break;
        }
        System.out.println("You choose " + faculty + ".\n\nEnter registration information:");
        System.out.print("Enter login: ");
        login = reader.readLine();
        System.out.print("Enter password: ");
        password = reader.readLine();

        int[] ArrMarks = new int[3];

        for (int i = 0; i < ArrMarks.length; i++) {
            ArrMarks[i] = (int)(Math.random() * 11);
        }

        System.out.println("\nNow you have to pass exams in the subjects:");
        switch (faculty)
        {
            case "Biology faculty":
                System.out.println("Biology, Mathematics, Belarus language.\n\n" +
                        "Marks on subjects:\nBiology: " + ArrMarks[0] + "\nMathematics: "
                        + ArrMarks[1] + "\nBelarus language: " + ArrMarks[2] + "\nYour GPA: " + GPA(ArrMarks));
                if (GPA(ArrMarks) > 4)
                    System.out.println("\n\nCongratulations, you have successfully passed all the exams.");
                else System.out.println("\n\nSorry, but you can not gain the necessary minimum for university entrance.");
                break;
            case "Military faculty":
                System.out.println("Standards for Physical Education, Physics, Mathematics.\n\n" +
                        "Marks on subjects:\nStandards for Physical Education: " + ArrMarks[0] + "\nPhysics: "
                        + ArrMarks[1] + "\nBelarus language: " + ArrMarks[2] + "\nYour GPA: " + GPA(ArrMarks));
                if (GPA(ArrMarks) > 4)
                    System.out.println("\n\nCongratulations, you have successfully passed all the exams.");
                else System.out.println("\n\nSorry, but you can not gain the necessary minimum for university entrance.");
                break;
            case "Faculty of geography":
                System.out.println("Geography , Mathematics , Belarus language.\n\n" +
                        "Marks on subjects:\nGeography: " + ArrMarks[0] + "\nMathematics: "
                        + ArrMarks[1] + "\nBelarus language: " + ArrMarks[2] + "\nYour GPA: " + GPA(ArrMarks));
                if (GPA(ArrMarks) > 4)
                    System.out.println("\n\nCongratulations, you have successfully passed all the exams.");
                else System.out.println("\n\nSorry, but you can not gain the necessary minimum for university entrance.");
                break;
            case "Mechanics and mathematics faculty":
                System.out.println("Physics, Mathematics, Belarus language.\n\n" +
                        "Marks on subjects:\nPhysics: " + ArrMarks[0] + "\nMathematics: "
                        + ArrMarks[1] + "\nBelarus language: " + ArrMarks[2] + "\nYour GPA: " + GPA(ArrMarks));
                if (GPA(ArrMarks) > 4)
                    System.out.println("\n\nCongratulations, you have successfully passed all the exams.");
                else System.out.println("\n\nSorry, but you can not gain the necessary minimum for university entrance.");
                break;
            case "Faculty of applied mathematics and computer science":
                System.out.println("Physics, Mathematics, Belarus language.\n\n" +
                        "Marks on subjects:\nPhysics: " + ArrMarks[0] + "\nMathematics: "
                        + ArrMarks[1] + "\nBelarus language: " + ArrMarks[2] + "\nYour GPA: " + GPA(ArrMarks));
                if (GPA(ArrMarks) > 4)
                    System.out.println("\n\nCongratulations, you have successfully passed all the exams.");
                else System.out.println("\n\nSorry, but you can not gain the necessary minimum for university entrance.");
                break;
            default: break;
        }
    }

    public double GPA(int[] Array)
    {
        int gpa = 0;
        for (int i = 0; i < Array.length; i++) {
            gpa += Array[i];
        }
        return gpa / Array.length;
    }
}


























