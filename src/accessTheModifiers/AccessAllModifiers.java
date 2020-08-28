package accessTheModifiers;

import accessModifiers.DefaultAccess;
import accessModifiers.ProtectedAccess;

public class AccessAllModifiers extends ProtectedAccess{

	//What is the difference between default and protected
	public void accessDefault() {
		DefaultAccess defAccess = new DefaultAccess();
	}
	
	public void accessProtected() {
		ProtectedAccess proaccess = new ProtectedAccess();
		System.out.println(protectedAccess);
	}
}
