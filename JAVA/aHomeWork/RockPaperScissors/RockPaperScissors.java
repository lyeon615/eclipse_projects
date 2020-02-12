package RockPaperScissors;

public class RockPaperScissors implements Comparable {
	private int rps;

	RockPaperScissors(int rps) {
		this.rps = rps;
	}

	@Override
	public int compareTo(Object o) {
		RockPaperScissors comRPS = (RockPaperScissors) o;

		if (this.rps - comRPS.rps == 0)
			return 0;
		else if (this.rps - comRPS.rps == 1 || this.rps - comRPS.rps == -2)
			return 1;
		else // (this.rps - comRPS.rps == -1 || this.rps - comRPS.rps == 2)인 경우
			return -1;
	}
	
	public void result(RockPaperScissors comPRS) {
		RockPaperScissors userRPS = new RockPaperScissors(rps);
		if (userRPS.compareTo(comPRS) == 1)
			System.out.println("이겼다!");
		else if (userRPS.compareTo(comPRS) == -1)
			System.out.println("졌다..");
		else if (userRPS.compareTo(comPRS) == 0)
			System.out.println("비겼다.");
	}
}
