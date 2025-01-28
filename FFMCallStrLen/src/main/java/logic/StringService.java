package logic;

import java.lang.annotation.Native;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

public class StringService {
	public static long stringLength(String s) throws Throwable {
		try(Arena arena = Arena.ofConfined()) {
			MemorySegment nativeString = arena.allocateUtf8String(s);
			Linker linker = Linker.nativeLinker();
			SymbolLookup symbolLookup = linker.defaultLookup();
			MemorySegment strLenAddress = symbolLookup.find("strlen").get();
			FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
			
			MethodHandle strlen = linker.downcallHandle(strLenAddress, descriptor);
			return (long) strlen.invokeExact(nativeString);
		}
	}
}
