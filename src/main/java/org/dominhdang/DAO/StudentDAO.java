package org.dominhdang.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.dominhdang.Entities.Student;

public class StudentDAO implements IDao<Student> {
    private List<Student> students = new ArrayList<Student>();

    @Override
    public Student getByID(int id) {

        // TODO: SELECT* FROM Student Where Id = id;
        return null;
    }

    @Override
    public List<Student> getAll() {
        // TODO: SELECT * FROM Student;
        return null;
    }

    @Override
    public void add(Student student) {

        // TODO: INSERT INTO Student Values

    }

    @Override
    public void update(Student student) {
        // TODO: UPDATE TABLE Student SET ...

    }

    @Override
    public void delete(Student studest) {
        // TODO Auto-generated method stub

    }
}
