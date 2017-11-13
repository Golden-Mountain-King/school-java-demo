package text;

public class Main {

	public static void main(String[] args) {
		System.out.println("运行时环境="+System.getProperty("java.version"));
		System.out.println("安装目录="+System.getProperty("java.home"));
		System.out.println("类路径="+System.getProperty("java.class.path"));
		System.out.println("操作系统的名称="+System.getProperty("os.name"));
		System.out.println("操作系统的版本="+System.getProperty("os.version"));
		System.out.println("用户账号名名称="+System.getProperty("user.name"));
		System.out.println("用户的主目录="+System.getProperty("user.home"));
		System.out.println("用户当前工作目录="+System.getProperty("user.dir"));
	}

}
