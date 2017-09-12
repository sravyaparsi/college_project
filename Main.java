import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		//StudentGroup stg=new StudentGroup();
		Scanner sc=new Scanner(System.in);
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int n=sc.nextInt();
		Student[] s=new Student[n];		
		StudentGroup sg=new StudentGroup();
		for(int i=0;i<n;i++) {
			sg.setStudents(s[i]);
		}
		
		int g=sc.nextInt();
		Student st=getStudent()
	}

}
