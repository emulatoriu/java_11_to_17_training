import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import factory.PersonFactory;

public class Application {
	public static void main(String[] args) {
		try(Arena arena = Arena.ofConfined()) {
			MemorySegment memorySegment = arena.allocate(1024);
			memorySegment.set(ValueLayout.JAVA_INT, 0, 43);
			System.out.println(memorySegment.get(ValueLayout.JAVA_INT, 0));
		}
		
		try(Arena arena = Arena.ofConfined()) {
			MemorySegment memorySegment = arena.allocate(1024);
			MemorySegment firstSegment = memorySegment.asSlice(0);
			MemorySegment secondSegment = memorySegment.asSlice(4);
			MemorySegment thirdSegment = memorySegment.asSlice(8);
			
			firstSegment.set(ValueLayout.JAVA_INT, 0, 1);
			secondSegment.set(ValueLayout.JAVA_INT, 0, 2);
			thirdSegment.set(ValueLayout.JAVA_INT, 0, 3);
			
			System.out.println(firstSegment.get(ValueLayout.JAVA_INT, 0));
			System.out.println(secondSegment.get(ValueLayout.JAVA_INT, 0));
			System.out.println(thirdSegment.get(ValueLayout.JAVA_INT, 0));
		}
		
		try(Arena arena = Arena.ofConfined()) {
			MemoryLayout memoryLayout = PersonFactory.createPersonLayout();
			MemorySegment memorySegment = arena.allocate(memoryLayout);
			PersonFactory.newPerson(memorySegment, 1, "Bob", 30);
			System.out.println(PersonFactory.getAge(memorySegment));
		}
		
	}
}
