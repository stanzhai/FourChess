package com.stanzhai.fourchess.logic;

/**
 * 棋盘状态
 * @author 士丹
 *
 */
public class ChessBoard {
	
	private int playerAChess;
	private int playerBChess;
	private int curPlayer;		// 保存游戏中真实的当前玩家，
	
	public int getPlayerAChess() {
		return playerAChess;
	}

	public int getCurPlayer() {
		return curPlayer;
	}

	public int getPlayerBChess() {
		return playerBChess;
	}

	public ChessBoard(int playerAChess, int playerBChess, int killedChess, int curPlayer) {
		this.playerAChess = playerAChess;
		this.playerBChess = playerBChess;
		this.curPlayer = curPlayer;
	}
	
	public int getAllChesses() {
		return this.playerAChess | this.playerBChess;
	}

}
