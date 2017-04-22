package cn.com.sky.patterns.structural.adapter.obj;

public interface Job {

	void speakJapanese();

	void speakEnglish();

	/**
	 * person本身不具备的方法
	 */
	void speakFrench();

}
