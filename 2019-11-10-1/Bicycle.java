// 访问限定符——原则上够用就行
public class Bicycle{
	//属性  大部分是 private
	private String colour;    //颜色  默认值是null
	private int speed;        //当前速度  默认值是0
	private int maxSpeed;     //最高速度  默认值是0
	  
	//构造方法   想好哪些属性是一开始就设置好的    属性初始化
	Bicycle( ){              //默认颜色的属性初始化
		colour="黑色";
		speed=0;
		maxSpeed=165;
	}
	
	Bicycle(String colour){  //给定颜色的属性初始化
		colour=colour;
		speed=0;
		maxSpeed=165;
	}
	//方法
	//setter->颜色设置，加速，减速
	void setColour(String colour){
		this.colour=colour;   //加  this.  关键字指的是属性里面的colour    第二个colour是函数的一个形参
	}
	
	void riseSpeed(){
		speed+=10;
		if(speed>maxSpeed){
			speed=maxSpeed;
		}
	}
	
	void declineSpees(){
		speed-=10;
		if(speed<0){
			speed=0;
		}
	}
	
	//getter->读取现在的颜色和当前速度
	String getColour(){
		return colour;
	}
	
	int getSpeed(){
		return speed;
	}
	
}

