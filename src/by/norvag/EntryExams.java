package by.norvag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by norvag on 22.02.2016.
 * Построить модель программной системы.
 * Система Вступительные экзамены.
 * Абитуриент регистрируется на Факультет, сдает Экзамены.
 * Преподаватель выставляет Оценку.
 * Система подсчитывает средний балл и определяет Абитуриентов, зачисленных в учебное заведение.
 */
public class EntryExams {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SoftwareModel softwareModel = new SoftwareModel(reader);
    }
}
