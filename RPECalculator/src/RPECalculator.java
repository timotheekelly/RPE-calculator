import java.util.Arrays;
import java.util.Scanner;

public class RPECalculator {

	public static final int width = 12;
	public static final int height = 8;
	public static double oneRepMax;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("What is your 1 rep max in kg?");
		oneRepMax = input.nextDouble();


		printBoard(percentageCalculator(oneRepMax));
	}

	public static void printBoard(double[] percentageOfRpe) {
		String[] reps = {"    ", "   1   ", "   2   ", "   3   ", "   4   ", "   5   ", "   6   ", "   7   ",
				"   8   ", "   9   ", "   10  ", "   11  ", "   12  "}; 
		String[] rpe = {"","   ", "10 ", "9.5", " 9 ", "8.5", " 8 ", "7.5", " 7 ", "6.5"};
		int k=0;

		for (int i = 0 ; i <= 9 ; i++){
			for (int j = 0 ; j <= 10 ; j++){
				if (i == 0) {
					System.out.print(reps[j]);
				} else if (j == 0){
					System.out.print(rpe[i] +" ");
				} else if (i==1) {
					System.out.print("-------");
				} else {
					if(percentageOfRpe[k] == 0.0) {
						System.out.print( "  " + percentageOfRpe[k] +"  ");
					} else if (percentageOfRpe[k] < 10){
						System.out.print("  " + percentageOfRpe[k]+"  ");
					} else if (percentageOfRpe[k] < 100){
						System.out.print(" " + percentageOfRpe[k]+"  ");
					} else {
						System.out.print(" "+percentageOfRpe[k]+" ");
					}
					k++;
				}           
				System.out.print("|");
			}
			System.out.println();
		}

	}

	public static double[] percentageCalculator(double oneRepMax) {

		double[] percentageOfRpe = new double[80];

		for (int i = 0; i<percentageOfRpe.length; i++) {
			
			if (i==0) {
				percentageOfRpe[i] = oneRepMax; 
			} else if (i==1||i==20) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.96* 10)/10;				
			} else if (i==2||i==21||i==40) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.92* 10)/10;
			} else if (i==3||i==22||i==41||i==60) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.89* 10)/10;
			} else if (i==4||i==23||i==42||i==61) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.86* 10)/10;
			} else if (i==5||i==24||i==43||i==62) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.84* 10)/10;
			} else if (i==6||i==25||i==44||i==63) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.81* 10)/10;
			} else if (i==7||i==26||i==45||i==64) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.79* 10)/10;
			} else if (i==8||i==27||i==46||i==64) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.76* 10)/10;
			} else if (i==9||i==28||i==47||i==66) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.74* 10)/10;
			} else if (i==10) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.98* 10)/10;
			} else if (i==11||i==30) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.94* 10)/10;
			} else if (i==12||i==31||i==50) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.91* 10)/10;
			} else if (i==13||i==32||i==51||i==70) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.88* 10)/10;
			} else if (i==14||i==33||i==52||i==71) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.85* 10)/10;
			} else if (i==15||i==34||i==53||i==72) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.82* 10)/10;
			} else if (i==16||i==35||i==54||i==73) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.80* 10)/10;
			} else if (i==17||i==36||i==55||i==74) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.77* 10)/10;
			} else if (i==18||i==37||i==56||i==75) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.75* 10)/10;
			} else if (i==19||i==38||i==57||i==76) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.72* 10)/10;
			} else if (i==29||i==48||i==67) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.71* 10)/10;
			} else if (i==39||i==58||i==77) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.69* 10)/10;
			} else if (i==49||i==68) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.68* 10)/10;
			} else if (i==59||i==78) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.67* 10)/10;
			} else if (i==69) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.65* 10)/10;
			} else if (i==79) {
				percentageOfRpe[i] = Math.round( oneRepMax*0.64* 10)/10;
			}
			
			
		}

		return percentageOfRpe;
	}

}
