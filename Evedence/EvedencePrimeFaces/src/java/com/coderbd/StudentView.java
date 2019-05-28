/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author User
 */
@ManagedBean
public class StudentView {

    private List<Student> lists;

    public List<Student> getLists() {
        lists = new ArrayList<>();
        lists.add(new Student("Arif", "aharif17@gmail.com", "Male", "Java", "bangladesh"));
        lists.add(new Student("Motin", "aharif17@gmail.com", "Male", "php", "bangladesh"));
        lists.add(new Student("Shetu", "aharif17@gmail.com", "Male", "Database", "bangladesh"));
        lists.add(new Student("Shihab", "aharif17@gmail.com", "Male", "HTML", "bangladesh"));
        return lists;
    }

    public void setLists(List<Student> lists) {
        this.lists = lists;
    }
}
