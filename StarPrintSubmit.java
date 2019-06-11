package starPrint;

import java.util.Scanner;

public class StarPrintSubmit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("=================================================================");
			System.out.println("=========================== StarPrint ============================");
			System.out.println("=================================================================");
			System.out.println("========== 1. Choice ======== 2. PrintList ======== 3. Close ==========");
			System.out.println("=================================================================");
			System.out.printf("Please enter your choice : ");
			int menuChoice = scanner.nextInt();	scanner.nextLine();
			System.out.println("=================================================================");
				
			if(menuChoice == 1) {
				
				System.out.printf("========================= your choice : %d =========================\n", menuChoice);
				System.out.printf("Please enter your type choice : ");
				int starTypeChoice = scanner.nextInt();	scanner.nextLine();
				System.out.println("=================================================================");
				
				if(starTypeChoice == 1) {
					
					System.out.printf("======================= your tpye choice : %d =======================\n", starTypeChoice);
					System.out.printf("Please enter your line number : ");
					int lineChoice = scanner.nextInt();		scanner.nextLine();
					System.out.println("=================================================================");
					
					System.out.println("========================= Type " + starTypeChoice + " : " + lineChoice + "Line =========================");
					int starMaxCount = lineChoice;
					char[] starArr = new char[starMaxCount];
					for (int i = 0; i < starArr.length; i++) {
						starArr[i] = ' ';
					}
	
					int startPrint;
					int addStarIndex;
					int removeStarIndex;
					for (int i = 0; i < lineChoice; i++) {
						
						starArr[i] = '*';
						System.out.println(starArr);
					}
					
				}	else if(starTypeChoice == 2) {
					
					System.out.printf("======================= your tpye choice : %d =======================\n", starTypeChoice);
					System.out.printf("Please enter your line number : ");
					int lineChoice = scanner.nextInt();		scanner.nextLine();
					System.out.println("=================================================================");
					
					System.out.println("========================= Type " + starTypeChoice + " : " + lineChoice + "Line =========================");
					int starMaxCount = lineChoice;
					char[] starArr = new char[starMaxCount];
					for (int i = 0; i < starArr.length; i++) {
						starArr[i] = '*';		
					}
		
					int startPrint;
					int addStarIndex;
					int removeStarIndex;
					for (int i = lineChoice - 1; i >= 0 ; i--) {
						if( i == starArr.length - 1); 
						else {
							removeStarIndex = i + 1;
							starArr[removeStarIndex] = ' ';
						}	System.out.println(starArr);
					}	
					
				}	else if (starTypeChoice == 3) {
					
					System.out.printf("======================= your tpye choice : %d =======================\n", starTypeChoice);
					System.out.printf("Please enter your line number : ");
					int lineChoice = scanner.nextInt();		scanner.nextLine();
					System.out.println("=================================================================");
					
					
					System.out.println("========================= Type " + starTypeChoice + " : " + lineChoice + "Line =========================");
					int starMaxCount = lineChoice;
					char[] starArr = new char[starMaxCount];
					for (int i = 0; i < starArr.length; i++) {
						starArr[i] = ' ';
					}

					int startPrint;
					int addStarIndex;
					int removeStarIndex;
					for (int i = lineChoice - 1; i >= 0 ; i--) {
						starArr[i] = '*';
						System.out.println(starArr);	
					} // 완성
					
				}	else if (starTypeChoice == 4) {
					
					System.out.printf("======================= your tpye choice : %d =======================\n", starTypeChoice);
					System.out.printf("Please enter your line number : ");
					int lineChoice = scanner.nextInt();		scanner.nextLine();
					System.out.println("=================================================================");
					
					System.out.println("========================= Type " + starTypeChoice + " : " + lineChoice + "Line =========================");
					int starMaxCount = lineChoice;
					char[] starArr = new char[starMaxCount];
					for (int i = 0; i < starArr.length; i++) {
						starArr[i] = '*';		
					}
					
					int startPrint;
					int addStarIndex;
					int removeStarIndex;
					for (int i = 0; i < lineChoice ; i++) {
						if( i ==  0 );
						else {
							removeStarIndex = i - 1;
							starArr[removeStarIndex] = ' ';
						}	System.out.println(starArr);	
					}	// 완성
					
				}	else if (starTypeChoice == 5) {

					System.out.printf("======================= your tpye choice : %d =======================\n", starTypeChoice);
					System.out.printf("Please enter your line number : ");
					int lineChoice = scanner.nextInt();		scanner.nextLine();
					System.out.println("=================================================================");	
					
					System.out.println("========================= Type " + starTypeChoice + " : " + lineChoice + "Line =========================");
					int starMaxCount = (lineChoice * 2) - 1;
					char[] starArr = new char[starMaxCount];
					for (int i = 0; i < starArr.length; i++) {
						starArr[i] = ' ';		
					}	

					int startPoint;
					int addStarIndex;
					int removeStarIndex;
					for (int i =  0; i < lineChoice; i++) {
						startPoint = (starArr.length -1)/2;	// 0 1 2 3 4 -> 2
						addStarIndex = startPoint;
						starArr[addStarIndex + i] = '*';	// 2 - 3 
						starArr[addStarIndex - i] = '*';	// 2
						System.out.println(starArr);
					}	// 완성
					
				}	else if (starTypeChoice == 6) {

					System.out.printf("======================= your tpye choice : %d =======================\n", starTypeChoice);
					System.out.printf("Please enter your line number : ");
					int lineChoice = scanner.nextInt();		scanner.nextLine();
					System.out.println("=================================================================");
					
					System.out.println("========================= Type " + starTypeChoice + " : " + lineChoice + "Line =========================");
					int starMaxCount = (lineChoice * 2) - 1;
					char[] starArr = new char[starMaxCount];
					for (int i = 0; i < starArr.length; i++) {
						starArr[i] = '*';		
					}
					
					int startPoint;
					int addStarIndex;
					int removeStarIndex;
					for (int i =  lineChoice - 1; i >= 0 ; i--) {
						startPoint = (starArr.length -1)/2;
						if( i == lineChoice - 1 );
						else {
							removeStarIndex = startPoint + i + 1;		starArr[removeStarIndex] = ' ';
							removeStarIndex = startPoint - i - 1;		starArr[removeStarIndex] = ' ';
						}
						System.out.println(starArr);
					}	//완성
					
				}	else if (starTypeChoice == 7) {

					System.out.printf("======================= your tpye choice : %d =======================\n", starTypeChoice);
					System.out.printf("Please enter your line number : ");
					int lineChoice = scanner.nextInt();		scanner.nextLine();
					boolean isOdd = lineChoice % 2 == 1;
					System.out.println("=================================================================");
					

					System.out.println("========================= Type " + starTypeChoice + " : " + lineChoice + "Line =========================");	
					if (isOdd == true) {	// 11 -> 5
						
						int starMaxCount = lineChoice / 2 + 1;
						char[] starArr = new char[starMaxCount];
						for (int i = 0; i < starArr.length; i++) {
							starArr[i] = ' ';		
						}
						
						int startPoint = starArr.length;;
						int addStarIndex;
						int removeStarIndex = startPoint;
						for (int i = 0; i < lineChoice; i++) {
							if (i % lineChoice < starArr.length) {
								starArr[i] = '*';	// 0 1 2 3 4 5
							}	else {
								removeStarIndex--;
								starArr[removeStarIndex] = ' ';		// 
							}
							System.out.println(starArr);
						}
						
					}	else { 
						lineChoice = lineChoice - 1;	// System.out.println(lineChoice);
						
						int starMaxCount = lineChoice / 2 + 1;
						char[] starArr = new char[starMaxCount];
						for (int i = 0; i < starArr.length; i++) {
							starArr[i] = ' ';		
						}
						
						int startPoint;
						int addStarIndex;
						int removeStarIndex = starMaxCount;
						for (int i = 0; i < lineChoice ; i++) {
							if (i % lineChoice < starArr.length) {
								starArr[i] = '*';	// 0 1 2 3 4 5
							}	else {
								removeStarIndex--;
								starArr[removeStarIndex] = ' ';		// 
							}
							System.out.println(starArr);
						}
						System.out.println("You selected an even number for this type.");
					}
					
				}	else if (starTypeChoice == 8) {

					System.out.printf("======================= your tpye choice : %d =======================\n", starTypeChoice);
					System.out.printf("Please enter your line number : ");
					int lineChoice = scanner.nextInt();		scanner.nextLine();
					boolean isOdd = lineChoice % 2 == 1;
					System.out.println("=================================================================");
					

					System.out.println("========================= Type " + starTypeChoice + " : " + lineChoice + "Line =========================");	
					if (isOdd == true) {	// 11 -> 1
						
						int starMaxCount = lineChoice / 2 + 1; 
						char[] starArr = new char[starMaxCount];	// 11 -> 5 + 1 -> 6
						for (int i = 0; i < starArr.length; i++) {
							starArr[i] = ' ';		
						}
						
						int startIndex = starArr.length - 1;
						int addIndex = starArr.length;
						int removeIndex = 0;
						for (int i = lineChoice - 1 ; i >= 0 ; i--) {
							if (i % lineChoice >= startIndex) {	 // 10 9 8 7 6 5
								addIndex--;				// 5 4 3 2 1 0
								//System.out.println(i +" " + addStarIndex);
								starArr[addIndex] = '*';	// 5 4 3 2 1 0 
							}	else {				//	4 3 2 1 0
								// System.out.println(i +" " + removeIndex);
								starArr[removeIndex] = ' ';
								removeIndex++;// 
							}
							System.out.println(starArr);
						}
						
					}	else {
						lineChoice = lineChoice - 1;	// System.out.println(lineChoice);
						
						int starCount = lineChoice / 2 + 1; 	// 9 -> 4 + 1 ->  5
						char[] starArr = new char[starCount];	// 5
						for (int i = 0; i < starArr.length; i++) {
							starArr[i] = ' ';		
						}
						
						int startIndex = starArr.length - 1;
						int addIndex = starArr.length;
						int removeIndex = 0;
						for (int i = lineChoice -1 ; i >= 0  ; i--) {	//	9 8 7 6 5 4 3 2 1 
							if (i % lineChoice >= startIndex) { // 9 8 7 6 5 
								addIndex--;				// 4 3 2 1 0 
								//System.out.println(i +" " + removeStar);
								starArr[addIndex] = '*';	// 0 1 2 3 4 5
								
							}	else {
								//System.out.println(i +" " + removeIndex);
								starArr[removeIndex] = ' ';
								removeIndex++;
							}
							System.out.println(starArr);
						}
						System.out.println("You selected an even number for this type.");
					}	// 완성
					
				}	else if (starTypeChoice == 9) {
					System.out.printf("======================= your tpye choice : %d =======================\n", starTypeChoice);
					System.out.printf("Please enter your line number : ");
					int lineChoice = scanner.nextInt();		scanner.nextLine();
					boolean isOdd = lineChoice % 2 == 1;
					System.out.println("=================================================================");
					

					System.out.println("========================= Type " + starTypeChoice + " : " + lineChoice + "Line =========================");	
					if (isOdd == true) {	// 11 -> 1 3 5 7 9 11 9 7 5 3 1
						
						int starCount = lineChoice;
						char[] starArr = new char[starCount];	// 11
						for (int i = 0; i < starArr.length; i++) {
							starArr[i] = ' ';		
						}
						
						int startIndex = starArr.length / 2;
						int addIndex = 0;
						int removeIndex = startIndex;
						for (int i =  0; i < starArr.length; i++) {
							if(i % lineChoice <= startIndex) {		// 0 1 2 3 4 5  
								
								starArr[startIndex + addIndex] = '*';		//  5 -> 4 ~ 6 -> 3 ~ 7 -> 2 ~ 8 -> 1 ~ 9 -> 0 ~ 10 
								starArr[startIndex - addIndex] = '*';	
								addIndex++;
							} else {								// 6 7 8 9 10
								
								// System.out.println(i +" " + removeStar);	
								starArr[startIndex + removeIndex] = ' ';				// 10	9  8	7	6
								starArr[startIndex - removeIndex] = ' ';				// 0	1	2	3	4
								removeIndex--;
							}	System.out.println(starArr);
						}
						
					}	else {
						int starCount = lineChoice - 1;
						char[] starArr = new char[starCount];	// 10
						for (int i = 0; i < starArr.length; i++) {
							starArr[i] = ' ';		
						}
						
						int startIndex = starArr.length / 2;
						int addIndex = 0;
						int removeIndex = startIndex;
						for (int i =  0; i < starArr.length; i++) {
							if(i % lineChoice <= startIndex) {
								starArr[startIndex + addIndex] = '*';
								starArr[startIndex - addIndex] = '*';	
								addIndex++;
							} else {
								starArr[startIndex + removeIndex] = ' ';
								starArr[startIndex - removeIndex] = ' ';
								removeIndex--;
							}	System.out.println(starArr);
						}
						System.out.println("You selected an even number for this type.");
					}	// 완성
					
				}	else if (starTypeChoice == 10) {
					System.out.printf("======================= your tpye choice : %d =======================\n", starTypeChoice);
					System.out.printf("Please enter your line number : ");
					int lineChoice = scanner.nextInt();		scanner.nextLine();
					boolean isOdd = lineChoice % 2 == 1;
					System.out.println("=================================================================");
					
					System.out.println("========================= Type " + starTypeChoice + " : " + lineChoice + "Line =========================");	
					if (isOdd == true) {
						int starCount = lineChoice;
						char[] starArr = new char[starCount];	// 11
						for (int i = 0; i < starArr.length; i++) {
							starArr[i] = '*';		
						}
						
						int startIndex = starArr.length / 2;
						int addIndex = startIndex -1;
						int removeIndex = 0;
						for (int i =  0; i < starArr.length; i++) {
							if( i == 0 );
							else if(i % lineChoice <= starArr.length / 2 ) {
									starArr[startIndex + removeIndex] = ' ';						 
									starArr[startIndex - removeIndex] = ' ';
									removeIndex++;
							}	else {
								starArr[startIndex + addIndex] = '*';						 
								starArr[startIndex - addIndex] = '*';
								addIndex--;
							}
							System.out.println(starArr);	
						} 
					}	else {	
						int starCount = lineChoice - 1 ;
						char[] starArr = new char[starCount];	// 9
						for (int i = 0; i < starArr.length; i++) {
							starArr[i] = '*';		
						}
						
						int startIndex = starArr.length / 2;
						int addIndex = startIndex -1;
						int removeIndex = 0;
						for (int i =  0; i < starArr.length; i++) {
							if( i == 0 );
							else if(i % lineChoice <= starArr.length / 2 ) {
									starArr[startIndex + removeIndex] = ' ';						 
									starArr[startIndex - removeIndex] = ' ';
									removeIndex++;
							}	else {
								starArr[startIndex + addIndex] = '*';						 
								starArr[startIndex - addIndex] = '*';
								addIndex--;
							}
							System.out.println(starArr);	
						}
					}
					
				}	else {
					System.out.println("You have entered incorrectly. Please re-enter.");
					System.out.printf("========================= your choice : %d =========================\n", menuChoice);
					System.out.printf("Please enter your type choice : ");
					starTypeChoice = scanner.nextInt();	scanner.nextLine();
					System.out.println("=================================================================");
				}
			}	else if (menuChoice == 2) {
					
			}	else if (menuChoice == 3) {
					System.out.println("Thank you for using.");
					System.out.println("=================================================================");
				break;
					
			}	else {
				System.out.println("You have entered incorrectly. Please re-enter.");
				System.out.printf("Please enter your menu choice : ");
				menuChoice = scanner.nextInt();	scanner.nextLine();
				System.out.println("=================================================================");	
			}
		}	
		scanner.close();	
	}
}
