package Day11_08;

class Calc {
	int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a;
	}
}

class Add extends Calc {
	public int add() {
		int resualt = a + b;
		return resualt;
	}
	public int calculate() {
		return add();
	}
}

class Sub extends Calc {
	public int sub() {
		int resualt = a - b;
		return resualt;
	}
}

class Mul extends Calc {
	public int mul() {
		int resualt = a * b;
		return resualt;
	}
}

class Div extends Calc {
	public int div() {
		int resualt = a / b;
		return resualt;
	}
}