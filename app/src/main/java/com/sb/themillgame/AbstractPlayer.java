package com.sb.themillgame;

/**
 *
 *Abstract Class Player for AI and Human Player
 */

public abstract class AbstractPlayer {
	protected Game.Color color;

	public abstract int readInt();
	public abstract boolean readYN();
	public Game.Color getColour() {return this.color;}

	public abstract int remove();
}
