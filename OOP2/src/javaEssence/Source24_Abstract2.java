package javaEssence;

public abstract class Source24_Abstract2 {
	int x, y;
	
	abstract void move(int x, int y);
	void stop() {/* 멈춘다. */}
}

class Marin extends Source24_Abstract2{
	void move(int x, int y) {/*저장된 위치로 이동*/}
	void stimPack()			{/*스팀팩 사용*/       }
}

class Tank extends Source24_Abstract2{
	void move(int x, int y) {/*저장된 위치로 이동*/}
	void changeMode()		{/*공격모드를 변환*/   }
}

class Dropship extends Source24_Abstract2{
	void move(int x, int y) {/*저장된 위치로 이동*/}
	void load()				{/*선택된 대상을 태운다.*/}
	void unload()			{/*선택된 대상을 내린다.*/}
}