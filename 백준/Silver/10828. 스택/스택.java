import java.util.Scanner;

public class Main {
	private static int size = 0;
	private static int[] stack;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();
		stack = new int[N];

		for (int i = 0; i < N; i++) {
			String input = sc.next();

			switch (input) {
			case "push":
				push(sc.nextInt());
				break;
			case "top":
				sb.append(top()).append('\n');
				break;
			case "size":
				sb.append(size()).append('\n');
				break;
			case "pop":
				sb.append(pop()).append('\n');
				break;
			case "empty":
				sb.append(empty()).append('\n');
				break;
			}
		}
		System.out.println(sb);
		sc.close();
	}

	private static int empty() {
		if(size==0) {
			return 1;
		}
		else
			return 0;
	}

	private static int pop() {
		if(size==0) {
			return -1;
		}
		else {
			int temp = stack[size-1];
			stack[size-1]=0;
			size--;
			return temp;
		}
		
	}

	private static int size() {
		return size;
	}

	private static void push(int input) {
		stack[size] = input;
		size++;
	}

	private static int top() {
		if (size == 0) {
			return -1;
		} else
			return stack[size - 1];

	}
}