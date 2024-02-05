package com.example.intership_solution.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.DateTimeException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

@Entity
public class Internship {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int internshipId;

    private String title;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    @OneToMany(mappedBy = "internship", cascade = {CascadeType.ALL})
    @JsonManagedReference
    private Set<Document> documentSet = new Set<Document>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Document> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Document document) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Document> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };

    public Internship() {

    }

    public int getinternshipId() {
        return internshipId;
    }

    public void setinternshipId(int internshipId) {
        this.internshipId = internshipId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<Document> getDocumentSet() {
        return documentSet;
    }

    public Internship(String title, Date date, Student student, Set<Document> documentSet) {
        this.title = title;
        this.date = date;
        this.student = student;
        this.documentSet = documentSet;
    }

    public void setDocumentSet(Set<Document> documentSet) {
        this.documentSet = documentSet;
    }
}