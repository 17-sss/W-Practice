package com.extends_etc;

import java.util.Scanner;

//RepairableTest - Ÿ����
public class RepairableTest_392p {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);		// SCV�� ��ũ�� �����ϵ��� �Ѵ�.
		scv.repair(dropship);
//		scv.repair(marine);		// �����Ұ� . �غ���..
	}
}

interface Repairable {}

class Unit {
	//Scanner scan = new Scanner(System.in);
	int hitPoint;
	final int MAX_HP;
	Unit(int hp) {
		MAX_HP = hp;
	}
	//...
}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}
//===================================
class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);	//Tank�� HP�� 150�̴�.
//		System.out.print("HP?: "); 
//		hitPoint = scan.nextInt();
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	} 
	//...
}

class Dropship extends GroundUnit implements Repairable {
	Dropship() {
		super(125);	//Dropship�� HP�� 125�̴�.
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Dropship";
	}
	//...
}
	
class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
	//...
}

class SCV extends GroundUnit implements Repairable{
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				/* Unit�� HP�� ������Ų��.*/
				System.out.println(u.hitPoint);
				u.hitPoint++;
			}
			System.out.println( u.toString() + "�� ������ �������ϴ�.");
		}
	}
	//...
}
	


