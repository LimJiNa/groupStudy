package ex1;

public class Movie {
	
	//�������
	private boolean[][] isArrSeat; //�����¼�
	
	//������
	Movie() {
		isArrSeat=new boolean[2][5];
		for(int i=0; i<isArrSeat.length; i++) {
			for(int j=0; j<isArrSeat[i].length; j++) {
				isArrSeat[i][j]=true;
			}
		}
	}
	
	//�¼� ��� ���� �����ϱ� ����
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
	
	//�Է� ���� �¼� ��ȿ�� �˻� �� ���� ���� �¼� üũ	
	void reservationSeat(int row,int col) {		
		if(row>=isArrSeat.length|| isArrSeat[0].length<=col || row<0 || col<0) {
			System.out.println("���� �¼��Դϴ�");
		}else if(isArrSeat[row][col]==false) {
			System.out.println("����� �¼��Դϴ�");
		}else {
			isArrSeat[row][col]=false;
			System.out.println("������ �Ϸ�Ǿ����ϴ�");
		}
	}
}
