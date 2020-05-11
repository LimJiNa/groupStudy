package ex1;

public class Movie {
	
	//멤버변수
	private boolean[][] isArrSeat; //예약좌석
	
	//생성자
	Movie() {
		isArrSeat=new boolean[2][5];
		for(int i=0; i<isArrSeat.length; i++) {
			for(int j=0; j<isArrSeat[i].length; j++) {
				isArrSeat[i][j]=true;
			}
		}
	}
	
	//좌석 모두 예약 가능하기 설정
	void viewSeat() {
		for(int i=0; i<isArrSeat.length; i++) {
			for(int j=0; j<isArrSeat[i].length; j++) {
				
				if(isArrSeat[i][j]==false) {
					System.out.print("X ");
				}
				else {
					System.out.print("O ");
				}
			}
			System.out.println("");
		}
	}
	
	//입력 받은 좌석 유효성 검사 및 예약 가능 좌석 체크	
	void reservationSeat(int row,int col) {		
		if(row>=isArrSeat.length|| isArrSeat[0].length<=col || row<0 || col<0) {
			System.out.println("없는 좌석입니다");
		}else if(isArrSeat[row][col]==false) {
			System.out.println("예약된 좌석입니다");
		}else {
			isArrSeat[row][col]=false;
			System.out.println("예약이 완료되었습니다");
		}
	}
}
