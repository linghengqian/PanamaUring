// Generated by jextract

package top.dreamlike.nativeLib.stdio;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$10 {

    static final FunctionDescriptor fwrite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fwrite$MH = RuntimeHelper.downcallHandle(
            "fwrite",
            constants$10.fwrite$FUNC
    );
    static final FunctionDescriptor fread_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fread_unlocked$MH = RuntimeHelper.downcallHandle(
            "fread_unlocked",
            constants$10.fread_unlocked$FUNC
    );
    static final FunctionDescriptor fwrite_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fwrite_unlocked$MH = RuntimeHelper.downcallHandle(
            "fwrite_unlocked",
            constants$10.fwrite_unlocked$FUNC
    );
    static final FunctionDescriptor fseek$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fseek$MH = RuntimeHelper.downcallHandle(
            "fseek",
            constants$10.fseek$FUNC
    );
    static final FunctionDescriptor ftell$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ftell$MH = RuntimeHelper.downcallHandle(
            "ftell",
            constants$10.ftell$FUNC
    );
    static final FunctionDescriptor rewind$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rewind$MH = RuntimeHelper.downcallHandle(
            "rewind",
            constants$10.rewind$FUNC
    );
}


