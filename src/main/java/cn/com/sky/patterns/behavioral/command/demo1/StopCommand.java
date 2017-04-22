package cn.com.sky.patterns.behavioral.command.demo1;

public class StopCommand implements Command {

	private AudioPlayer myAudio;

	public StopCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}

	@Override
	public void execute() {
		myAudio.stop();
	}

}