package com.something;

import com.artemis.World;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		World world = new World();
		world.setSystem(new TestEntitySystem());
		world.initialize();
		world.process();
	}
}
