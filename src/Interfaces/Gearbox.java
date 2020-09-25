package Interfaces;

public class Gearbox {

    @SuppressWarnings("unused")
	private boolean clutchIsIn;

    public void operateClutch(boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }
}
