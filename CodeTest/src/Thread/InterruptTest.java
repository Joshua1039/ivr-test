package Thread;

public class InterruptTest extends Thread{

	public void run() {
		int i;
		for (i = 0; i < 100;i++) {
			System.out.println(i);
		}
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
			System.out.println("Wake!!!");
		}
	}
	
	public static void main(String[] args) {

		InterruptTest test = new InterruptTest();
		test.start();
		test.interrupt();
		
		//sleep���϶� InterrupteExcption���� ����� �Ѵ�. test.interrupt();�� ȣ���ϸ� 5�� ������ ���� �����
		
		System.out.println("end");
	}

}