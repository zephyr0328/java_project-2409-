package chapter11;

public class Gamemain {

	public static void main(String[] args) {
		/*
		 * PlayerLevel level=new BeginnerLevel(); level.go(3); PlayerLevel level2=new
		 * AdvacedLevel(); level2.go(2); PlayerLevel level3=new ExpertLevel();
		 * level3.go(3);
		 */

		Player player = new Player();
		player.play(2);
		AdvacedLevel aLevel=new AdvacedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		ExpertLevel bLevel = new ExpertLevel();
		player.upgradeLevel(bLevel);
		player.play(3);
		
		
	}

}
