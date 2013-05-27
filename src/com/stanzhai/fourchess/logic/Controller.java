package com.stanzhai.fourchess.logic;

/**
 * 游戏逻辑控制
 * @author 士丹
 *
 */
public class Controller {
	private final int[] playerChess = new int[]{ 0, 0 };
	private Player curPlayer = Player.A;
	private IGameView mGameView;
	
	public Controller(IGameView gameView, Player firstGoPlayer) {
		mGameView = gameView;
		curPlayer = firstGoPlayer;
	}
}
