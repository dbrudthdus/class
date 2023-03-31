package chapter05.other;


public class ModifierProtectedExtends extends ModifierProtected {

	// name, age, tell()
	
	public static void name() {
		
		ModifierProtectedExtends mpe = new ModifierProtectedExtends();
		
		mpe.name = "이강인";
		mpe.age = 30;
		
		mpe.tell();
	}
}
