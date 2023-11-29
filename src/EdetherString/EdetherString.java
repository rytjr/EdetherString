package EdetherString;

import java.util.*;
import java.io.*;

/*문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.

부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.

예를 들어, ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 서로 다른것의 개수는 12개이다.

입력
첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000 이하이다.

출력
첫째 줄에 S의 서로 다른 부분 문자열의 개수를 출력한다.*/

//처음에는 substring을 모르고 코딩을 통해 해결하려 했으나 실패하고 substring을 사용하여 해결함
public class EdetherString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		Set<String> hash = new HashSet<>();
		for(int j = 0; j < st.length(); j++) {
			for(int i = 0; i < st.length() - j + 1; i++) {
				//substring(i, j)는 i부터 j까지 문자열을 보여달라는 함수임
				String s = st.substring(i, i + j);
				hash.add(s);
			}
		}
		System.out.print(hash.size());
		
	}

}
