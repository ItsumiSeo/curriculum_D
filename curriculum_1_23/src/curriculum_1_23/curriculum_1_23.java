package curriculum_1_23;

public class curriculum_1_23 {
	private String caption = null;

	public static void main(String[] args) {
		
		curriculum_1_23 a = new curriculum_1_23();
		a.setCaption("""
				動物名：ライオン
				体長：2.1m
				速度：80km/h
				""");
		System.out.println(a);
	}
		
		public String getCaption() {
			return caption;
		}

		public void setCaption(String caption) {
			this.caption = caption;
		}
		
		@Override
		public String toString() {
			return getCaption();
		}
}
