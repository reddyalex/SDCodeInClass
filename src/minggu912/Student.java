/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu912;

import java.util.Objects;

/**
 *
 * @author Reddy
 */
public class Student implements Comparable<Student>{
    
    public String nama;
    public int tinggi;
    public boolean sukabasket;
    public boolean sukasepakbola;
    public boolean sukabadminton;

    public Student(String nama, int tinggi, boolean sukabasket, boolean sukasepakbola, boolean sukabadminton) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.sukabasket = sukabasket;
        this.sukasepakbola = sukasepakbola;
        this.sukabadminton = sukabadminton;
    }

    @Override
    public String toString() {
        return "Student{" + "nama=" + nama + ", tinggi=" + tinggi + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.nama);
        hash = 53 * hash + this.tinggi;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.tinggi != other.tinggi) {
            return false;
        }
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Student o) {
        
        if (this.tinggi == o.tinggi ) {
            return this.nama.compareTo(o.nama);
        }
        if (this.tinggi < o.tinggi)
            return 1;
        else
            return -1;
        
        
        
    }
    
    
}
