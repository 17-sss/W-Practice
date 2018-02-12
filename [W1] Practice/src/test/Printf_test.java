package test;
class BooleanPf  { //Boolean ���� ��� -> %b
	int x=30;
	
	void booleanpf() { 
		System.out.printf("age: %b, Year: %b\n", 26, 2018);
		System.out.println("==============================");
	}
	void boolean_for () {
		System.out.println("Boolean(%b) Test");
		for (int i=0; i<x; i++) {
			System.out.printf("Boolean Result=%b\n", i);
		}
	}
	
}

class DecimalnPf  { //10�� ���� ���� ��� -> %d
	int x=30;
	
	void decimalnPf() { 
		System.out.printf("age: %d, Year: %d\n", 26, 2018);
		System.out.println("==============================");
	}
	void decimaln_for () {
		System.out.println("Decimal(%d) Test");
		for (int i=0; i<x; i++) {
			System.out.printf("Decimal Result=%d\n", i);
		}
	}
	
}

class OctalPf  { //8�� ���� ���� ��� -> %o
	int x=30;
	
	void octalPf() { 
		System.out.printf("age: %o, Year: %o\n", 26, 2018);
		System.out.println("==============================");
	}
	void octal_for () {
		System.out.println("Octal(%o) Test");
		for (int i=0; i<x; i++) {
			System.out.printf("Octal Result=%o\n", i);
		}
	}
	
}

class HexaPf  { //16�� ���� ���� ��� -> %x, %X
	int x=30;
	
	void hexPf() {
		System.out.printf("age: %x, Year: %x\n", 26, 2018);
		System.out.println("==============================");
	}
	void hex_for () {
		System.out.println("Hex(%x) Test");
		for (int i=0; i<x; i++) {
			System.out.printf("Hex Result=%x\n", i);
		}
	}
	
}

class FloatPf  { //�ε� �Ҽ��� ���� ��� -> %f
//	float x=30f;
	int x=30; 
	
	void floatPf() {
		System.out.printf("age: %f, Year: %f\n", (float)26, 2018.0);
		System.out.println("==============================");
	}
	void float_for () {
		System.out.println("Float(%f) Test");
		for (float i=0f; i<x; i++) {
//		for (int i=0; i<x; i++) { <-- �ȴ�
			System.out.printf("Float Result=%f\n", i);
		}
	}
	void float_for2 () {
		System.out.println("Float(%f) Test");
		for (int i=0; i<x; i++) {
			System.out.printf("Float Result=%f\n", (float)i);
		}
	}
	
}

class ExponentPf { //���� ǥ���� ���� ��� -> %e, %E
	int x=30;
//	float x=30f;
	
	void expPf() {
		System.out.printf("age: %e, Year: %E\n", (float) 26, (float) 2018.0);
		System.out.println("==============================");
	}
	void exp_for () {
		System.out.println("Exponent(%e or %E) Test");
		for (int i=0; i<x; i++) {
			System.out.printf("Exponent Result=%e\n", (float)i);
		}
	}
	
}

class CharPf { //���� ǥ���� ���� ��� -> %c
//	int x=30;
//	float x=30f;
	char x='Z';
	
	void charPf() {
		System.out.printf("age: %c, Year: %c\n", 26, 2018);
		System.out.println("==============================");
	}
	void char_for () {
		System.out.println("Character(%c) Test");
		for (int i=0; i<x; i++) {
			System.out.printf("Character Result=%c\n", (char)i);
		}
	}
	
}

class StringPf { //���ڿ��� ��� -> %s 
//	int x=30;
//	float x=30f;
	String x="30000000";
	
	void stringPf() {
		System.out.printf("age: %s, Year: %s\n", 26, 2018);
		System.out.println("==============================");
	}
	
	void string_for () {
		System.out.println("String(%s) Test");
		for (int i=0; i<x.length(); i++) {
			System.out.printf("String Result=%s\n", i);
		}
	}
}


public class Printf_test {

	public static void main(String[] args) {	
		//Boolean ���� ��� -> %b
		
		/*BooleanPf B = new BooleanPf();
		B.booleanpf();
		B.boolean_for();*/
		
		
		//10�� ���� ���� ��� -> %d
		
		/*DecimalnPf D = new DecimalnPf();
		D.decimalnPf(); 
		D.decimaln_for();*/
		
		
		//8�� ���� ���� ��� -> %o
		
		/*OctalPf O = new OctalPf();
		O.octalPf();
		O.octal_for();*/
		
		
		//16�� ���� ���� ��� -> %x
		
		/*HexaPf H = new HexaPf();
		H.hexPf();
		H.hex_for();*/	 
		
		
		//�ε� �Ҽ��� ���� ��� -> %f
		
		/*FloatPf F = new FloatPf();
		F.floatPf();
		F.float_for2();*/
		
		
		//���� ǥ���� ���� ��� -> %e, %E
		
		/*ExponentPf E = new ExponentPf();
		E.expPf();
		E.exp_for();*/
		
		
		//���� ǥ���� ���� ��� -> %c
		
		/*CharPf C = new CharPf();
		C.charPf();
		C.char_for();*/
		
		
		//���ڿ��� ��� -> %s
		
		StringPf S = new StringPf();
		S.stringPf();
		S.string_for();
		}
}
