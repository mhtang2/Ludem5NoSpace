package game.graphics;

import java.util.HashMap;
import java.util.Map;

public class AnimatedAll {
	
	static Map<String, AnimatedSprite> animations;
	
	public static void init() {
		animations = new HashMap<>();
		animations.put("coin", new AnimatedSprite(SpriteSheet.animatedCoin, 16, 16, 5));
	}
	
	public static void update() {
		for(String key: animations.keySet()) {
			animations.get(key).update();
		}
	}
	
	public static Sprite get(String key) {
		return animations.get(key).getSprite();
	}
}
