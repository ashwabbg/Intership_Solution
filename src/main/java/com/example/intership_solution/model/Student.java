package com.example.intership_solution.model;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@Entity
public class Student extends User{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;

    private String promotion;

    @OneToMany(mappedBy = "student")
    private Set<Internship> internships = new Set<Internship>() {
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
        public Iterator<Internship> iterator() {
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
        public boolean add(Internship internship) {
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
        public boolean addAll(Collection<? extends Internship> c) {
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

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public Set<Internship> getInternships() {
        return internships;
    }

    public void setInternships(Set<Internship> internships) {
        this.internships = internships;
    }
}
