package text;

import java.util.Stack;

public class Symmetry {
	boolean trueornot(char str[]){
		char e;
		Stack s = new Stack();
		for(int i=0;str[i]!='#';i++) {
			s.push(str[i]);
		}
		for(int i=0;str[i]!='#';i++) {
			e=(char) s.pop();
			if(str[i]!=e) {
				return false;
			}
		}
		return true;
	}
	
	
}
