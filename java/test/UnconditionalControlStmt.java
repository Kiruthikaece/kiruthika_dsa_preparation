package test;

public class UnconditionalControlStmt {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==2 && j==2)
					continue;
				
				System.out.println(i+" .... "+j);
			}
		}
	}
	
	protected void printProtected() {
		System.out.println("Print Protected statement");
	}

}
