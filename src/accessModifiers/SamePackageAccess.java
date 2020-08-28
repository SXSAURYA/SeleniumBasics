package accessModifiers;

public class SamePackageAccess {

	//What is the difference between default and protected
	public void accessDefault() {
		DefaultAccess defAccess = new DefaultAccess();
		System.out.println(defAccess.defaultAccess);
		
	}
	
	public void accessProtected() {
		ProtectedAccess protectedAccess = new ProtectedAccess();
		System.out.println(protectedAccess.protectedAccess);
	}
}
