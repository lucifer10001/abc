abstract class MediaItem{
	private int runTime;

	public MediaItem(int runTime) {
		super();
		this.runTime = runTime;
	}
	public int getRunTime() {
		return runTime;
	}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	public boolean equals(Object obj){
	if(obj == null)
		return false;
	MediaItem otherMediaItem = (MediaItem) obj;
		return super.equals(otherMediaItem) && runTime == otherMediaItem.runTime;
	}
	@Override
	public String toString() {
		return "MediaItem [runTime=" + runTime + "]";
	}
	
}

