package factory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class PersonFactory {

	private final static int NAME_SIZE = 20;

	public static MemoryLayout createPersonLayout() {
		return MemoryLayout.structLayout(ValueLayout.JAVA_INT.withName("id"),
				MemoryLayout.sequenceLayout(NAME_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
				ValueLayout.JAVA_INT.withName("age"));
	}

	public static void newPerson(MemorySegment memorySegment, int id, String name, int age) {
		setAge(age, memorySegment);
		setId(id, memorySegment);
		setName(name, memorySegment);
	}

	private static void setName(String name, MemorySegment memorySegment) {
		byte[] nameBytes = name.getBytes();
		MemorySegment nameSegment = memorySegment.asSlice(ValueLayout.JAVA_INT.byteSize(), NAME_SIZE);
		for(int i=0; i<NAME_SIZE; i++) {
			byte value = i < nameBytes.length ? nameBytes[i] : 0;
			nameSegment.set(ValueLayout.JAVA_BYTE, i, value);
		}
		
	}

	private static void setId(int id, MemorySegment memorySegment) {
		MemorySegment nameSegment = memorySegment.asSlice(0, ValueLayout.JAVA_INT.byteSize());
		nameSegment.set(ValueLayout.JAVA_INT, 0, id);

	}

	private static void setAge(int age, MemorySegment memorySegment) {
		MemorySegment nameSegment = memorySegment.asSlice(ValueLayout.JAVA_INT.byteSize() + NAME_SIZE, ValueLayout.JAVA_INT.byteSize());
		nameSegment.set(ValueLayout.JAVA_INT, 0, age);
	}

	public static int getAge(MemorySegment memorySegment) {
		MemorySegment slice = memorySegment.asSlice(ValueLayout.JAVA_INT.byteSize() + NAME_SIZE, ValueLayout.JAVA_INT.byteSize());
		return slice.get(ValueLayout.JAVA_INT, 0);
		
	}
}
