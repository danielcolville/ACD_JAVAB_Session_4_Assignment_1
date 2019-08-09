package Session4;
import otherPackage.*;
public class ProtectedSpec {
	public ProtectedSpec(){
	}
	public ProtectedSpec(String str) {
		this.str=str;
	}
	private String str;
	protected void printStr() {
		System.out.println(str);
	}
	
}

