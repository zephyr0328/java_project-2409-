package chapter12.AnonyInner;

public class OutTest{
	
	public OutTest() {
		System.out.println("Out °´Ã¼°¡ »ý¼ºµË´Ï´Ù.");
	}
	
	public class A {
	A() { System.out.println("A °´Ã¼°¡ »ý¼ºµÊ"); }
	}
		/**ÀÎ½ºÅÏ½º ¸â¹ö Å¬·¡½º**/
		public class B {
			B() { System.out.println("B °´Ã¼°¡ »ý¼ºµÊ"); }
			int field1;
			//static int field2;
			void method1() { }
			//static void method2() { }
		}//B class
		
		/**Á¤Àû ¸â¹ö Å¬·¡½º**/
		static class C {
			C() { System.out.println("C °´Ã¼°¡ »ý¼ºµÊ"); }
			int field1;
			static int field2;
			void method1() { }
			static void method2() { }
		}
		C c = new C();
		void method() {
			/**·ÎÄÃ Å¬·¡½º**/
			class D {
				D() { System.out.println("D °´Ã¼°¡ »ý¼ºµÊ"); }
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

