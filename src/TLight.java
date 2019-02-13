enum TLightEnum {
	// Each instance provides its implementation to abstract method
	RED(30) {
		public TLightEnum next() {
			return GREEN;
		}
	},
	AMBER(10) {
		public TLightEnum next() {
			return RED;
		}
	},
	GREEN(30) {
		public TLightEnum next() {
			return AMBER;
		}
	};

	public abstract TLightEnum next(); // An abstract method

	private final int seconds;     // Private variable

	TLightEnum(int seconds) {          // Constructor
		this.seconds = seconds;
	}

	int getSeconds() {             // Getter
		return seconds;
	}
}

public class TLight {
	public static void main(String[] args) {
		for (TLightEnum light : TLightEnum.values()) {
			System.out.printf("%s: %d seconds, next is %s\n", light,
					light.getSeconds(), light.next());
		}
	}
}