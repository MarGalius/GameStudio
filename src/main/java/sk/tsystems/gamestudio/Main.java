package sk.tsystems.gamestudio;

import sk.tsystems.gamestudio.entity.Score;
import sk.tsystems.gamestudio.service.ScoreService;
import sk.tsystems.gamestudio.service.ScoreServiceJDBC;

public class Main {

	public static void main(String[] args) {
		ScoreService scoreService = new ScoreServiceJDBC();

		scoreService.addScore(new Score("Peto", "mines", 363));

		for (Score score : scoreService.getTopScores("mines")) {
			System.out.println(score.getUsername() + " " + score.getValue());
		}

	}
}