
/*
 * GIT ��ġ �� ����
 * 
 * 
 * 1. Repogitory ���� hellogit
2. Document Settings/user/.ssh ���� 
3. Account Setting ���� ������ SSH KEY ����
4. git bash ����
   mkdir .ssh
   cd .ssh 
   ssh-keygen -t rsa -C "app2apps@naver.com"
   ls -l �غ���
   id-rsa
   is-rsa.pub �� �����. 
5. is-rsa.pub�� �����ؼ� github�� Account Setting�� SSH-KEY���� ADD KEY �Ѵ�.
6. ssh -T git@github.com
7. github.com���� Repogitory Ŭ���ϰ� 
   git config --global user.name "app2apps"
   git config --global user.email "app2apps@naver.com"
8. cd 
   mkdir hellogit
   cd hellogit
9. git init 
   touch README
   git add README
   git commit -m 'first commit'
   git remote add origin git@github.com:app2apps/hellogit.git
   git push -u origin master
10. Repository Ŭ���ϰ� http ���� url �����ؼ� 
11. eclipse���� Git Perspective���� clone ���� �� URL �ٿ��ֱ� �ؼ� ����
12. Git Perspective���� ������ư import! projects�ϰ� use the New Project ����
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Gugudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NEW

		 System.out.println("gugudanfrom:");

		 Scanner sc=new Scanner(System.in);

		 int i=sc.nextInt();
		 
		 	 
		 for (; i <= 9; i++) 
		{
		 	printDan(i);
	
		}

	}

	public static void printDan(int i) {
		
			for (int j = 1; j <= 9; j++) 
			{
				int k =i*j;
				System.out.println(i + "x" + j + "=" + i*j);
			}
		
	}

}
