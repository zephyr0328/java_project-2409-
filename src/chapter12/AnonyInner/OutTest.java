package chapter12.AnonyInner;

public class OutTest{
	
	public OutTest() {
		System.out.println("Out ��ü�� �����˴ϴ�.");
	}
	
	public class A {
	A() { System.out.println("A ��ü�� ������"); }
	}
		/**�ν��Ͻ� ��� Ŭ����**/
		public class B {
			B() { System.out.println("B ��ü�� ������"); }
			int field1;
			//static int field2;
			void method1() { }
			//static void method2() { }
		}//B class
		
		/**���� ��� Ŭ����**/
		static class C {
			C() { System.out.println("C ��ü�� ������"); }
			int field1;
			static int field2;
			void method1() { }
			static void method2() { }
		}
		C c = new C();
		void method() {
			/**���� Ŭ����**/
			class D {
				D() { System.out.println("D ��ü�� ������"); }
				int field1;
				//static int field2;
				void method1() { }
				//static void method2() { }
			}//D class
			D d = new D();
			d.field1 = 3;
			d.method1();
		}//method()
	}

