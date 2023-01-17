package Calculate;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculatetest {
	public float calculateIntrest(float pr,float rate,float time) {
		return pr*rate*time/100;
	}
	public static void main(String[]args) {
		Calculatetest c1=new Calculatetest();
		System.out.println(c1.calculateIntrest(4000,4,3));
	}

}
