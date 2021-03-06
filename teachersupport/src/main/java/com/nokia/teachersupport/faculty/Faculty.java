package com.nokia.teachersupport.faculty;

import com.nokia.teachersupport.person.Person;
import org.apache.logging.log4j.util.Strings;

import javax.persistence.*;
import java.util.List;

@Entity
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String facultyNameField;
    //Pole z fotka na razie brak

    private boolean checkedField;

    @OneToMany(mappedBy = "facultyField")
    private List<Person> facultyAndPersonList;   //A tu nie ma new czemu to dzila a przy many to many nie -.-

    public Faculty()
    {
        this.facultyNameField= Strings.EMPTY;
        this.checkedField=false;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getFacultyNameField() {
        return facultyNameField;
    }

    public void setFacultyNameField(String facultyNameField) {
        this.facultyNameField = facultyNameField;
    }

    public List<Person> getFacultyAndPersonList() {
        return facultyAndPersonList;
    }

    public void setFacultyAndPersonList(List<Person> facultyAndPersonList) {
        this.facultyAndPersonList = facultyAndPersonList;
    }
public void addPersonToFaculty(Person person)
{
    this.facultyAndPersonList.add(person);
    if (person.getFacultyField() != this) {
        person.setFacultyField(this);
    }
}


    public boolean isCheckedField() {
        return checkedField;
    }

    public void setCheckedField(boolean checkedField) {
        this.checkedField = checkedField;
    }
}