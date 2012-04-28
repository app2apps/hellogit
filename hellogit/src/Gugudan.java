
/*
 * GIT 설치 및 연동
 * 
 * 
 * 1. Repogitory 생성 hellogit
2. Document Settings/user/.ssh 삭제 
3. Account Setting 에서 생성된 SSH KEY 삭제
4. git bash 실행
   mkdir .ssh
   cd .ssh 
   ssh-keygen -t rsa -C "app2apps@naver.com"
   ls -l 해보면
   id-rsa
   is-rsa.pub 가 생긴다. 
5. is-rsa.pub를 복사해서 github의 Account Setting의 SSH-KEY에서 ADD KEY 한다.
6. ssh -T git@github.com
7. github.com에서 Repogitory 클릭하고 
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
10. Repository 클릭하고 http 선택 url 복사해서 
11. eclipse에서 Git Perspective에서 clone 선택 후 URL 붙여넣기 해서 생성
12. Git Perspective에서 우측버튼 import! projects하고 use the New Project 선택
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
