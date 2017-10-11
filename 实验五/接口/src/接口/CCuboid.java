package ½Ó¿Ú;

class CCuboid extends Object implements IShape {
	public int x,y,z;
	CCuboid(){
		
	}
	CCuboid(int a,int b, int c){
		this.x=a;
		this.y=b;
		this.z=c;
	}
	public void getYsetLength(int a,int b,int c) {
		this.x=a;
		this.y=b;
		this.z=c;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	public String toString() {
		return null;
	}
	public int surfaceArea() {
		return 2*((x*y)+(y*z)+(x*z));
	}
	public int volume() {
		return x*y*z;
	}
	public String getName() {
		return null;	
	}
}
