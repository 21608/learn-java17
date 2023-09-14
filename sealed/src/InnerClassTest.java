
public sealed class InnerClassTest implements InterfaceTest permits InnerClassTest.InnerClass {
	final class InnerClass extends InnerClassTest {
		
	}
}
