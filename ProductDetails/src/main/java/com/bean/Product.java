package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eproduct")
public class Product {
 @Id
 @Column(name = "id")
 private int pid;
 @Column(name = "name")
 private String pname;
 private int price;
 public int getPid() {
  return pid;
 }
 public void setPid(int pid) {
  this.pid = pid;
 }
 public String getPname() {
  return pname;
 }
 public void setPname(String pname) {
  this.pname = pname;  
 }
 public int getPrice() {
  return price;
 }
 public void setPrice(int price) {
  this.price = price;
 }
 @Override
 public String toString() {
  return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
 }
 
}