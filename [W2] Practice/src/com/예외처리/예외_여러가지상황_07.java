package com.예외처리;

import java.io.IOException;

class E {
	void throwArithmeticException() { //예외처리하지 않아도 됨..? 이상함
		// 이유: unchecked Exception 이기에. 
		// 예외들 의 부모중에 RuntimeException이 있으면 unchecked. (Error도 unchecked)
		// # 예외를 처리 하지 않아도 됨.
		throw new ArithmeticException();
	}
	void throwIOException1() { //방법1. 직접처리   // (+) 위처럼 예외처리 안하면 안됨.
		// 이유: checked Exception 이기에.
		// 부모중 RuntimeException이 없으면 checked
		// # 꼭 예외처리 해야함.
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void throwIOException2() throws IOException { //방법2. 넘겨줌
		throw new IOException();
	}
}
public class 예외_여러가지상황_07 {

}
