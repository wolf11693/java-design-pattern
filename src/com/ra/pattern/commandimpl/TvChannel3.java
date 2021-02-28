package com.ra.pattern.commandimpl;

import com.ra.pattern.abstractcommand.Command;
import com.ra.pattern.command.receiver.Tv;

public class TvChannel3 implements Command{

	private Tv tv;

	public TvChannel3(Tv tv) {
		this.tv = tv;
	}

	@Override
	public boolean canExecute() {
		return this.tv.isOn() ? true : false;
	}

	@Override
	public void execute() {
		if (this.canExecute()) {
			this.tv.setChannelNumber(3);
		} else {
			String stateTv = this.tv.isOn() ? "on" : "off";
			System.out.println("warning - TV " + stateTv);
		}
	}


}