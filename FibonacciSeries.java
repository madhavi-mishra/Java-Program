package javaProgram;


import org.testng.annotations.Test;

public final class FibonacciSeries extends BaseTestNG {
	@Test(priority = 1)
	public void series() {
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.println(n2);
		for (i = 2; i < count; ++i) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}

	}

	@Test(priority = 2)
	public void fibonacciSeries() {
		int i = 1, n = 10, t1 = 0, t2 = 1;
		System.out.println("First" + n + "numbers series: ");
		while(i<=n) {
			System.out.println(t1+ " ");
			int sum = t1+t2;
			t1=t2;
			t2=sum;
			i++;
		}

	}





}
