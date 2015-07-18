package teach;

public class MatrixArrayWriter extends Thread{
	String name;
	static int index;
	static int[] arr;
	MatrixArrayWriter(String name){
		super(name);		
		index = 0;
		arr = new int[Matrix.ROW*Matrix.COL];
	}
	public void run(){
		// adds ith col to elements of array after index
		for(int i=0;i<Matrix.COL;i++){
			MatrixArrayWriter.index = Matrix.addColToArray(i,MatrixArrayWriter.arr,MatrixArrayWriter.index);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixArrayWriter[] m = new MatrixArrayWriter[4];
		for(int i=0;i<4;i++){
			m[i] = new MatrixArrayWriter("Thread "+i);
			m[i].start();
			try {
				m[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		for(int i=0;i<MatrixArrayWriter.arr.length;i++)
			System.out.println(MatrixArrayWriter.arr[i]);
	}

}
