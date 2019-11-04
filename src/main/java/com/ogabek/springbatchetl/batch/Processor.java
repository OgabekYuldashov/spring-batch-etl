package com.ogabek.springbatchetl.batch;

import com.ogabek.springbatchetl.model.Student;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Component
public class Processor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) throws Exception {

        int year = Calendar.getInstance().get(Calendar.YEAR) - student.getAge();
        student.setDob(LocalDate.of(year, 1, 1));

        return student;
    }
}