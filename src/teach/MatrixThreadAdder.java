package teach;

public class MatrixThreadAdder extends Thread {
	String name;
	
	MatrixThreadAdder(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<Matrix.COL;i++)
		{
			Matrix.addColToSum(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixThreadAdder[] m = new MatrixThreadAdder[4];
		for(int i=0;i<4;i++){
			m[i] = new MatrixThreadAdder("Thread "+i);
			m[i].start();
			try {
				m[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(Matrix.sum);
	}

}
