package interfaces.live;

import interfaces.music.Playable;
import interfaces.music.string.Veena;
import interfaces.music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		Veena v=new Veena();
		v.play();
		Saxophone s=new Saxophone();
		s.play();
		Playable vobj=v;
		vobj.play();
		Playable sobj=s;
		sobj.play();
		
	}

}
