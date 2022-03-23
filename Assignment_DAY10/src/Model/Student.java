package Model;

import java.util.HashMap;
import java.util.Map;
public class Student<T> {

     public T companyName;

 Student(T companyName){
 this.companyName= companyName;
 }

 public T getCompanyName() {
return companyName;
 }

 public void setCompanyName(T companyName) {
 this.companyName = companyName;
 }

 public String toString(){
 return "Employee{" + "companyName='"+companyName + '\''+'}';
 }
    }


