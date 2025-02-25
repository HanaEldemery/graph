package csen703.main.assignment1;

import java.util.Arrays;

public class RingToss {

	public static int RingTossGreedy(int [] pegs) {
	    if (pegs.length==0) {
			 return 0;
		 }

		 if (pegs.length==1) {
			 return pegs[0];
		 }

		 int ret=0;
		 int big=0;
		 int small=0;
		 boolean incDec=false;		

		 for (int i=0;i<pegs.length;i++) {
			 
			 if(i==(pegs.length-1)) {
				 if (pegs[i]>pegs[i-1]) {
					 big=pegs[i];
					 incDec=true;
				 }
			 }
			 
			 if (pegs[i]<=small) {
				 small=pegs[i];
			 }
			 
			 if (!(i==(pegs.length-1))) {
				 if (pegs[i]>pegs[i+1]) {
					 big=pegs[i];
					 incDec=true;
				 }
			 }

			 if (incDec) {
				 ret+=big-small;
				 incDec=false;
				 small=pegs[i];		 
			 }
		 }	 
		 return ret; 
	 }
	
    public static void main(String[] args) {
    }
}
