package interfaces.music.string;

import interfaces.music.Playable;

public class Veena implements Playable {

	@Override
	public void play() {
		System.out.println("Playing Veena");
	}

}
