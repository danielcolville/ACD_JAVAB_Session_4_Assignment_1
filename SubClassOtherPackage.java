package otherPackage;
import Session4.ProtectedSpec;
public class SubClassOtherPackage extends ProtectedSpec{
	public SubClassOtherPackage(String str) {
		super(str);
	}
	public static void main(String[] args) {
		SubClassOtherPackage test=new SubClassOtherPackage("Hello World!");
		test.printStr();
	}
}
