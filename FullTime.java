package userhjh;

public class FullTime extends Student{
FullTime(){
}
FullTime(String name){
this.name = name;
this.isFullTime = true;
}
public double tuitionFee(){
return 2000;
}
}