public class Main{
	String hel;
	Hello name;
	Main(){
		hel="Hello World!";
	}
	public static void main(String[] args){
		Main me= new Main(); //��������, Main()��ʾ���캯��
		Hello Logan= new Hello();
		Logan.name="Logan!";
		me.name=Logan;
		System.out.println(me.hel+me.name.name);
	}
}
class Hello{
	String name;
}
