package userhjh;

import java.beans.Statement;

public class PartTime extends Statement{
PartTime(){
}
PartTime(String name){
this.name = name;
this.isFullTime = false;
}
public double tuitionFee(){
return 200;
}
}