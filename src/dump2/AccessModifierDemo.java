package dump2;

import dump.DefaultAccessModifier;
import dump.ProtectedAccessModifier;
import dump.PublicAccessModifier;

public class AccessModifierDemo extends ProtectedAccessModifier{

	public void privateAccess() {
		System.out.println();
	}
	
	public void protectedAccess() {
		System.out.println(this.iProtected);
	}
	
	public void defaultAccess() {
		System.out.println(new DefaultAccessModifier());
	}
	
	public void publicAccess() {
		System.out.println(new PublicAccessModifier().iPublic);
	}
}
