package Additional;

public class Stall {
 private String sname,stype,oname;
  private double a;
 
 public Stall() {
  super();
 }
 
 public Stall(String sname, String stype, String oname, int sno, double a, double totcost) {
  super();
  this.sname = sname;
  this.stype = stype;
  this.oname = oname;
  
  this.a = a;
  
 }
 public String getSname() {
  return sname;
 }
 public void setSname(String sname) {
  this.sname = sname;
 }
 public String getStype() {
  return stype;
 }
 public void setStype(String stype) {
  this.stype = stype;
 }
 public String getOname() {
  return oname;
 }
 public void setOname(String oname) {
  this.oname = oname;
 }
 
 public double getA() {
  return a;
 }
 public void setA(double a) {
  this.a = a;
 }
 
 }
